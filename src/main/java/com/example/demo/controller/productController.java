package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.products;
import com.example.demo.repository.productRepository;

@RestController
public class productController {

	@Autowired
	productRepository productRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping("products")
	public List<products> allProducts() {
		return productRepository.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("products/id/{id}")
	public List<products> findProductById(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("products/type/{type}")
	public List<products> findProductByType(@PathVariable String type) {
		return productRepository.findByType(type);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("products/save")
	public String saveProduct(@RequestBody products product) {
		productRepository.save(product);
		return "product added";
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("products/update/status/{id}/{status}")
	public String updateStatus(@PathVariable int id, @PathVariable String status) {
		productRepository.updateStatus(id, status);
		return "status updated";
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("products/update/qty/{id}/{newQty}")
	public String updateQuantity(@PathVariable int id, @PathVariable int newQty) {
		productRepository.updateQuantity(id, newQty);
		return "quantity updated";
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("products/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
		return "product deleted";
	}
}
