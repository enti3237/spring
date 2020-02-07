package kr.co.jcinema.admin.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import kr.co.jcinema.admin.dao.AdminMovieDAO;
import kr.co.jcinema.admin.vo.AdminMovieScheduleVO;
import kr.co.jcinema.admin.vo.AdminMovieVO;

@Service
public class AdminMovieService {
	
	@Inject
	private AdminMovieDAO dao;
	
	public void insertMovie(AdminMovieVO vo) {
		dao.insertMovie(vo);
	}

	public void selectMovie() {}
	public void selectMovies() {}
	public void updateMovie() {}
	public void deleteMovie() {}
	

	public void insertMovieSchedule(AdminMovieScheduleVO vo) {
		dao.insertMovieSchedule(vo);
	}
	
}
