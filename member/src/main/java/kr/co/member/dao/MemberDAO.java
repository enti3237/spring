package kr.co.member.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.member.vo.MemberVO;

@Repository
public class MemberDAO {
	
	//데이터베이스 로그인과정 1~3, 6을 처리함. 4, 5는 이하 메소드가 처리.
	@Inject
	private SqlSessionTemplate mybatis;

	//회원가입용 쿼리문
	public void insertMember(MemberVO vo) {
		mybatis.insert("mapper.sql.INSERT_MEMBER", vo);
	}
	
	//리스트 출력을 위한 전체 멤버 데이터 추출
	public List<MemberVO> selectMembers() {
		List<MemberVO> members = mybatis.selectList("mapper.sql.SELECT_MEMBERS");
		return members;
	}

	//회원정보 수정 과정 1 - uid로 지정한 회원정보를 꺼낸다.
	public MemberVO selectMember(String uid) {
		return mybatis.selectOne("mapper.sql.SELECT_MEMBER", uid);
	}
	
	//회원정보 수정 과정 2 - 수정된 회원정보를 업데이트
	public void updateMember(MemberVO vo) {
		mybatis.update("mapper.sql.UPDATE_MEMBER", vo);
	}

	//회원정보 삭제 - uid로 지정한 회원정보를 꺼내서 삭제한다
	public void deleteMember(String uid) {
		mybatis.delete("mapper.sql.DELETE_MEMBER", uid);
	}

}














