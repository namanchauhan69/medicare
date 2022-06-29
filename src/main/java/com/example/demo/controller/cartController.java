package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.razorpay.*;
import com.example.demo.entity.cart;
import com.example.demo.repository.cartRepository;

@RestController
public class cartController {

	@Autowired
	cartRepository cartRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping("cart/{username}")
	public List<cart> findByUsername(@PathVariable String username){
		return cartRepository.findByUsername(username);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("cart/save")
	public String saveToCart(@RequestBody cart cart) {
		cartRepository.save(cart);
		return "saved to cart successfully";
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("cart/delete/{id}")
	public String deleteById(@PathVariable int id) {
		cartRepository.deleteById(id);
		return "successfully deleted";
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("cart/createOrder")
	public String createOrder(@RequestBody Map<String, Object> data)throws Exception {
		
		int amount = Integer.parseInt(data.get("data").toString());
		
		RazorpayClient client = new RazorpayClient("rzp_test_Q7JMjBUy331a5Y", "KjMsUg7atMCRQqMGUprmUUwR");
		
		JSONObject ob = new JSONObject();
		ob.put("amount", amount*100);
		ob.put("currency", "INR");
		ob.put("receipt", "txn_2345432");
		
		//creating new order
		
		Order order = client.Orders.create(ob);
		System.out.println(order);
		
		return order.toString();
	}
}
