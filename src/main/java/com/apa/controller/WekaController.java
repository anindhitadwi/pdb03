package com.apa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WekaController {

	@RequestMapping("/weka")
	public String weka() {
		
		return "weka/weka-main";
	}
	
	@RequestMapping("/weka-em/{year}")
	public String wekaEM(Model model, @PathVariable(value = "year") String year) {
		
		model.addAttribute("year", year);
		
		switch(year){
	    	case "2005" : return "weka/weka-2005-em";
	    	case "2006" : return "weka/weka-2006-em";
	    	case "2007" : return "weka/weka-2007-em";
	    	case "2008" : return "weka/weka-2008-em";
	    	case "2009" : return "weka/weka-2009-em";
	    	case "2010" : return "weka/weka-2010-em";
	    	case "2011" : return "weka/weka-2011-em";
	    	case "2012" : return "weka/weka-2012-em";
	    	case "2013" : return "weka/weka-2013-em";
	    	case "2014" : return "weka/weka-2014-em";
	    	case "2015" : return "weka/weka-2015-em";
	    	case "2016" : return "weka/weka-2016-em";
	    	case "2017" : return "weka/weka-2017-em";
	    	
	    }
		
		return "index";
	}
	
	@RequestMapping("/weka-skm/{year}")
	public String wekaSKM(Model model, @PathVariable(value = "year") String year) {
		
		model.addAttribute("year", year);
		
		switch(year){
	    	case "2005" : return "weka/weka-2005-skm";
	    	case "2006" : return "weka/weka-2006-skm";
	    	case "2007" : return "weka/weka-2007-skm";
	    	case "2008" : return "weka/weka-2008-skm";
	    	case "2009" : return "weka/weka-2009-skm";
	    	case "2010" : return "weka/weka-2010-skm";
	    	case "2011" : return "weka/weka-2011-skm";
	    	case "2012" : return "weka/weka-2012-skm";
	    	case "2013" : return "weka/weka-2013-skm";
	    	case "2014" : return "weka/weka-2014-skm";
	    	case "2015" : return "weka/weka-2015-skm";
	    	case "2016" : return "weka/weka-2016-skm";
	    	case "2017" : return "weka/weka-2017-skm";
	    	
	    }
		
		return "index";
	}
}
