package com.revature.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//sorting custom objects in collections
class Scholar implements Comparable{ //compareTo
	Integer id;
	String name;
	Integer age;
	
	
	public Scholar(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object o) {
		Scholar s=(Scholar)o;
		return (s.name).compareTo(this.name);  //+1 -1 0
		
		/*
		 * if (this.age>s.age) return +1; else if(this.age<s.age) return -1; else return
		 * 0;
		 */
	}
	 

	@Override
	public String toString() {
		return "Scholar [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

public class Comparabledemo {

	public static void main(String[] args) {
		ArrayList<Scholar> slist=new ArrayList<>();
		slist.add(new Scholar(101,"ram",20));
		slist.add(new Scholar(11,"ravi",22));
		slist.add(new Scholar(10,"arvind",21));
		slist.add(new Scholar(108,"arjun",25));
		
		System.out.println(slist);
		Collections.sort(slist);
		System.out.println(slist);
		
	}

}
