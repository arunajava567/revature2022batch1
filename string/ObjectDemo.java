package com.revature.string;

//java.lang.Object 
//getClass(),hashCode(),equals(),toString()
//wait(),notify() and notifyall() --multithreading
//finalize(),clone()

class Product implements Cloneable {
	int id;
	String name;
	Product() {}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	  @Override 
	  public String toString() 
	  { return "Product [id=" + id + ", name=" +
	  name + "]";
	  }
	 
	public void finalize() {  //begore gc
		id=0;
		name=null;
	}
}


class Vehicle{
	
}
class Car {
	
}
public class ObjectDemo {

	public static void main(String[] args)throws CloneNotSupportedException {
	Product p=new Product(101,"Pen");
	Product p1=new Product(102,"Book");
	System.out.println(p.getClass());// display classname
	System.out.println(p.equals(p1)); //compare 2 objects
	System.out.println(p +"  "+ p.hashCode());
	System.out.println(p1 +"  "+ p1.hashCode());
	
	Product pp=(Product)p.clone();	 //double to int Object->Product explicit reference /object typecasting
		System.out.println(pp);
		
	Vehicle v=new Vehicle();
	Car c=new Car();
	
	v=c;
	
	int a=10;
	double d=a; //implicit
	
	
	}

}
