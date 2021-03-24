package com.cscareers.resumes;

public class ResumePost {
	
	private int id;
	private String username;
	private String fileUrl;
	private String title;
	private String description;
	private String datePosted;
	
	public ResumePost(){
		
	}
	
	public ResumePost(int id, String username, String fileUrl, String title, String description, String datePosted) {
		super();
		this.id = id;
		this.username = username;
		this.fileUrl = fileUrl;
		this.title = title;
		this.description = description;
		this.datePosted = datePosted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	@Override
	public String toString() {
		return "ResumePost [id=" + id + ", username=" + username + ", fileUrl=" + fileUrl + ", title=" + title
				+ ", description=" + description + ", datePosted=" + datePosted + "]";
	}
	
}
