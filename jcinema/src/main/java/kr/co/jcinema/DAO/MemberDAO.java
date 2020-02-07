package kr.co.jcinema.DAO;

import javax.inject.Inject;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertMember() {}

	public MemberVO selectMember(MemberVO vo) {
		
		return mybatis.selectOne("mapper.sql_member.SELECT_MEMBER", vo);
	}
	
	public void updateMember() {}
	
	public void deleteMember() {}

}
