package com.cscareers.projects;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class ProjectDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// insert project into projects table
	public void create_project(Project project) {
		String fields = "(userId,projectTitle,projectDescription,projectTags,lookingForTags,joinUrl)";
		String sql = "INSERT INTO projects" + fields + " VALUES(?,?,?,?,?,?)";
		jdbcTemplate.update(sql,project.getUserId(),project.getProjectTitle(),project.getProjectDescription(),
				project.getProjectTags(),project.getLookingForTags(),project.getJoinUrl());
	}
    
	// retrieves all rows from projects table
	public List<Project> loadAll(){
		return jdbcTemplate.query("SELECT * FROM projects ORDER BY dateCreated DESC", (resultSet, i) -> {
			return toProject(resultSet);
		});
	}
	
	private Project toProject(ResultSet resultSet) throws SQLException {
		Project project = new Project();
		project.setId(resultSet.getInt("id"));
		project.setUserId(resultSet.getInt("userId"));
		project.setProjectTitle(resultSet.getString("projectTitle"));
		project.setProjectDescription(resultSet.getString("projectDescription"));
		project.setProjectTags(resultSet.getString("projectTags"));
		project.setLookingForTags(resultSet.getString("lookingForTags"));
		project.setDateCreated(resultSet.getString("dateCreated"));
		project.setJoinUrl(resultSet.getString("joinUrl"));
		return project;
	}
}
