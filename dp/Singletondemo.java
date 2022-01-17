package com.revature.dp;
//1.creational 2.structural 3.behavioural 4. misc /j2ee
//singletn,prototype( clone() ) ,factory is creation
class Singleton1{// that restrict to create single object
	
	public static  Singleton1 s=null;
	private Singleton1() {
		
	}
	public static Singleton1 getInstance() { //create object statically and return publicly
		if(s==null)
			s=new Singleton1();
		
	   return s;
	}
}
public class Singletondemo {

	public static void main(String[] args) {
		 
		Singleton1 s1= Singleton1.getInstance();     //new Singleton1();
		System.out.println(s1);
		Singleton1 s2= Singleton1.getInstance();     //new Singleton1();
		System.out.println(s2);

	}

}
