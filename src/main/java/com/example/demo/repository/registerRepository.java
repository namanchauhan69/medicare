package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.registerUser;

@Repository
public interface registerRepository extends JpaRepository<registerUser, Integer>{
	List<registerUser> findByUsername(String username);
	List<registerUser> findByUsernameAndPassword(String username,String password);
}
	