package com.practise.emailproject.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.practise.emailproject.Model.Subscriber;
import com.practise.emailproject.Model.User;
import com.practise.emailproject.Repository.UserRepository;

@Service
public class ProjectService {
	
	@Autowired
	private UserRepository userrepository;
	

	private List<User> users = Arrays.asList(new User(1, "seetal", "raaya", "seetalraaya123@gmail.com"));

	public void getEmailFile(MultipartFile file) {
		try {
			file.transferTo(new File("/home/seetal/Downloads/UploadFile" + file.getOriginalFilename()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readEmailFromFile() {
		try {

		} catch (Exception e) {

		}
	}

	public void uploadLoginUserInfo(User user) {
	     
		  userrepository.save(user);
	}

	public List<User> gettAllListOfUser() {
		return users;
	}

}
