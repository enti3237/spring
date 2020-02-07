package kr.co.springboard.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.springboard.service.ArticleService;
import kr.co.springboard.vo.ArticleVO;
import kr.co.springboard.vo.MemberVO;

@Controller
public class ArticleController {
	
	@Inject
	private ArticleService service;
	
	/* 리스트보기 */	
	@GetMapping("/list")
	public String list(Model model, String pg) {
		
		if(pg == null) { pg = "1"; }
		
		//전체 게시물 갯수 구하기
		int total = service.getTotalArticle();

		//각 페이지의 전체숫자 (1페이지 0 2페이지 10 3페이지 20... total-start가 각 페이지의 첫 게시물 번호가 된다)
		int listStart = service.getListStart(pg);

		//페이지 리스트 그루핑(1~10이 1, 11~20이 2여야 함)
		int pageCurrent = service.getPageCurrent(pg);

		//페이지 리스트의 마지막(게시물 수 230개면 23. pageEnd값이 내용 없는 30까지 뜨는 것을 방지하기 위함)
		int pageLast = service.getPageLast(total);
		
		//페이지 리스트 시작(1, 11, 21...)
		int pageStart = service.getPageStart(pageCurrent);
		
		//페이지 리스트 끝(10, 20, 30...)
		int pageEnd = service.getPageEnd(pageCurrent, pageLast);
		
		
		//글 리스트의 번호(total 에서 가져온 값)
		int listCount = service.getListCount(total, listStart);	

		
		List<ArticleVO> articles  = service.selectArticles(listStart);
		model.addAttribute("articles", articles);

		model.addAttribute("pageStart", pageStart);
		model.addAttribute("pageEnd", pageEnd);
		model.addAttribute("pageLast", pageLast);
		model.addAttribute("listCount", listCount);

		
		return "/list";
	}
	
	/* 글쓰기 */	
	@GetMapping("/write")
	public String write() {
		return "/write";
	}
	
	@PostMapping("/write")
	public String write(HttpServletRequest req, String subject, String content) {
		
		HttpSession session = req.getSession();
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		ArticleVO vo = new ArticleVO();
		vo.setCate("free");
		vo.setTitle(subject);
		vo.setContent(content);
		vo.setUid(member.getUid());
		vo.setRegip(req.getRemoteAddr());
		
		service.insertArticle(vo);
		
		return "redirect:/list";
	}
	
	/* 글보기 */	
	@GetMapping("/view")
	public String view(Model model, int seq) {
				
		ArticleVO article = service.selectArticle(seq);
		List<ArticleVO> comments = service.selectComment(seq);
		
		model.addAttribute(article);
		model.addAttribute("comments", comments);
		
		return "/view";
	}
	
/* 글수정 */		
	// Model 객체도 있고 ModelAndView도 있으니까 일단 테스트 HttpServletRequest 으로 바로 들어가도 됨. 
	@GetMapping("/modify")
	public ModelAndView modify(int seq){
		
		ArticleVO article = service.selectArticle(seq);
		ModelAndView mav = new ModelAndView();
		mav.addObject("article", article);
		mav.setViewName("/modify");
		
		return mav;
	}

	@PostMapping("/modify")
	public String modify(ArticleVO vo){
		
		service.updateArticle(vo);
		return "redirect:/view?seq="+vo.getSeq();
	}

	/* 글삭제 */	
	@GetMapping("/delete")
	public String delete(int seq) {
		
		service.deleteArticle(seq);
		return "redirect:/list";
	}
	
	
	
	/* 코멘트 쓰기 */	
	@PostMapping("/comment/write")
	public String commentWrite(HttpServletRequest req, int parent, String comment) {
		
		HttpSession session = req.getSession();
		MemberVO member = (MemberVO) session.getAttribute("member");
		
		String uid = member.getUid();
		String regip = req.getRemoteAddr();
		
		ArticleVO vo = new ArticleVO();
		vo.setParent(parent);
		vo.setContent(comment);
		vo.setUid(uid);
		vo.setRegip(regip);
		
		service.insertComment(vo);
		
		return "redirect:/view?seq="+parent;
	}
	

	
	

}
