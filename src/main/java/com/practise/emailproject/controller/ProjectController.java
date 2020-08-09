package com.practise.emailproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.practise.emailproject.Model.User;
import com.practise.emailproject.service.ProjectService;

@RestController
public class ProjectController {
 
	@Autowired
	private ProjectService projectservice;
	
	@PostMapping
	public void getEmailFile(@RequestParam("file") MultipartFile file) {
		projectservice.getEmailFile(file);
		
		
	}
	  @PostMapping("/login")
	   public void uploadLoginUserInfo(@RequestBody User user) {
		       projectservice.uploadLoginUserInfo(user);
	  }
	  @GetMapping("/login")
	  public List<User> getAllListOfUser(){
		  
		 return projectservice.gettAllListOfUser();
		  
	  }
}
