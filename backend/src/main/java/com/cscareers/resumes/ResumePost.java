package com.cscareers.resumes;

public class ResumePost {
	
	private int id;
	private String file_url;
	private String title;
	private String description;
	private String date_posted;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFileUrl() {
		return file_url;
	}
	
	public void setFileUrl(String file_url) {
		this.file_url = file_url;
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
		return date_posted;
	}
	
	public void setDatePosted(String date_posted) {
		this.date_posted = date_posted;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", file_url=" + file_url + ", title=" + title + ", description=" + description + ", date_posted="
				+ date_posted+ "]";
	}
	
}
