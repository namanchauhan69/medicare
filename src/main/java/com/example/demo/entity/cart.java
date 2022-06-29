package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String imageUrl;
	private int productId;
	private int productQuantity;
	private String productName;
	private String totalPrice;
	private String username;
	private int quantity;
	
	public cart() {
		// TODO Auto-generated constructor stub
	}

	public cart(int id, String imageUrl, int productId, int productQuantity, String productName, String totalPrice,
			String username, int quantity) {
		super();
		this.id = id;
		this.imageUrl = imageUrl;
		this.productId = productId;
		this.productQuantity = productQuantity;
		this.productName = productName;
		this.totalPrice = totalPrice;
		this.username = username;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
