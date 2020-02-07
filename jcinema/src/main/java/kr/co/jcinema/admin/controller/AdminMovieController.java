package kr.co.jcinema.admin.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.jcinema.admin.service.AdminMovieService;
import kr.co.jcinema.admin.vo.AdminMovieScheduleVO;
import kr.co.jcinema.admin.vo.AdminMovieVO;

@Controller
public class AdminMovieController {
	
	@Inject
	private AdminMovieService service;
	
	@GetMapping("/admin/movie/register")
	public String register() {
		return "/admin/movie/register";
	}
	
	@PostMapping("/admin/movie/register")
	public String register(AdminMovieVO vo) {
		
		service.insertMovie(vo);
		return "redirect:/admin/movie/register";
	}
	
	
	
	
	@GetMapping("/admin/movie/schedule")
	public String schedule() {
		return "/admin/movie/schedule";
	}

	
	@PostMapping("/admin/movie/schedule")
	public String schedule(AdminMovieScheduleVO vo) {
		service.insertMovieSchedule(vo);
		return "redirect:/admin/movie/schedule";
	}
	
}
