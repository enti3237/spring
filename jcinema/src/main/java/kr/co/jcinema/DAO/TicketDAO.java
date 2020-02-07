package kr.co.jcinema.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminTicketVO;
import kr.co.jcinema.vo.SeatVO;

@Repository
public class TicketDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public AdminTicketVO choiceSeat(AdminTicketVO vo) {
		return mybatis.selectOne("mapper.sql_seat.SELECT_SEAT", vo);
	}
	
	public List<SeatVO> selectSeat(AdminTicketVO vo) {
		
		List<SeatVO> list = mybatis.selectList("mapper.sql_seat.SELECT_SEAT", vo);
		
		return list;
		
	}
	
}
