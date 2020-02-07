package ml.enti3237.dmall.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ml.enti3237.dmall.admin.vo.AdminGoodsVO;

@Repository
public class AdminGoodsDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertGoods(AdminGoodsVO vo) {
		mybatis.insert("mapper.sql_admin.INSERT_GOODS", vo);
		
	}
	public void selectGoods() {}
	
	public List<AdminGoodsVO> selectGoodsList() {
		return mybatis.selectList("mapper.sql_admin.SELECT_GOODS_LIST");
	}
	
	public void updateGoods() {}
	public void deleteGoods() {}
	

}
