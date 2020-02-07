package kr.co.jcinema;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.jcinema.admin.vo.AdminMovieScheduleVO;
import kr.co.jcinema.admin.vo.AdminMovieVO;
import kr.co.jcinema.api.dao.ApiDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-context-test.xml"})
public class ApiDaoTest {
	
	@Inject
	private ApiDAO dao;

	@Test
	public void test() {
		
		AdminMovieScheduleVO vo = new AdminMovieScheduleVO();
		vo.setSchedule_theater_no(125);
		vo.setSchedule_date("2020-02-07");
		
		List<AdminMovieVO> movies = dao.selectMovies(vo);
		
		System.out.println(movies);
	}

}
