package kr.co.ch06;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<BookVO>{

	@Override
	public BookVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BookVO vo = new BookVO();
		
		vo.setBookid(rs.getString(1));
		vo.setBookname(rs.getString(2));
		vo.setPublisher(rs.getString(3));
		vo.setPrice(rs.getString(4));
		
		return vo;
	}
	
	

}
