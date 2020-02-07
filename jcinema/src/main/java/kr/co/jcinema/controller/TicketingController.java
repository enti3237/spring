package kr.co.jcinema.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.jcinema.Service.TicketService;
import kr.co.jcinema.admin.vo.AdminTicketVO;
import kr.co.jcinema.vo.SeatVO;

@Controller
public class TicketingController {
	
	@Inject
	private TicketService service;
	
	@GetMapping("/ticketing/choice-movie")
	public String choichMovie() {
		return "/ticketing/choice-movie";
	}

	@GetMapping("/ticketing/choice-seat")
	public String choiceSeat(AdminTicketVO vo, Model model) {
		
		List<List<SeatVO>> totalSeatList = service.selectSeat(vo);
		model.addAttribute("totalSeatList", totalSeatList);

		return "/ticketing/choice-seat";
	}

	
	@GetMapping("/ticketing/order-confirm")
	public String orderConfirm() {
		return "/ticketing/order-confirm";
	}

	@GetMapping("/ticketing/order-result")
	public String orderResult() {
		return "/ticketing/order-result";
	}

	
	public void getTheater() {
		
	}
	
}
