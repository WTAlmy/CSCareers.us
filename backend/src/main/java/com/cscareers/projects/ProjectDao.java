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
	
	public List<Project> loadAll(){
		return jdbcTemplate.query("select * from projects", (resultSet, i) -> {
			return toProject(resultSet);
		});
	}
	
	private Project toProject(ResultSet resultSet) throws SQLException {
		Project project = new Project();
		project.setId(resultSet.getInt("id"));
		project.setUserId(resultSet.getInt("user_id"));
		project.setProjectTitle(resultSet.getString("project_title"));
		project.setProjectDescription(resultSet.getString("project_description"));
		project.setProjectTags(resultSet.getString("project_tags"));
		project.setLookingForTags(resultSet.getString("looking_for_tags"));
		project.setDateCreated(resultSet.getString("date_created"));
		project.setJoinUrl(resultSet.getString("join_url"));
		return project;
	}
}
