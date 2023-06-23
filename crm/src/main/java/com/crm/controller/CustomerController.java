package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	@GetMapping("/index")
	public String getIndexPage(){
		return "index";
	}
	@GetMapping("/new")
	public String getRegistrationPage(Model model){
		return "registration";
	}
}
