package ml.enti3237.dmall.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ml.enti3237.dmall.admin.vo.AdminGoodsVO;
import ml.enti3237.dmall.dao.ShopDAO;

@Service
public class ShopService {
	
	@Inject
	private ShopDAO dao;
	
	public AdminGoodsVO selectGoods(AdminGoodsVO vo) {
		return dao.selectGoods(vo);
	}

}
