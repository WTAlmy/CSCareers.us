package com.cscareers.projects;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectDao dao;

	@RequestMapping("/projects")
	public String index() {
		return "Projects Endpoint";
	}
	
	@RequestMapping("/create_project")
	public String create_project() {
		return "Create Project Endpoint";
	}
	
	@RequestMapping("/list_projects")
	public List<Project> list_projects(){
		List<Project> projects = dao.loadAll();
		return projects; 
    }
	
}
