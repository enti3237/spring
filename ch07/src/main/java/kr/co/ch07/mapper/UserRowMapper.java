package kr.co.ch07.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.co.ch07.vo.UserVO;

public class UserRowMapper implements RowMapper<UserVO>{

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		UserVO vo = new UserVO();
		vo.setCustid(rs.getString(1));
		vo.setName(rs.getString(2));
		vo.setAddress(rs.getString(3));
		vo.setPhone(rs.getString(4));
		
		return vo;
	}

}
