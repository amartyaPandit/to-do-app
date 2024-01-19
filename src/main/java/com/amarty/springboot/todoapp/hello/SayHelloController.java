package com.amarty.springboot.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//Whenever Some one hits "say-hello" API return => "Hello! How you doing?"
	
	//http://localhost:8080/say-hello
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! How you doing?" ;
	}
	
}
  