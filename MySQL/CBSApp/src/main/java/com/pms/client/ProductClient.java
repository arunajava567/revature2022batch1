package com.pms.client;

import java.util.Scanner;
import java.util.logging.Logger;
import com.pms.model.Product;
import com.pms.service.ProductService;
import com.pms.service.ProductServiceImpl;
public class ProductClient {
	 private static final Logger logger = Logger.getLogger("ProductClient.class");
	
	public static void main(String[] args) throws Exception {
		ProductService ps=new ProductServiceImpl();

		System.out.println(" =====Menu=====");
		System.out.println(" 1.add Product");
		logger.info(" logg started");
		//logger.warning("ssds");
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
			             logger.info("going to service");
				         ps.addProduct(p);
				         break;
					}
			case 2: {   System.out.println("enter product id to be deleted");
							int id=sc.nextInt() ;
                           ps.deleteProduct(id);
           
	         break;
		}
			case 3: {}
			default: {System.out.println(" Wrong data");}
			}
			System.out.println("enter you option to continue(1..4)");
			ch=sc.nextInt();
		}while(ch<=4);
		
		
		
	}

}
