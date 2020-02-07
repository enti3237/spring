package kr.co.jcinema.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminMovieScheduleVO;
import kr.co.jcinema.admin.vo.AdminMovieVO;

@Repository
public class AdminMovieDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertMovie(AdminMovieVO vo) {
		mybatis.insert("mapper.sql_movie.INSERT_MOVIE", vo);
	}
	
	public void selectMovie() {}
	public void selectMovies() {}
	public void updateMovie() {}
	public void deleteMovie() {}
	
	
	
	
	public void insertMovieSchedule(AdminMovieScheduleVO vo) {
		mybatis.insert("mapper.sql_movie.INSERT_MOVIE_SCHEDULE", vo);
	}
	
	

}
