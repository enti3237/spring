package kr.co.member.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.member.service.MemberService;
import kr.co.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	//회원등록페이지 연결하기
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}

	//회원등록페이지에서 입력한 정보를 vo에 담아서 MemberService로 넘기기
	@PostMapping("/member/register")
	public String register(MemberVO vo) {
		
		service.insertMember(vo);
		
		return "redirect:/member/list";
	}

	//배열인 List 객체 members에 담을 데이터를 찾아 MemberService로 이동
	//받아온 파라미터 값을 Model 객체에 담아 뷰로 넘긴다
	@RequestMapping("/member/list")
	public String list(Model model) {
		List<MemberVO> members = service.selectMembers();
		
		model.addAttribute("members", members);
		
		return "/member/list";
	}
	
	//수정할 데이터의 uid 값을 String으로 받아와서 MemberService로 이동
	//받아온 파라미터 값을 Model 객체에 담아 뷰로 넘긴다
	@RequestMapping(value="/member/modify", method=RequestMethod.GET)
	public String modify(String uid, Model model) {
		MemberVO member = service.selectMember(uid);
		model.addAttribute("member", member);
		return "/member/modify";
	}
	
	//modify.jsp에서 넘어온 데이터를 vo 객체에 담아 MemberService로 넘긴다.
	@RequestMapping(value="/member/modify", method=RequestMethod.POST)
	public String modify(MemberVO vo) {
		service.updateMember(vo);
		return "redirect:/member/list";
	}

	//삭제할 데이터의 uid 값을 String으로 받아와서 MemberService로 이동
	@RequestMapping("/member/delete")
	public String delete(String uid) {
		service.deleteMember(uid);
		return "redirect:/member/list";
	}
	
	
}












