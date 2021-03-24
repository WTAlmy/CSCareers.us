package com.cscareers.companies;

public class DataReport {
	
	private int id;
	private int userId;
	private int companyId;
	private int accepted;
	
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
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public int getAccepted() {
		return accepted;
	}
	
	public void setAccepted(int accepted) {
		this.accepted = accepted;
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
		return "DataReport [id=" + id + ", userId=" + userId + ", companyId=" + companyId + ", accepted=" + accepted
				+ ", GPA=" + GPA + ", college=" + college + ", collegeYear=" + collegeYear + ", previousInternships="
				+ previousInternships + "]";
	}
	
}
