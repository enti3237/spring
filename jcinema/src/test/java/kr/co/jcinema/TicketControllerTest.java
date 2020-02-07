package kr.co.jcinema;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.jcinema.Service.TicketService;
import kr.co.jcinema.admin.vo.AdminTicketVO;
import kr.co.jcinema.vo.SeatVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-context-test.xml"})
public class TicketControllerTest {
	
	@Inject
	private TicketService service;

	@Test
	@GetMapping("/ticketing/choice-seat")
	public String choiceSeat(AdminTicketVO vo, Model model) {
		
		List<List<SeatVO>> totalSeatList = service.selectSeat(vo);
		model.addAttribute("totalSeatList", totalSeatList);

		return "/ticketing/choice-seat";
	}

}
