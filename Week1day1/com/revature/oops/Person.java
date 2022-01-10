package com.revature.oops;

public class Person {
	             //data members , member variable, state
	 Integer id;
	 String name;
	 String address;
	 
	 
	 void readPersonDetails() {//member function, behavior ,methods, funciton
		 id=101;
		 name="ram";
		 address="India";
		 
	 }
	 void dispPersonDetails() {
		  System.out.println(id+"  "+name+"  "+address);
	 }
	 

}
