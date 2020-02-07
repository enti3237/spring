package ml.enti3237.dmall.admin.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ml.enti3237.dmall.admin.service.AdminGoodsService;
import ml.enti3237.dmall.admin.vo.AdminGoodsVO;

@Controller
public class AdminGoodsController {
	
	@Inject
	private AdminGoodsService service;
	
	@GetMapping("/admin/goods/register")
	public String goodsRegister() {
		return "/admin/goods/register";
	}

	@PostMapping("/admin/goods/register")
	public String goodsRegister(AdminGoodsVO vo) {
		service.insertGoods(vo);
		return "/admin/goods/register";
	}
	
	@GetMapping("/admin/goods/list")
	public String goodsList(Model model) {
		
		List<AdminGoodsVO> goods = service.selectGoodsList();
		model.addAttribute("goods", goods);
		
		return "/admin/goods/list";
	}
	

}
