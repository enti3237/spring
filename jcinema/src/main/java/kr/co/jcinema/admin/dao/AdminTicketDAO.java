package kr.co.jcinema.admin.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminTicketVO;

@Repository
public class AdminTicketDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertTicket(AdminTicketVO vo) {
		mybatis.insert("mapper.sql_ticket.INSERT_TICKET", vo);
	}

	public AdminTicketVO selectTicket() {
		return null;
	}
	
	public List<AdminTicketVO> selectTickets() {
		return null;
	}
	
	public void updateTicket() {}
	public void deleteTicket() {}
	

}
