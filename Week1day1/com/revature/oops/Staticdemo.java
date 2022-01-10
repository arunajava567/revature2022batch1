package com.revature.oops;

public class Staticdemo {
	static String city="Hyd";
	String name;
	
	static void show() {
		  System.out.println("in show");
	}
	void disp() {
		
	}

	public static void main(String[] args) {
		Staticdemo s=new Staticdemo();
		
		show();
		System.out.println(city);
		System.out.println(s.name);
	
     s.disp();
	}
}