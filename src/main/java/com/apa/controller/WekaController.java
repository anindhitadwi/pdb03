package com.apa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WekaController {

	@RequestMapping("/weka")
	public String weka() {
		
		return "weka/main";
	}
	
	@RequestMapping("/weka/{year}")
	public String detailWeka(Model model, @PathVariable(value = "year") String year) {
		
		model.addAttribute("year", year);
		
		return "weka/detail";
	}
}
