package ml.enti3237.dmall.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ml.enti3237.dmall.admin.vo.AdminGoodsVO;

@Repository
public class ShopDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public AdminGoodsVO selectGoods(AdminGoodsVO vo) {
		return mybatis.selectOne("mapper.sql_goods.SELECT_GOODS", vo);
	}

}