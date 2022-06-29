package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.registerUser;
import com.example.demo.repository.registerRepository;

@RestController
public class registerController {
		
	@Autowired
	registerRepository registerRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping("register/{username}")
	public List<registerUser> fingByUsername(@PathVariable String username) {
		return registerRepository.findByUsername(username);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("register/{username}/{password}")
	public List<registerUser> fingByUsernameAndPassword(@PathVariable String username,@PathVariable String password) {
		return registerRepository.findByUsernameAndPassword(username,password);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("register/save")
	public String saveUser(@RequestBody registerUser user) {
		registerRepository.save(user); 
		return "New user successfully created";
	}

}
