package com.pms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

import com.pms.model.Product;

public class ProductServiceImpl implements ProductService {
	 private static final Logger logger = Logger.getLogger("ProductServiceImpl.class");

	static ArrayList<Product> productList=new ArrayList<Product>();
	
	public void addProduct(Product p) {
		logger.info("adding...");
		productList.add(p);
		System.out.println(productList);
		logger.info("added successfully...");
	}
	
	public void deleteProduct(int id) {
		Iterator<Product> it=productList.iterator();
		while(it.hasNext()) {
			Product p=(Product)it.next();
			if(p.getProductId()==id)
				it.remove();
		}
	}

}
