package kr.co.sboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.MemberDAO;
import kr.co.sboard.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	
	public void insertUser(MemberVO vo) {
		
	}
	
	

}
