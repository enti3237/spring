package kr.co.jcinema.admin.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminTheaterDAO {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public void selectTheaters(){}


}
