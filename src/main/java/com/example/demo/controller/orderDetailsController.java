package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.orderDetails;
import com.example.demo.repository.orderDetailsRepository;

@RestController
public class orderDetailsController {

	@Autowired
	orderDetailsRepository orderDetailsRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping("orderDetails/{username}")
	public List<orderDetails> findByUsername(@PathVariable String username){
		return 	orderDetailsRepository.findByUsername(username);
	}

	@CrossOrigin(origins = "*")
	@PostMapping("orderDetails/save")
	public String save(@RequestBody orderDetails order) {
		orderDetailsRepository.save(order);
		return "order placed";
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("orderDetails/delete/{id}")
	public String deleteOrder(@PathVariable int id) {
		orderDetailsRepository.deleteById(id);
		return "order deleted";
	}
}
