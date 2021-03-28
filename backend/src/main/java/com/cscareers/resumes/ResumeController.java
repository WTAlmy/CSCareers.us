package com.cscareers.resumes;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin("*")
public class ResumeController {
	
	@Autowired
	private ResumeDao dao;
	
	@RequestMapping("/resumes")
	public String index() {
		return "Resume Read Endpoint";
	}
	
	@RequestMapping("/resumes/list/resumes")
	public List<ResumePost> list_resumePosts() {
		List<ResumePost> resumePosts = dao.loadAll();
		return resumePosts;
	}
	
	@PostMapping("/resumes/post/resume")
	@ResponseBody
	public ResumePost post_resume(@RequestBody ResumePost resumePost) {
		dao.post_resume(resumePost);
		return resumePost;
	}
	
	@RequestMapping("/resumes/sample/resume")
	public ResumePost sample_resumePost() {
		ResumePost resumePost = new ResumePost(8, "user123", "someurl.pdf", "some title", "some description", "2021-03-23 23:48:22");
		return resumePost;
	}
	
	@PostMapping("/resumes/post/comment")
	@ResponseBody
	public ResumeComment post_comment(@RequestBody ResumeComment resumeComment) {
		dao.post_comment(resumeComment);
		return resumeComment;
	}
	
	@RequestMapping("/resumes/list/comments")
    public List<ResumeComment> fetch_comments(int resumeId){
		List<ResumeComment> resumeComments = dao.loadAllComments(resumeId);
		return resumeComments;
	}
	
    @RequestMapping("/resumes/sample/comment")
    public ResumeComment sample_resumeComment() {
    	ResumeComment resumeComment = new ResumeComment(7, 1, "user123", "git gud", "2021-03-23 23:48:22");
    	return resumeComment;
    }
	
	
}
