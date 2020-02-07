package ml.enti3237.dmall.admin.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ml.enti3237.dmall.admin.dao.AdminGoodsDAO;
import ml.enti3237.dmall.admin.vo.AdminGoodsVO;

@Service
public class AdminGoodsService {
	
	@Inject
	private AdminGoodsDAO dao;
	
	public void insertGoods(AdminGoodsVO vo) {
		dao.insertGoods(vo);
	}
	public void selectGoods() {}
	
	public List<AdminGoodsVO> selectGoodsList() {
		return dao.selectGoodsList();
	}
	
	public void updateGoods() {}
	public void deleteGoods() {}


}
