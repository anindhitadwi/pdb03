package com.apa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TensorflowController {

	@RequestMapping("/tensorflow/{year}")
	public String tensorflow(Model model, @PathVariable(value = "year") String year) {
		
		model.addAttribute("year", year);
		
		switch(year){
	    	case "2005" : return "tensorflow/tf-2005";
	    	case "2006" : return "tensorflow/tf-2006";
	    	case "2007" : return "tensorflow/tf-2007";
	    	case "2008" : return "tensorflow/tf-2008";
	    	case "2009" : return "tensorflow/tf-2009";
	    	case "2010" : return "tensorflow/tf-2010";
	    	case "2011" : return "tensorflow/tf-2011";
	    	case "2012" : return "tensorflow/tf-2012";
	    	case "2013" : return "tensorflow/tf-2013";
	    	case "2014" : return "tensorflow/tf-2014";
	    	case "2015" : return "tensorflow/tf-2015";
	    	case "2016" : return "tensorflow/tf-2016";
	    	case "2017" : return "tensorflow/tf-2017";
	    	
	    }
		
		return "error";
	}
}
