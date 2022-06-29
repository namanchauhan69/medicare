package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.adminUser;

@Repository
public interface adminRepository extends JpaRepository<adminUser, Integer>{
	List<adminUser> findByUsernameAndPassword(String username,String password);
}
