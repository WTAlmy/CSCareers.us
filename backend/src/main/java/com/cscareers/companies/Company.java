package com.cscareers.companies;

public class Company {
	
	private int id;
	private String name;
	private String imageUrl;
	
	private int allTotal;
	private int gradTotal;
	private int acceptedTotal;

	private double avgGpa;
	private double avgYear;
	private double avgPrior;
	
	public Company () {
		;
	}
	
	public Company (int all, int grad, int acc, float gpa, float year, float prior) {
		this.allTotal = all;
		this.gradTotal = grad;
		this.acceptedTotal = acc;
		this.avgGpa = gpa;
		this.avgYear = year;
		this.avgPrior = prior;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public int getAllTotal() {
		return allTotal;
	}
	
	public void setAllTotal(int allTotal) {
		this.allTotal = allTotal;
	}
	
	public int getGradTotal() {
		return gradTotal;
	}
	
	public void setGradTotal(int gradTotal) {
		this.gradTotal = gradTotal;
	}
	
	public int getAcceptedTotal() {
		return acceptedTotal;
	}

	public void setAcceptedTotal(int acceptedTotal) {
		this.acceptedTotal = acceptedTotal;
	}
	
	public double getAvgGpa() {
		return avgGpa;
	}
	
	public void setAvgGpa(double avgGpa) {
		this.avgGpa = avgGpa;
	}
	
	public double getAvgYear() {
		return avgYear;
	}
	
	public void setAvgYear(double avgYear) {
		this.avgYear = avgYear;
	}
	
	public double getAvgPrior() {
		return avgPrior;
	}
	
	public void setAvgPrior(double avgPrior) {
		this.avgPrior = avgPrior;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", allTotal=" + allTotal
				+ ", gradTotal=" + gradTotal + ", acceptedTotal=" + acceptedTotal + ", avgGpa=" + avgGpa + ", avgYear="
				+ avgYear + ", avgPrior=" + avgPrior + "]";
	}
    
	
}
