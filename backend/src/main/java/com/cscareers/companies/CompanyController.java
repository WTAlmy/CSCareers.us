package com.cscareers.companies;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CompanyController {

	@RequestMapping("/internships")
	public String intern_home() {
		return "Internships Portal";
	}

}
