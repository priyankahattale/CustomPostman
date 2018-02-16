package com.home.custom.postman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller(value="Customer")
public class CustomerController {
	
	public String welcomePage="hello";
	
	@RequestMapping("/")
	public String showWelcomePage(){
		return welcomePage;
	}
	

}
