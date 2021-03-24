package com.cscareers.projects;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectDao dao;

	@RequestMapping("/projects")
	public String index() {
		return "Projects Endpoint";
	}
	
	@PostMapping("projects/post")
	public void create_projcet(Project project) {
		dao.create_project(project);
	}
	
	@RequestMapping("projects/list")
	public List<Project> list_projects(){
		List<Project> projects = dao.loadAll();
		return projects; 
    }
	
	@RequestMapping("projects/sample")
	public Project sample_project() {
		Project project = new Project(1, 1, "Sample Project", "sample project description", 
				"2021-03-22 22:38:49", "c++,python","frontend,backend", "discord.com");
		return project;
	}
	
}
