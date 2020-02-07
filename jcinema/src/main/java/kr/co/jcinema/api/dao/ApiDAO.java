package kr.co.jcinema.api.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminMovieScheduleVO;
import kr.co.jcinema.admin.vo.AdminMovieVO;
import kr.co.jcinema.api.vo.ApiTheaterVO;

@Repository
public class ApiDAO {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertTheater() {}
	
	public ApiTheaterVO selectTheater() {
		return null;
	}
	
	public Map<String, List<ApiTheaterVO>> selectTheaters() {
		
		Map<String, List<ApiTheaterVO>> map = new HashMap<String, List<ApiTheaterVO>>();
		map.put("강원", selectTheaters("강원"));
		map.put("경기/인천", selectTheaters("경기/인천"));
		map.put("경남/부산/울산", selectTheaters("경남/부산/울산"));
		map.put("경북/대구", selectTheaters("경북/대구"));
		map.put("서울", selectTheaters("서울"));
		map.put("전라/광주", selectTheaters("전라/광주"));
		map.put("충청/대전", selectTheaters("충청/대전"));
		
		return map;
	}
	
	public List<ApiTheaterVO> selectTheaters(String city) {
		return mybatis.selectList("mapper.sql_theater.SELECT_THEATERS", city);
	}
	
	public void updateTheater() {}
	public void deleteTheater() {}

	//받아올 데이터는 AdminMovieScheduleVO지만 출력할 데이터는 AdminMovieVO
	public List<AdminMovieVO> selectMovies(AdminMovieScheduleVO vo) {
		return mybatis.selectList("mapper.sql_movie.SELECT_MOVIES_BY_THEARTER", vo);
	}
	
	public List<AdminMovieVO> selectMovies(String title) {
		return mybatis.selectList("mapper.sql_movie.SELECT_MOVIES", title);
	}
	

	public AdminMovieScheduleVO selectMovieSchedule(AdminMovieScheduleVO vo) {
		return mybatis.selectOne("mapper.sql_movie.SELECT_MOVIE_SCHEDULE", vo);
	}
	
	public List<AdminMovieScheduleVO> selectMovieRoundView(AdminMovieScheduleVO vo) {
		return mybatis.selectList("mapper.sql_movie.SELECT_MOVIE_ROUND_VIEW", vo);
	}
	
	
}