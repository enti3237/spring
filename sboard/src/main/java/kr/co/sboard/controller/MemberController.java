package kr.co.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/member/login")
	public String login() {
		return "/member/login";
	}

	@RequestMapping("/member/register")
	public String register() {
		return "/member/register";	
	}
	
	@RequestMapping("/member/terms")
	public String terms() {
		return "/member/terms";
	}
	
	

}
