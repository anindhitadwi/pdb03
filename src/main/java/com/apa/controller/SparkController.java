package com.apa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SparkController {

	@RequestMapping("/spark-fasilkom/{year}")
	public String sparkFasilkom(Model model, @PathVariable(value = "year") String year) {
		
		model.addAttribute("year", year);
		
		switch(year){
	    	case "2005" : return "spark/spark-2005-fasilkom";
	    	case "2006" : return "spark/spark-2006-fasilkom";
	    	case "2007" : return "spark/spark-2007-fasilkom";
	    	case "2008" : return "spark/spark-2008-fasilkom";
	    	case "2009" : return "spark/spark-2009-fasilkom";
	    	case "2010" : return "spark/spark-2010-fasilkom";
	    	case "2011" : return "spark/spark-2011-fasilkom";
	    	case "2012" : return "spark/spark-2012-fasilkom";
	    	case "2013" : return "spark/spark-2013-fasilkom";
	    	case "2014" : return "spark/spark-2014-fasilkom";
	    	case "2015" : return "spark/spark-2015-fasilkom";
	    	case "2016" : return "spark/spark-2016-fasilkom";
	    	case "2017" : return "spark/spark-2017-fasilkom";
	    }
		
		return "index";
	}
	
	@RequestMapping("/spark-databricks/{year}")
	public String sparkDatabricks(Model model, @PathVariable(value = "year") String year) {
		
		model.addAttribute("year", year);
		
		switch(year){
			case "2005" : return "spark/spark-2005-databricks";
	    	case "2006" : return "spark/spark-2006-databricks";
	    	case "2007" : return "spark/spark-2007-databricks";
	    	case "2008" : return "spark/spark-2008-databricks";
	    	case "2009" : return "spark/spark-2009-databricks";
	    	case "2010" : return "spark/spark-2010-databricks";
	    	case "2011" : return "spark/spark-2011-databricks";
	    	case "2012" : return "spark/spark-2012-databricks";
	    	case "2013" : return "spark/spark-2013-databricks";
	    	case "2014" : return "spark/spark-2014-databricks";
	    	case "2015" : return "spark/spark-2015-databricks";
	    	case "2016" : return "spark/spark-2016-databricks";
	    	case "2017" : return "spark/spark-2017-databricks";
	    }
		
		return "index";
	}
	
	@RequestMapping("/spark-jupyter/{year}")
	public String sparkJupyter(Model model, @PathVariable(value = "year") String year) {
		
		model.addAttribute("year", year);
		
		switch(year){
			case "2005" : return "spark/spark-2005-jupyter";
	    	case "2006" : return "spark/spark-2006-jupyter";
	    	case "2007" : return "spark/spark-2007-jupyter";
	    	case "2008" : return "spark/spark-2008-jupyter";
	    	case "2009" : return "spark/spark-2009-jupyter";
	    	case "2010" : return "spark/spark-2010-jupyter";
	    	case "2011" : return "spark/spark-2011-jupyter";
	    	case "2012" : return "spark/spark-2012-jupyter";
	    	case "2013" : return "spark/spark-2013-jupyter";
	    	case "2014" : return "spark/spark-2014-jupyter";
	    	case "2015" : return "spark/spark-2015-jupyter";
	    	case "2016" : return "spark/spark-2016-jupyter";
	    	case "2017" : return "spark/spark-2017-jupyter";
	    }
		
		return "index";
	}
	
}
