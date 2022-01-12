package com.revature.exception;

public class ExDemo1 {

	public static void main(String[] args)  {
		
	//	Thread.sleep(1000);  //compile  time , checked
		int b[]= {4,5,6};
		try {
			try {
			int x=10/0; //exception   //runtime,unchecked
			System.out.println(x);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
				//e.printStackTrace();
				//System.out.println(e.getMessage());
			}
			System.out.println(b[4]);
			
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			
		}
		finally{ //optional , release the resources used by try
			//db.close();
			//f.close();    closing of resources
		}
		System.out.println("Thank you");
		
	
	}

}
