package ml.enti3237.dmall.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ml.enti3237.dmall.admin.vo.AdminGoodsVO;
import ml.enti3237.dmall.vo.MemberVO;

@Repository
public class AdminMemberDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertMember() {}
	public void selectMember() {}
	
	public List<MemberVO> selectMembers() {
		List<MemberVO> members = mybatis.selectList("mapper.sql_member.SELECT_MEMBERS");
		return members;
	}
	
	public void updateMember() {}
	public void deleteMember() {}
	

}
