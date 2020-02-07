package kr.co.springboard.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.springboard.vo.MemberVO;
import kr.co.springboard.vo.TermsVO;

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
	
	public void selectMembers() {}
	public void updateMember() {}
	public void deleteMember() {}
	
	public TermsVO selectTerms() {
		return mybatis.selectOne("mapper.sql_member.SELECT_TERMS");
	}
	
	//결과값이 0 or 1로 돌아오기 때문에 public int
	public int selectUidCount(String uid) {
		return mybatis.selectOne("mapper.sql_member.SELECT_UID_COUNT", uid);
	}
	
}
