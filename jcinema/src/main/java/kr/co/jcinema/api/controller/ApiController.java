package kr.co.jcinema.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import kr.co.jcinema.admin.vo.AdminMovieScheduleVO;
import kr.co.jcinema.admin.vo.AdminMovieVO;
import kr.co.jcinema.api.service.ApiService;
import kr.co.jcinema.api.vo.ApiTheaterVO;

@Controller
public class ApiController {
	
	@Inject
	private ApiService service;
	
	@GetMapping(value="/api/theaters", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getTheaters() {
		
		Map<String, List<ApiTheaterVO>> theaters = service.selectTheaters();
		return new Gson().toJson(theaters);
		
	}
	
	@GetMapping(value="/api/movies", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovieTitles(String title) {
		List<AdminMovieVO> movies = service.selectMovies(title);
		return new Gson().toJson(movies);
	}
	
	@GetMapping(value="/api/movie-schedule", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovieSchedule(AdminMovieScheduleVO vo) {
		AdminMovieScheduleVO movieSchedule = service.selectMovieSchedule(vo);
		return new Gson().toJson(movieSchedule);
	}
	

	@GetMapping(value="/api/movies-roundview", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovieRoundView(AdminMovieScheduleVO vo) {

		List<AdminMovieScheduleVO> movieSchedules = service.selectMovieRoundView(vo);
		List<List<AdminMovieScheduleVO>> movieSchedulesList = new ArrayList<List<AdminMovieScheduleVO>>();
		movieSchedulesList.add(movieSchedules);
		return new Gson().toJson(movieSchedulesList);
	}
	
	
	
	// String theater_no 지만 변수를 int로 바꾸면 스프링이 알아서 바꿔줌!!!
	@GetMapping(value="/api/movies-list", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovies(int theater_no, String schedule_date) {

		AdminMovieScheduleVO vo = new AdminMovieScheduleVO();
		vo.setSchedule_theater_no(theater_no);
		vo.setSchedule_date(schedule_date);

		List<AdminMovieVO> movies =service.selectMovies(vo);
		
		return new Gson().toJson(movies);

	}
	
	


}
