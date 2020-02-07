package kr.co.jcinema.Service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.jcinema.DAO.TicketDAO;
import kr.co.jcinema.admin.vo.AdminTicketVO;
import kr.co.jcinema.vo.SeatVO;

@Service
public class TicketService {

	@Inject
	private TicketDAO dao;
	
	public List<List<SeatVO>> selectSeat(AdminTicketVO vo) {
		
		List<List<SeatVO>> totalList = new ArrayList<List<SeatVO>>();

		List<SeatVO> seatList = dao.selectSeat(vo);

		totalList.add(seatList.subList(0, 10));
		totalList.add(seatList.subList(10, 20));
		totalList.add(seatList.subList(20, 30));
		totalList.add(seatList.subList(30, 40));
		totalList.add(seatList.subList(40, 50));
		totalList.add(seatList.subList(50, 60));
		totalList.add(seatList.subList(60, 70));
		totalList.add(seatList.subList(70, 80));

		return totalList;
	}
	
	
	
}
