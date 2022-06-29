package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.orderDetails;

@Repository
public interface orderDetailsRepository extends JpaRepository<orderDetails, Integer>{
	List<orderDetails> findByUsername(String username);
}
