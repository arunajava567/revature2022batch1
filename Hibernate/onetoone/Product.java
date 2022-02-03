package com.pms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer productId;
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	String productName;
	Double qty;
	Double price;
	
	public Product() {
		
	}

	public Product(Integer productId, String productName, Double qty, Double price) {
		
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", qty=" + qty + ", price=" + price
				+ "]";
	}
	

}
