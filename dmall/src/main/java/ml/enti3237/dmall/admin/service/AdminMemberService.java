package ml.enti3237.dmall.admin.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ml.enti3237.dmall.admin.dao.AdminMemberDAO;
import ml.enti3237.dmall.vo.MemberVO;

@Service
public class AdminMemberService {
	
	@Inject
	private AdminMemberDAO dao;
	
	public void insertMember() {}
	public void selectMember() {}
	
	public List<MemberVO> selectMembers() {
		return dao.selectMembers();
	}
	
	public void updateMember() {}
	public void deleteMember() {}


}
