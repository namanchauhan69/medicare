package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.products;

@Repository
public interface productRepository extends JpaRepository<products, Integer>{
	
	@Transactional
	@Modifying
	@Query("update products set status =:status where id =:id ")
	void updateStatus(@Param("id") int id,@Param("status") String status);
	
	@Transactional
	@Modifying
	@Query("update products set avaliableQuantity =:newQty where id =:id ")
	void updateQuantity(@Param("id") int id,@Param("newQty") int newQty);
	List<products> findById(int id);
	List<products> findByType(String type);
	
}

