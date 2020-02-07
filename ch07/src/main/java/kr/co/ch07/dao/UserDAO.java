package kr.co.ch07.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch07.mapper.UserRowMapper;
import kr.co.ch07.vo.UserVO;

@Repository
public class UserDAO {
	
	@Inject
	private JdbcTemplate jdbc;

	// 이게 로그인 1~5단계 전부 끝난 거!!
	// insertUser는 리턴값을 받아올 필요 없으므로 void
	public void insertUser(UserVO vo) {
		
		Object[] values = {vo.getCustid(), vo.getName(), vo.getAddress(), vo.getPhone()};
		String sql = "INSERT INTO `Customer` VALUES (?, ?, ?, ?)";
		jdbc.update(sql, values);
		
	}
	
	// selectUsers는 유저정보를 받아와야하므로 void가 아니라 리턴값인 List<>	
	public List<UserVO> selectUsers() {
		
		/*
		 * List<UserVO> users = jdbc.query("SELECT * FROM `Customer`", new UserRowMapper()); 
		 * return users;
		 */
		
		return jdbc.query("SELECT * FROM `Customer`", new UserRowMapper());
		
	}


}
