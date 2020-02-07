package kr.co.ch08.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ch08.service.UserService;
import kr.co.ch08.vo.UserVO;

@Controller
public class UserController {
	
	@Inject
	private UserService service;

	//레지스터로 단순 페이지 이동
	@GetMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	//레지스터에서 submit 클릭
	@PostMapping("/user/register")
	public String register(UserVO vo) {
		service.insertUser(vo);		
		return "redirect:/user/list";
	}
	
	//리스트로 이동 - 모델 객체에 리스트를 집어넣어서 그것을 users로 저장한다
	@RequestMapping("/user/list")
	public String list(Model model) {
		
		List<UserVO> users = service.selectUsers();
		model.addAttribute("users", users);
		
		return "/user/list";
	}
	
	//수정하기 1차 - list에서 수정하기를 눌렀을 때 같이 넘어온 custid에 반응하여 데이터를 검색하고 모델객체에 저장한 후 modify 페이지를 출력한다
	@RequestMapping(value="/user/modify", method=RequestMethod.GET)
	public String modify(String custid, Model model) {
		
		UserVO user = service.selectUser(custid);
		model.addAttribute("user", user);
		
		return "/user/modify";
	}
	
	//수정하기 2차 - 출력된 modify 페이지에서 재입력된 데이터가 post로 넘어오면 그것을 받아 업데이트한다.
	@RequestMapping(value="/user/modify", method=RequestMethod.POST)
	public String modify(UserVO vo) {
		service.updateUser(vo);
		return "redirect:/user/list";
	}
	
	//삭제하기 - list에서 삭제하기를 눌렀을 때 같이 넘어온 custid에 반응하여 데이터를 삭제한 후 list를 재출력
	@RequestMapping("/user/delete")
	public String delete(String custid) {
		service.deleteUser(custid);
		return "redirect:/user/list";
	}

}
