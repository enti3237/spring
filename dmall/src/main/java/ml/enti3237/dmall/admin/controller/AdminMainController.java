package ml.enti3237.dmall.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminMainController {

	@GetMapping(value= {"/admin/index", "/admin"})
	public String index() {
		return "/admin/index";
	}
}
