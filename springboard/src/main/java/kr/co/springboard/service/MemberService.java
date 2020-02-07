package kr.co.springboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.springboard.dao.MemberDAO;
import kr.co.springboard.vo.MemberVO;
import kr.co.springboard.vo.TermsVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;

	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);
	}

	public MemberVO selectMember(MemberVO vo) {
		return dao.selectMember(vo);
	}
	
	public void selectMembers() {}
	public void updateMember() {}
	public void deleteMember() {}
	
	public TermsVO selectTerms() {
		return dao.selectTerms();
	}

	public int selectUidCount(String uid) {
		return dao.selectUidCount(uid);
	}

}
