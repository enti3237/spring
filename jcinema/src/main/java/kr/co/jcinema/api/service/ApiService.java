package kr.co.jcinema.api.service;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

import kr.co.jcinema.admin.vo.AdminMovieScheduleVO;
import kr.co.jcinema.admin.vo.AdminMovieVO;
import kr.co.jcinema.api.dao.ApiDAO;
import kr.co.jcinema.api.vo.ApiTheaterVO;

@Service
public class ApiService {
	
	@Inject
	private ApiDAO dao;
	
	public void insertTheater() {	}
	
	public ApiTheaterVO selectTheater() {
		return null;
	}

	public Map<String, List<ApiTheaterVO>> selectTheaters() {
		return dao.selectTheaters();
	}
	
	public void updateTheater() {	}
	
	public void deleteTheater() {	}
	
	
	public List<AdminMovieVO> selectMovies(AdminMovieScheduleVO vo) {
		return dao.selectMovies(vo);
	}
	
	public List<AdminMovieScheduleVO> selectMovieRoundView(AdminMovieScheduleVO vo) {
		return dao.selectMovieRoundView(vo);
	}
	
	public List<AdminMovieVO> selectMovies(String title) {
		return dao.selectMovies(title);
	}
	
	public AdminMovieScheduleVO selectMovieSchedule(AdminMovieScheduleVO vo) {
		return dao.selectMovieSchedule(vo);
	}
		
		
}
