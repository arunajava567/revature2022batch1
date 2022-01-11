package com.revature.oops.abstraction;
import java.util.*;

// cannot be instantiated

/*abstract class Sports{
	
	 void tournament() {
		 
	 }
}*/
abstract class Course{
	
abstract void registration(Date dor);  //astract method
abstract void certification(String name);

void show() {  //concrete method
	System.out.println(" in abstract ");
}
}

class JavaCourse extends Course {
	 void registration(Date dor) {
		  System.out.println(new Date());
	 }
	void certification(String name) {
		System.out.println(name);
	}
}

class WebServicesCourse extends Course {
	 void registration(Date dor) {
		  System.out.println("Webservices:"+new Date());
	 }
	void certification(String name) {
		System.out.println("Webservices:"+name);
	}
}

public class AsbtractionDemo {

	public static void main(String[] args) {
		
		Course c;//=new Course();
		c=new JavaCourse();
		c.show();
		c.certification("java Fullstack");
		c.registration(new Date());

		c=new WebServicesCourse();
		c.certification("Webservices");
		c.registration(new Date());
		
		
	}

}
