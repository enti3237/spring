package kr.co.springboard.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import kr.co.springboard.service.MemberService;
import kr.co.springboard.vo.MemberVO;
import kr.co.springboard.vo.TermsVO;

@Controller
public class MemberController {

	@Inject
	private MemberService service;
	
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
			return "redirect:/list";			
		}
	}
	
	//로그아웃은 세션만 지워주면 됨
	@GetMapping("/member/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/member/login";
	}
	
	//받아온 vo 데이터를 model에 넣어서 출력하는 걸 잊지 말기
	@GetMapping("/member/terms")
	public String terms(Model model) {
		TermsVO vo = service.selectTerms();
		model.addAttribute("vo", vo);
		return "/member/terms";
	}
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}

	@PostMapping("/member/register")
	public String register(MemberVO vo, HttpServletRequest req) {
		
		//아이피 검출용 
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		
		service.insertMember(vo);
		return "redirect:/member/login";
	}
	
	
	//아이디 중복체크
	//@ResponseBody: 출력결과를 View 페이지포워드로 실행하지 않고 바로 데이터를 response 처리. -이게 없으면 결과값이 1 or 0.jsp로 출력되어버림. 
	//JsonObject 처리가 없으면 결과값이 웹페이지에 0, 1로 출력 - 있으면 {"result":0} 으로 출력
	@ResponseBody
	@GetMapping("/member/checkUid")
	public String checkUid(String uid) {

		int result = service.selectUidCount(uid);

		JsonObject obj = new JsonObject();
		obj.addProperty("result", result);
		
		String json = new Gson().toJson(obj);

		return json;		
//		return new Gson().toJson(result);

	}

}
