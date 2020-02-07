package ml.enti3237.dmall.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ml.enti3237.dmall.service.MemberService;
import ml.enti3237.dmall.vo.MemberVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@GetMapping("/member/join_input")
	public String joinInput() {
		return "/member/join_input";
	}

	@PostMapping("/member/join_input")
	public String joinInput(MemberVO vo, HttpServletRequest req) {
		
//		System.out.println("이름"+vo.getName());
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		service.insertMember(vo);
		
		return "redirect:/member/login";
	}

	
	@GetMapping("/member/join_select")
	public String joinSelect() {
		return "/member/join_select";
	}

	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}

	@PostMapping("/member/login")
	public String login(MemberVO vo, HttpSession session) {
		MemberVO member = service.selectMember(vo);
		
		if(member==null) {
			//회원이 아닐 경우
			return "redirect:/member/login";
		} else {
			//회원일 경우 세션 처리 - 상단에 HttpSession 처리
			session.setAttribute("member", member);
			return "redirect:/index";			
		}
	}
	
	//로그아웃은 세션만 지워주면 됨
	@GetMapping("/member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/index";
	}

}
