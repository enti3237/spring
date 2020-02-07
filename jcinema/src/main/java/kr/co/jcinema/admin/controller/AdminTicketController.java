package kr.co.jcinema.admin.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.jcinema.admin.service.AdminTicketService;
import kr.co.jcinema.admin.vo.AdminGenerateVO;
import kr.co.jcinema.admin.vo.AdminTicketVO;
import kr.co.jcinema.api.vo.APITicketVO;

@Controller
public class AdminTicketController {
	
	@Autowired
	AdminTicketService service;
	
	@GetMapping("/admin/ticket/generate")
	public String generate() {
		return "/admin/ticket/generate";
	}

	@PostMapping("/admin/ticket/generate")
	public String generate(AdminGenerateVO vo) {
		
		List<AdminTicketVO> tickets = service.createTicket(vo);
		service.insertTickets(tickets);
		
		return "/admin/ticket/generate";
	}
	


}
