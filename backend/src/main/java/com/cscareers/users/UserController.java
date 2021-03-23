package com.cscareers.users;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {

	@RequestMapping("/create_user")
	public String index() {
		return "Create User Endpoint";
	}
	
	@RequestMapping("/sample_user")
	public User newUser() {
		User user = new User();
		user.setId(7);
		user.setUsername("Memer");
		user.setPassword("123456");
		user.setCollege("UCSC");
		user.set_college_year(5);
		user.set_prev_internships(2);
		return user;
	}

}
