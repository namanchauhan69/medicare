package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productName;
	private String type;
	private int avaliableQuantity;
	private String price;
	private String status;
	private String imageUrl;
	
	public products() {
		// TODO Auto-generated constructor stub
	}

	public products(int id, String productName, String type, int avaliableQuantity, String price, String status,
			String imageUrl) {
		super();
		this.id = id;
		this.productName = productName;
		this.type = type;
		this.avaliableQuantity = avaliableQuantity;
		this.price = price;
		this.status = status;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAvaliableQuantity() {
		return avaliableQuantity;
	}

	public void setAvaliableQuantity(int avaliableQuantity) {
		this.avaliableQuantity = avaliableQuantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	
}
