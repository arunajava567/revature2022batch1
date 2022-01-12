package com.pms.client;

import java.util.Scanner;

import com.pms.model.Product;
import com.pms.service.ProductService;
import com.pms.service.ProductServiceImpl;

public class ProductClient {

	public static void main(String[] args) {
		ProductService ps=new ProductServiceImpl();

		System.out.println(" =====Menu=====");
		System.out.println(" 1.add Product");
		int ch=1;
		Scanner sc=new Scanner(System.in);
		do {
			switch (ch) {
			case 1:  {   System.out.println("enter product details to be added");
			             Product p=new Product();
			             p.setProductId(sc.nextInt());   sc.nextLine();
			             p.setProductName(sc.nextLine());
			             p.setQty(sc.nextDouble());
			             p.setPrice(sc.nextDouble());
				         ps.addProduct(p);
				         break;
					}
			case 2: {}
			case 3: {}
			default: {System.out.println(" Wrong data");}
			}
			
			ch=sc.nextInt();
		}while(ch<=4);
		
		
		
	}

}
