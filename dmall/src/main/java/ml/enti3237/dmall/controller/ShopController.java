package ml.enti3237.dmall.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ml.enti3237.dmall.admin.vo.AdminGoodsVO;
import ml.enti3237.dmall.service.ShopService;

@Controller
public class ShopController {
	
	@Inject
	private ShopService service;
	
	@GetMapping("/shop/cart")
	public String cart() {
		return "/shop/cart";
	}

	@GetMapping("/shop/goods")
	public String goods(Model model, AdminGoodsVO vo) {
		
		AdminGoodsVO goods = service.selectGoods(vo);
		model.addAttribute("goods", goods);
		
		return "/shop/goods";
	}


}
