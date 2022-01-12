package com.pms.service;

import java.util.ArrayList;

import com.pms.model.Product;

public class ProductServiceImpl implements ProductService {
	
	static ArrayList<Product> productList=new ArrayList<Product>();
	
	public void addProduct(Product p) {
		productList.add(p);
		System.out.println(productList);
	}

}
