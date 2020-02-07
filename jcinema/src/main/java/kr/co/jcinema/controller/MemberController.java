package kr.co.jcinema.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.jcinema.Service.MemberService;
import kr.co.jcinema.vo.MemberVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping("/member/login")
	public String login(String uid, String pass, HttpSession session) {
				
		MemberVO member = service.selectMember(uid, pass);		
		
		 if(member == null) { 
			 return "redirect:/member/register"; 
			 
		 } else {
			 session.setAttribute("member", member); 
			 return "redirect:/index"; 
			 
		 }
	}

	
	@GetMapping("/member/my-cinema")
	public String myCinema() {
		return "/member/my-cinema";
	}
	
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	
	
}
