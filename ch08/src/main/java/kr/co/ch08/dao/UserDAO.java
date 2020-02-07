package kr.co.ch08.dao;

import java.util.List;

import javax.inject.Inject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.UserVO;

@Repository
public class UserDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;

	public void insertUser(UserVO vo) {
		mybatis.insert("mapper.sql.INSERT_USER", vo);		
	}
	
	public List<UserVO> selectUsers() {

//		List<UserVO> users = mybatis.selectList("mapper.sql.SELECT_USERS");
//		return users;
		
		return mybatis.selectList("mapper.sql.SELECT_USERS");
	}
	
	// selectUser - updateUser 까지 수정과정임
	public UserVO selectUser(String custid) {
		return mybatis.selectOne("mapper.sql.SELECT_USER", custid);
	}
	
	public void updateUser(UserVO vo) {
		mybatis.update("mapper.sql.UPDATE_USER", vo);
	}
	
	public void deleteUser(String custid) {
		mybatis.delete("mapper.sql.DELETE_USER", custid);
	}


}
