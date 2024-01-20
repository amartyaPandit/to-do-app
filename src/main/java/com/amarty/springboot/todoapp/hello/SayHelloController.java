package com.amarty.springboot.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//Whenever Some one hits "say-hello" API return => "Hello! How you doing?"
	
	//sending string directly
	//http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! How you doing?" ;
	}
	
	//sending html code as string through string buffer.
	//http://localhost:8080/say-hello-html
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb= new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> Saying Hello -html</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Hello! How you doing?");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	//sending view through JSP (Java Servlet Pages)
	//http://localhost:8080/say-hello-jsp
	// /to-do-app/src/main/resources/META-INF/resourses/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
  