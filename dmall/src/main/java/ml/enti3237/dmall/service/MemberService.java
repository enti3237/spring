package ml.enti3237.dmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.enti3237.dmall.dao.MemberDAO;
import ml.enti3237.dmall.vo.MemberVO;

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
	
	public void updateMember() {}
	public void deleteMember() {}
	

}
