package com.amarty.springboot.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	//
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		//System.out.println("name of request param is " + name );
		//NEVER USE SYSTEM OUT 
		
		model.put("name", name);
		
		return "login";
	}
	
}
