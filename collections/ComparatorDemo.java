package com.revature.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	Integer id;
	String name;
	Double sal;
	
	public Employee(Integer id, String name, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}

class IdComparator implements Comparator{
	
	public int compare(Object o1,Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		 if (e1.id>e2.id)
			 return +1; 
		 else if(e1.id<e2.id) 
			 return -1; 
		 else 
			 return  0;
		
	}
}


class NameComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.name.compareTo(e2.name);
		
	}
	
}
class SalaryComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		 if (e1.sal>e2.sal)
			 return +1; 
		 else if(e1.sal<e2.sal) 
			 return -1; 
		 else 
			 return  0;
		
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<Employee>();
		
		elist.add(new Employee(10,"bindu",89786.90));
		elist.add(new Employee(9,"kiran",79786.90));
		elist.add(new Employee(05,"manisha",99786.90));
		elist.add(new Employee(20,"amar",88786.90));
		
		System.out.println(elist);
		Collections.sort(elist,new NameComparator());
		System.out.println(elist);
		Collections.sort(elist,new IdComparator());
		System.out.println(elist);
		Collections.sort(elist,new SalaryComparator());
		System.out.println(elist);

	}

}
