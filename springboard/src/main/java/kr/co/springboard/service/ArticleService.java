package kr.co.springboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.springboard.dao.ArticleDAO;
import kr.co.springboard.vo.ArticleVO;

@Service
public class ArticleService {

	@Autowired
	private ArticleDAO dao;

	//전체 게시물 갯수 구하기
	public int getTotalArticle() {return dao.getTotalArticle();}

	//각 페이지의 전체숫자 (1페이지 0 2페이지 10 3페이지 20... total-start가 각 페이지의 첫 게시물 번호가 된다)
	public int getListStart(String pg) {
		int page = Integer.parseInt(pg);
		int listStart = (page - 1) * 10;
		return listStart;
	}
	
	// 페이지 리스트 그루핑(1~10이 1, 11~20이 2여야 함)
	public int getPageCurrent(String pg) {
		int page = Integer.parseInt(pg);	
		return (int) Math.ceil(page/10.0);
	}
	
	//페이지 리스트 시작(1, 11, 21...)
	public int getPageStart(int pageCurrent) {
		int pageStart = (pageCurrent - 1) * 10 + 1;
		return pageStart;
	}
	
	//페이지 리스트 끝 (10, 20, 30...)
	public int getPageEnd(int pageCurrent, int pageLast) {
		int pageEnd = pageCurrent * 10;		
		if(pageEnd > pageLast) {pageEnd = pageLast;} 
		return pageEnd;
	}
	
	//페이지 리스트의 전체 끝(12, 34, 54 ...)
	public int getPageLast(int total) {
		if(total%10 != 0){return total / 10 + 1;}
		else {return total / 10 ;}			
	}
	
	//글 순서 카운터 번호
	//페이지별로 따로 계산되기 때문에 전체숫자total에서 각 페이지만큼의 숫자를 빼주는 게 필요
	//ex. 104개의 글이 있을 경우 1페이지는 104 103 102... 2페이지는 94 93 92...
	public int getListCount(int total, int listStart) {
		return (total-listStart)+1;
	}
	
	
	
	
	public void insertArticle(ArticleVO vo) {
		dao.insertArticle(vo);
	}
	
	public ArticleVO selectArticle(int seq) {
		return dao.selectArticle(seq);
	}
	
	public List<ArticleVO> selectArticles(int start) {
		return dao.selectArticles(start);
	}

	public void updateArticle(ArticleVO vo) {
		dao.updateArticle(vo);
	}
	
	public void deleteArticle(int seq) {
		dao.deleteArticle(seq);
	}
	
	public void insertComment(ArticleVO vo) {
		dao.insertComment(vo);		
	}
	
	public List<ArticleVO> selectComment(int parent) {
		return dao.selectComment(parent);
	}
	
	public List<ArticleVO> updateComment(ArticleVO vo) {
		return dao.updateComment(vo);
	}
	
	public void deleteComment(int seq) {
		
	}
	
}
