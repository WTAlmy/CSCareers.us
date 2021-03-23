package com.cscareers.users;

public class User {
	
	private int id;
	private String username;
	private String password;
	
	private float GPA;
	private String college;
	private int college_year;
	private int previous_internships;

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
	
	public int get_college_year() {
		return college_year;
	}
	
	public void setCollegeYear(int college_year) {
		this.college_year = college_year;
	}

	public int get_prev_internships() {
		return previous_internships;
	}
	
	public void setPrevInternships(int prev) {
		this.previous_internships = prev;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", GPA=" + GPA + ", college="
				+ college + ", college_year=" + college_year + ", previous_internships=" + previous_internships + "]";
	}
	
}
