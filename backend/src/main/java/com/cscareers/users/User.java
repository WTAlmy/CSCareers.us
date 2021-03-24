package com.cscareers.users;

public class User {
	
	private int id;
	private String username;
	private String password;
	
	private float GPA;
	private String college;
	private int collegeYear;
	private int previousInternships;
	
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
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public float getGPA() {
		return GPA;
	}
	
	public void setGPA(float GPA) {
		this.GPA = GPA;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public int getCollegeYear() {
		return collegeYear;
	}
	
	public void setCollegeYear(int collegeYear) {
		this.collegeYear = collegeYear;
	}
	
	public int getPreviousInternships() {
		return previousInternships;
	}
	
	public void setPreviousInternships(int previousInternships) {
		this.previousInternships = previousInternships;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", GPA=" + GPA + ", college="
				+ college + ", collegeYear=" + collegeYear + ", previousInternships=" + previousInternships + "]";
	}
	
}
