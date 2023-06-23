package com.psa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/index")
	public ModelAndView getIndexPage(){
		
		return new ModelAndView("index");
	}
	@GetMapping("/about")
	public ModelAndView getAboutPage(){
		return new ModelAndView("about");
	}
	@GetMapping("/contact")
	public ModelAndView getContactPage(){
		System.out.println("Inside - contact");
		return new ModelAndView("contact");
	}
}
