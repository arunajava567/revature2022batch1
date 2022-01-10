package com.revature.oops;

public class DatatypeDemo {

	public static void main(String[] args) {
		//8 primitive 
		
		char c='a';
		Character c1='a'; //object autoboxing
		System.out.println(c1); //autounboxing
		
		boolean result=true;
		Boolean result1=true;
		
		byte b=123;
		short s=89;
		int i=234;
		Integer i1=3232;
		
		float f=23.45f;
		long l=3434l;
		double d=2323232323.23;
		
		int x=78;
		double x1=x;  //implicit  upcasting  widening
		
		System.out.println(x+"  "+x1);
		
		double y=2333243242545.5654;
		int y1=(int)y; //explicit downcasting narrowing
        System.out.println(y+  "  "+y1);
	}

}
