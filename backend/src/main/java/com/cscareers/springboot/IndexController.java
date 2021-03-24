package com.cscareers.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin("*")
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
