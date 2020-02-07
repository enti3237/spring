package kr.co.sboard.dao;

import java.util.List;

import javax.inject.Inject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;

	public void insertUser(MemberVO vo) {
		mybatis.insert("mapper.sql.INSERT_USER", vo);		
	}
	


}
