package com.cscareers.companies;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyDao dao;

	@RequestMapping("/companies")
	public String intern_home() {
		return "Internships Portal";
	}
	
	@RequestMapping("/companies/list")
	public List<Company> list_users() {
	    List<Company> companies = dao.loadAll();
	    return companies;
	}

}
