package com.cscareers.projects;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProjectController {

	@RequestMapping("/projects")
	public String index() {
		return "Projects Endpoint";
	}

}
