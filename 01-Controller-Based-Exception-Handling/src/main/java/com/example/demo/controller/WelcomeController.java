package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	
	@RequestMapping("/welcome")
	public String welcome(Model model)
	{
		model.addAttribute("Msg", "welcome to Ashok IT");
		String name=null;
		name.length();
		return "welcome";
	}

	
	//handling controller level exception
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Model model)
	{
		model.addAttribute("errMsg", "some problem occured,please try after sometime!!!!");
		return "error";
	}
}


/*i/p
http://localhost:7090/welcome
	o/p
	
	some problem occured,please try after sometime!!!!*/