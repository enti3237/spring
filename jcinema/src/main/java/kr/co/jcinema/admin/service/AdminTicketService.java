package kr.co.jcinema.admin.service;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import kr.co.jcinema.admin.dao.AdminTicketDAO;
import kr.co.jcinema.admin.vo.AdminGenerateVO;
import kr.co.jcinema.admin.vo.AdminTicketVO;

@Service
public class AdminTicketService {

	@Inject
	private AdminTicketDAO dao;
	
	public void insertTicket(AdminTicketVO vo) {
		dao.insertTicket(vo);	
	}

	public void insertTickets(List<AdminTicketVO> tickets) {
		
		for(AdminTicketVO ticket : tickets) {
			dao.insertTicket(ticket);	
			}
	}

	public AdminTicketVO selectTicket() {
		return dao.selectTicket();
	}
	
	public List<AdminTicketVO> selectTickets() {
		return dao.selectTickets();
	}
	
	public void updateTicket() {
		dao.updateTicket();
	}
	
	public void deleteTicket() {
		dao.deleteTicket();
	}

	
	public List<AdminTicketVO> createTicket(AdminGenerateVO vo) {
		
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		String ticketNo = vo.getTheater_no() 
						+ vo.getScreen_no()
						+ vo.getMovie_no()
						+ vo.getMovie_date().substring(2).replace("-", "")
						+ vo.getRound_view();

		List<AdminTicketVO> tickets = new ArrayList<AdminTicketVO>();

		for(int row=1 ; row <= alphabet.length ; row++) {
			for(int col=1 ; col <=10 ; col++) {
				
				AdminTicketVO ticket = new AdminTicketVO();
				ticket.setTicket_no(ticketNo+row+col);
				ticket.setTicket_movie_no(vo.getMovie_no());
				ticket.setTicket_movie_date(vo.getMovie_date());
				ticket.setTicket_round_view(vo.getRound_view());
				ticket.setTicket_theater_no(vo.getTheater_no());
				ticket.setTicket_screen_no(vo.getScreen_no());
				ticket.setTicket_seat(alphabet[row-1]+""+col);
				ticket.setTicket_price(vo.getPrice());

				tickets.add(ticket);
				
			}
		}
		
		return tickets;
		
	}
	
	
}
