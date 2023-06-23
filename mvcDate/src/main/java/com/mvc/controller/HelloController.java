package com.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//URL: localhost:7997/crm/home
	@GetMapping("/home")
	public String getHomePage(Model model){
		System.out.print("inside home");
		model.addAttribute("msg", new Date());
		return "home";
	}
	//URL: localhost:7997/crm/index
	@GetMapping("/index")
	public ModelAndView getIndexPage(){
		System.out.print("inside index");
		return new ModelAndView("index"); 
	}
}
