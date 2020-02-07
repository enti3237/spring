package ml.enti3237.dmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {

	@GetMapping("/mypage/mypage")
	public String mypage() {
		return "/mypage/mypage";
	}


}
