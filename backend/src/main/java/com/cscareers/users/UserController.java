package com.cscareers.users;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {
	
	@Autowired
	private UserDao dao;

	@RequestMapping("/create_user")
	public String index() {
		return "Create User Endpoint";
	}
	
	@RequestMapping("/list_users")
	public List<User> list_users() {
	    List<User> persons = dao.loadAll();
	    return persons;
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
