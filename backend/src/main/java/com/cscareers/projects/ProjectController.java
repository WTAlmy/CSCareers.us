package com.cscareers.projects;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin("*")
@RestController
public class ProjectController {
	
	@Autowired
	private ProjectDao dao;

	@RequestMapping("/projects")
	public String index() {
		return "Projects Endpoint";
	}
	
	@PostMapping("projects/post")
	@ResponseBody
	public Project create_project(@RequestBody Project project) {
		dao.create_project(project);
		return project;
	}
	
	@RequestMapping("projects/list")
	public List<Project> list_projects(){
		List<Project> projects = dao.loadAll();
		return projects; 
    }
	
	@RequestMapping("projects/sample")
	public Project sample_project() {
		Project project = new Project();
		project.setId(1);
		project.setUserId(1);
		project.setProjectTitle("Sample Project");
		project.setProjectDescription("Sample project description");
		project.setProjectTags("c++,python");
		project.setLookingForTags("frontend,backend");
		project.setJoinUrl("discord.com");
		return project;
	}
}
