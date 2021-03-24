package com.cscareers.companies;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin("*")
public class CompanyController {
	
	@Autowired
	private CompanyDao dao;

	@RequestMapping("/companies")
	public String intern_home() {
		return "Company API Home";
	}
	
	@RequestMapping("/companies/list")
	public List<Company> list_users() {
	    List<Company> companies = dao.loadAll();
	    return companies;
	}
	
	@RequestMapping("/companies/user_reports")
	public List<DataReport> get_reports(int userId) {
		return dao.userReports(userId);
	}
	
	@RequestMapping("/companies/add_report")
	public Company add_report(DataReport report) {
		dao.insert(report);
		List<DataReport> comp_reports = dao.companyReports(report.getCompanyId());
		// Base Data
		int allTotal = comp_reports.size(), gradTotal = 0, accepted = 0;
		float gpa_total = 0, year_total = 0, prior_total = 0;
		// Compute
		for (DataReport temp : comp_reports) {
			if (temp.getAccepted() == 1) {
				accepted++;
				gpa_total += temp.getGPA();
				year_total += temp.getCollegeYear();
				prior_total += temp.getPreviousInternships();
			} else if (temp.getCollegeYear() > 4) {
				gradTotal++;
			}
		}
		// Save
		float avg_gpa = gpa_total / (float) accepted;
		float avg_year = year_total / (float) accepted;
		float avg_prior = prior_total / (float) accepted;
		Company company = new Company(allTotal, gradTotal, accepted, avg_gpa, avg_year, avg_prior);
		company.setId(report.getCompanyId());
		dao.update(company);
		return company;
	}

}
