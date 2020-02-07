package kr.co.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {
	
	@RequestMapping("/list/list")
	public String list() {
		return null;
	}

	@RequestMapping("/list/view")
	public String view() {
		return null;
	}
	
	@RequestMapping("/list/write")
	public String write() {
		return null;
	}

}
