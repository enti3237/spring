package kr.co.jcinema.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jcinema.DAO.MemberDAO;
import kr.co.jcinema.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	
	public void insertMember() {}
	
	// VO 객체의 변수명과 일치하지 않으므로 개별로 집어넣어주기 - 그냥 jsp 내부 name을 변경하는 게 훨 편하겠다
	public MemberVO selectMember(String uid, String pass) {
		
		MemberVO vo = new MemberVO();
		vo.setUser_id(uid);
		vo.setUser_pass(pass);
		
		return dao.selectMember(vo);
	}
	
	public void updateMember() {}
	
	public void deleteMember() {}


}
