package com.amarty.springboot.todoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("login")
	public String gotoLoginPage() {
		return "login";
	}
	
}
