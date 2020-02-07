package kr.co.jcinema;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.jcinema.DAO.TicketDAO;
import kr.co.jcinema.admin.vo.AdminTicketVO;
import kr.co.jcinema.vo.SeatVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-context-test.xml"})
public class TicketTestDao {
	
	@Inject
	private TicketDAO dao;
	
	//다른 걸 테스트하고 싶으면 어노테이션 위치를 바꿔준다 
	
	public void getSeat() {
		
		AdminTicketVO vo = new AdminTicketVO();
		vo.setSeat_theater_no(125);
		vo.setSeat_screen_no(1);
		vo.setTicket_screen_no(1);
		vo.setTicket_movie_date("2020-02-07");
		vo.setTicket_movie_no(58);
		vo.setTicket_round_view("1");
		
		List<SeatVO> list = dao.selectSeat(vo);
		
		System.out.println("list: "+list);

		
	}
	
	
	@Test
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
