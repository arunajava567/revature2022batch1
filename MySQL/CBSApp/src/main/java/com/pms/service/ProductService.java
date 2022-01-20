package com.pms.service;

import com.pms.model.Product;

public interface ProductService {

	public void addProduct(Product p) throws Exception;
	public void deleteProduct(int id);
	
}
