package com.cscareers.projects;

public class Project {
	
	private int id;
	private int userId;

	private String projectTitle;
	private String projectDescription;
	private String dateCreated;
	private String projectTags;
	private String lookingForTags;
	private String joinUrl;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getProjectTags() {
		return projectTags;
	}
	public void setProjectTags(String projectTags) {
		this.projectTags = projectTags;
	}
	public String getLookingForTags() {
		return lookingForTags;
	}
	public void setLookingForTags(String lookingForTags) {
		this.lookingForTags = lookingForTags;
	}
	public String getJoinUrl() {
		return joinUrl;
	}
	public void setJoinUrl(String joinUrl) {
		this.joinUrl = joinUrl;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", userId=" + userId + ", projectTitle=" + projectTitle + ", projectDescription="
				+ projectDescription + ", dateCreated=" + dateCreated + ", projectTags=" + projectTags
				+ ", lookingForTags=" + lookingForTags + ", joinUrl=" + joinUrl + "]";
	}
}