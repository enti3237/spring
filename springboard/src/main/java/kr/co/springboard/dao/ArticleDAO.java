package kr.co.springboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.springboard.vo.ArticleVO;

@Repository
public class ArticleDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	
	public int getTotalArticle() {
		return mybatis.selectOne(
				"mapper.sql_article.SELECT_TOTAL_ARTICLES");
	}

	//ArticleController에서는 subject, content만 받아왔어도 
	//최종적으로는 seq, parent 값 등이 포함되므로 VO 객체로 받는다.
	public void insertArticle(ArticleVO vo) {
		mybatis.insert(
				"mapper.sql_article.INSERT_ARTICLE", vo);
	}
	
	public ArticleVO selectArticle(int seq) {
		return mybatis.selectOne(
				"mapper.sql_article.SELECT_ARTICLE", seq);
	}
	
	public List<ArticleVO> selectArticles(int start) {
		return mybatis.selectList(
				"mapper.sql_article.SELECT_ARTICLES", start);
	}

	public void updateArticle(ArticleVO vo) {
		mybatis.update(
				"mapper.sql_article.UPDATE_ARTICLE", vo);
	}
	
	public void deleteArticle(int seq) {
		mybatis.delete(
				"mapper.sql_article.DELETE_ARTICLE", seq);
	}
	
	// Comment
	public void insertComment(ArticleVO vo) {
		mybatis.insert(
				"mapper.sql_article.INSERT_COMMENT", vo);
	}
	
	public List<ArticleVO> selectComment(int parent) {
		return mybatis.selectList("mapper.sql_article.SELECT_COMMENT", parent);		
	}
	
	public List<ArticleVO> updateComment(ArticleVO vo) {
		return null;
	}
	
	public void deleteComment(int seq) {}

	
	
}
