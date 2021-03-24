package com.cscareers.resumes;

public class ResumeComment {
	
	private int id;
	private int resumeId;
	private String username;
	private String commentText;
	private String datePosted;
	
	public ResumeComment() {
		
	}
	
	public ResumeComment(int id, int resumeId, String username, String commentText, String datePosted) {
		super();
		this.id = id;
		this.resumeId = resumeId;
		this.username = username;
		this.commentText = commentText;
		this.datePosted = datePosted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getResumeId() {
		return resumeId;
	}

	public void setResumeId(int resumeId) {
		this.resumeId = resumeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	
	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	@Override
	public String toString() {
		return "ResumeComment [id=" + id + ", resumeId=" + resumeId + ", username=" + username + ", commentText="
				+ commentText + ", datePosted=" + datePosted + "]";
	}
}
