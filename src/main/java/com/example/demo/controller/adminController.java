package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.adminUser;
import com.example.demo.repository.adminRepository;

@RestController
public class adminController {

	@Autowired
	adminRepository adminRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping("admin/{username}/{password}")
	public List<adminUser> findByUsernameAndPassword(@PathVariable String username,@PathVariable String password){
		return adminRepository.findByUsernameAndPassword(username, password);
	}
}
