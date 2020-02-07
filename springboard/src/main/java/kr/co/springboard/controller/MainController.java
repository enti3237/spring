package kr.co.springboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.springboard.vo.MemberVO;

@Controller
public class MainController {
	
	@GetMapping(value= {"/", "/index"})
	public String index(HttpSession session) {
		
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		if(member==null) {
			// 로그인을 안했으면
			return "/member/login";
			//로그인을 했으면
		} else {
			return "/list";
		}
	}
}
