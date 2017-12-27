package com.apa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/")
	public String index() {
		
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		return "about";
	}
	
	@RequestMapping("/test")
	public String test() {
		
		return "charts";
	}
}
