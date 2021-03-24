package com.cscareers.resumes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResumeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// inserts a resume post into resume_post table
	public void post_resume(ResumePost resumePost) {
		String fields = "(username,fileUrl,title,description)";
		String sql = "INSERT INTO resume_post " + fields + " VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, resumePost.getUsername(), resumePost.getFileUrl(), resumePost.getTitle(), resumePost.getDescription());
	}
	

	// retrieves all rows from projects table
	public List<ResumePost> loadAll(){
		return jdbcTemplate.query("SELECT * FROM resume_post", (resultSet, i) -> {
			return toResumePost(resultSet);
		});
	}
	
	// inserts a comment post into resume_comment table
	public void post_comment(ResumeComment resumeComment) {
		String fields = "(resumeId,username,commentText)";
		String sql = "INSERT INTO resume_comment " + fields + " VALUES(?,?,?)";
		jdbcTemplate.update(sql, resumeComment.getResumeId(), resumeComment.getUsername(), resumeComment.getCommentText());
	}
	
	// retrieves all comments with a given resumeId
	public List<ResumeComment> loadAllComments(int resumeId){
		return jdbcTemplate.query("SELECT * FROM resume_comment WHERE resumeId=" + resumeId, (resultSet, i) -> {
			return toResumeComment(resultSet);
		});
	}
	
	// creates resume object from 
	private ResumePost toResumePost(ResultSet resultSet) throws SQLException {
		ResumePost resumePost = new ResumePost();
		resumePost.setId(resultSet.getInt("id"));
		resumePost.setUsername(resultSet.getString("username"));
		resumePost.setFileUrl(resultSet.getString("fileUrl"));
		resumePost.setTitle(resultSet.getString("title"));
		resumePost.setDescription(resultSet.getString("description"));
		resumePost.setDatePosted(resultSet.getString("datePosted"));
		return resumePost;
	}
	
	private ResumeComment toResumeComment(ResultSet resultSet) throws SQLException {
		ResumeComment resumeComment = new ResumeComment();
		resumeComment.setId(resultSet.getInt("id"));
		resumeComment.setResumeId(resultSet.getInt("resumeId"));
		resumeComment.setUsername(resultSet.getString("username"));
		resumeComment.setCommentText(resultSet.getString("commentText"));
		resumeComment.setDatePosted(resultSet.getString("datePosted"));
		return resumeComment;
	}
}
	
	

