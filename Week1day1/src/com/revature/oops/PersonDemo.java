package com.revature.oops;
class Customer{
	int id; //instance vraibale
	String name;
	Customer() { //constructor without args
		 id=101; name="Raj"; 
		 }
	 Customer(int id, String name) { //arguments local
		 this.id=id;
		 this.name=name;
	 }
	 
	void dispUpperCase() {
		System.out.println(this.name.toUpperCase());
	}
	
	void show() {
		System.out.println(id+"  "+name);
	}
	
}

public class PersonDemo {  // client , test , run

	public static void main(String[] args) {  //25 FSD
		//Classname objectname=new Classname();
		Person p=new Person();//p is object or reference to Person
		Person p1=new Person();
		
		System.out.println(p.id+"  "+p.name+"  "+p.address);
		p.readPersonDetails();
		p.dispPersonDetails();
		p1.id=102;
		p1.name="ram123";
		p1.address="India123";
		p1.dispPersonDetails();
		
		Customer c=new Customer();//JVM default
		c.show();
		Customer c1=new Customer(123,"Kiran");
		c1.show();
		Customer c2=new Customer(1234,"KiranKumar");
		c2.show();
		c2.dispUpperCase();
	}

}
