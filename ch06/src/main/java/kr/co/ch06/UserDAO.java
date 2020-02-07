package kr.co.ch06;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Inject
	private JdbcTemplate jdbc;
	
	public void insertUser() {
		
		String sql = "INSERT INTO `Customer` VALUES (?, ?, ?, ?)";
		Object[] values = {"5", "박세리", "대한민국 대전", "000-9513-7531"}; 
		
		jdbc.update(sql, values);
		
	}
	
	public UserVO selectUser(String custid) {
		
		String sql = "SELECT * FROM `Customer` WHERE `custid`=?";
		UserVO user= jdbc.queryForObject(sql, new UserRowMapper(), custid);
		
		return user;
		
	}
	
	public List<UserVO> selectUsers() {
		
		String sql = "SELECT * FROM `Customer`";
		List<UserVO> users = jdbc.query(sql, new UserRowMapper());

		return users;
		
	}
	
	public List<BookVO> selectBooks() {

		String sql = "SELECT * FROM `Book`";
		List<BookVO> books = jdbc.query(sql, new BookRowMapper());
		return books;

	}
	
	//RowMapper을 만들 필요가 없다
	public List<Map<String, Object>> selectBooksMap() {
		
		String sql = "SELECT * FROM `Book`";
		List<Map<String, Object>> books = jdbc.queryForList(sql);
		
		return books;
		
	}
	
	
	public void updateUser() {
		
		String sql = "UPDATE `Customer` SET `name` = ? WHERE `custid` = ?";
		Object[] values = {"이지영", "6"}; 
		
		jdbc.update(sql, values);
		
	}

	public void deleteUser() {
		
		jdbc.update("DELETE FROM `Customer` WHERE `name`=?", "박세리");
		
	}

}
