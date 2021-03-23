package com.cscareers.projects;

public class Project {
	
	private int id;
	private int user_id;

	private String project_title;
	private String project_description;
	private String date_created;
	private String project_tags;
	private String looking_for_tags;
	private String join_url;
	
	// default constructor
	public Project() {
	}
	
	
	public Project(int id, int user_id, String project_title, String project_description, String date_created,
			String project_tags, String looking_for_tags, String join_url) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.project_title = project_title;
		this.project_description = project_description;
		this.date_created = date_created;
		this.project_tags = project_tags;
		this.looking_for_tags = looking_for_tags;
		this.join_url = join_url;
	}

	// id getter-setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// user_id getter-setter
	public int getUserId() {
		return user_id;
	}
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}
	
	// project_title getter-setter
	public String getProjectTitle() {
		return this.project_title;
	}
	public void setProjectTitle(String project_title) {
		this.project_title = project_title;
	}
	
	// project_description getter-setter
	public String getProjectDescription() {
		return this.project_description;
	}
	public void setProjectDescription(String project_description) {
		this.project_description = project_description;
	}
	
	// date_created getter-setter
	public String getDateCreated() {
		return this.date_created;
	}
	public void setDateCreated(String date_created) {
		this.date_created = date_created;
	}
	
	// project_tags getter-setter
	public String getProjectTags() {
		return this.project_tags;
	}
	public void setProjectTags(String project_tags) {
		this.project_tags = project_tags;
	}
	
	// looking_for_tags getter-setter
	public String getLookingForTags() {
		return this.looking_for_tags;
	}
	public void setLookingForTags(String looking_for_tags) {
		this.looking_for_tags = looking_for_tags;
	}
	
	// join_url getter-setter
	public String getJoinUrl() {
		return this.join_url;
	}
	public void setJoinUrl(String join_url) {
		this.join_url = join_url;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", user_id=" + user_id + ", project_title=" + project_title + ", project_description=" + project_description + ", date_created="
				+ date_created + ", project_tags=" + project_tags + ", looking_for_tags=" + looking_for_tags + ", join_url=" + join_url + "]";
	}
	
}

