package ml.enti3237.dmall.admin.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ml.enti3237.dmall.admin.service.AdminMemberService;
import ml.enti3237.dmall.vo.MemberVO;

@Controller
public class AdminMemberController {
	
	@Inject
	private AdminMemberService service;
	
	@GetMapping("/admin/member/list")
	public String memberList(Model model) {
		List<MemberVO> members = service.selectMembers();
		model.addAttribute("members", members);
		
		return "/admin/member/list";
	}
	
	


}
