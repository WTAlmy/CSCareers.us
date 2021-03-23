package com.cscareers.companies;

public class Company {
	
	private int id;
	private String name;
	private String imageUrl;
	
	private int totalAll;
	private int totalGrad;
	private double avgGpa;
	private double avgYear;
	private double avgPrior;
	
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
	
	public int getTotalAll() {
		return totalAll;
	}
	
	public void setTotalAll(int totalAll) {
		this.totalAll = totalAll;
	}
	
	public int getTotalGrad() {
		return totalGrad;
	}
	
	public void setTotalGrad(int totalGrad) {
		this.totalGrad = totalGrad;
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
    
	
}
