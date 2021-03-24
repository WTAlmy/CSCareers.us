package com.cscareers.users;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin("*")
@RestController
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/users/login")
	public User login(String username, String password) {
		System.out.println("User: " + username + " Password: " + password);
		return dao.login(username, password);
	}
	
	@RequestMapping("/users/profile")
	public User profile(String username) {
		return dao.profile(username);
	}

	@RequestMapping("/users/create")
	public User create_user(User user) {
		dao.save(user);
		return user;
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
		user.setPreviousInternships(2);
		return user;
	}

}
