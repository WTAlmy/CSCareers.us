package com.cscareers.resumes;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ResumeController {

	@RequestMapping("/resumes")
	public String index() {
		return "Resume Read Endpoint";
	}

}
