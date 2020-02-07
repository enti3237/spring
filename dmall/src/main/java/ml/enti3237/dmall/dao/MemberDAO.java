package ml.enti3237.dmall.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import ml.enti3237.dmall.vo.MemberVO;

@Repository
public class MemberDAO {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertMember(MemberVO vo) {
		mybatis.insert("mapper.sql_member.INSERT_MEMBER", vo);
	}
	
	public MemberVO selectMember(MemberVO vo) {
		
		return mybatis.selectOne("mapper.sql_member.SELECT_MEMBER", vo);		
	}
	
	public void updateMember() {}
	public void deleteMember() {}
	
}
