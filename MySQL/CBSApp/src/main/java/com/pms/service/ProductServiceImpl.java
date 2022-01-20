package com.pms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;

import com.pms.dbcon.DbConn;
import com.pms.model.Product;

public class ProductServiceImpl implements ProductService {
	 private static final Logger logger = Logger.getLogger("ProductServiceImpl.class");

	static ArrayList<Product> productList=new ArrayList<Product>();
	
	public void addProduct(Product p) throws Exception {
		logger.info("adding...");
		productList.add(p);
		
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?,?)");
		Scanner sc=new Scanner(System.in);
			pst.setInt(1,p.getProductId());
			pst.setString(2,p.getProductName() );
			pst.setDouble(3, p.getQty());
			pst.setDouble(4, p.getPrice());
			
			
			pst.execute(); //insert 
		
		System.out.println(productList);
		logger.info("added successfully...in db as well");
	}
	
	public void deleteProduct(int id) {
		logger.info("entering into deleting,....");
		Iterator<Product> it=productList.iterator();
		while(it.hasNext()) {
			Product p=(Product)it.next();
			if(p.getProductId()==id)
				it.remove();
		}
	}

}
