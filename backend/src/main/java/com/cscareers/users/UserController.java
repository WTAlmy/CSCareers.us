package com.cscareers.users;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {
	
	@Autowired
	private UserDao dao;

	@RequestMapping("/users/create")
	public String index() {
		return "Create User Endpoint";
	}
	
	@RequestMapping("/users/list")
	public List<User> list_users() {
	    List<User> users = dao.loadAll();
	    return users;
	}
	
	@RequestMapping("/users/sample")
	public User newUser() {
		User user = new User();
		user.setId(7);
		user.setUsername("Memer");
		user.setPassword("123456");
		user.setGPA(3.7f);
		user.setCollege("UCSC");
		user.setCollegeYear(5);
		user.setPrevInternships(2);
		return user;
	}

}
