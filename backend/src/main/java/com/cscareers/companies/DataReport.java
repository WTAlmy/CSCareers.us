package com.cscareers.companies;

public class DataReport {
	
	private int id;
	private String username;
	private String password;
	
	private double GPA;
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
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double GPA) {
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
	
	public void set_college_year(int college_year) {
		this.college_year = college_year;
	}

	public int get_prev_internships() {
		return previous_internships;
	}
	
	public void set_prev_internships(int prev) {
		this.previous_internships = prev;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", GPA=" + GPA + ", college="
				+ college + ", college_year=" + college_year + ", previous_internships=" + previous_internships + "]";
	}
	
}
