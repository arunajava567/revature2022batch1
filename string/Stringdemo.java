package com.revature.string;
import java.util.StringTokenizer;
public class Stringdemo {
	public static void main(String[] args) {
		//class not a primitive not a wrapper
		//java.lang   ( system,string ,exception, thread),java.util,java.io,java.sql
		
		String s1=new String("Revature"); //2   string object
		//String s4=new String("Revature");
		String s2="Infosys"; //1 string pool  string literal
		//String s3="Infosys";
		
		//string pool
		//immutable , with string operations create duplicates
		//memory  , fast
		
		System.out.println(s1.concat("Technologies")); //duplciate 1
		System.out.println(s1);
		System.out.println(s1.replace("e","w")); //duplciate 1
		System.out.println(s1);
		System.out.println(s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.endsWith("e"));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		
		//mutable, will not create duplicate
		//implicit synchronized , slow lock/unlock ,multithreading context
		//slow
		StringBuffer sb =new StringBuffer("Revature");
		System.out.println(sb.insert(2, "xxxx"));
		System.out.println(sb.append("Pvt Ltd"));
		System.out.println(sb.delete(6, 9));
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		//mutable, willnot create duplicate
		//not synchonized , fast than sb, single  multithread context
		StringBuilder sb1 =new StringBuilder("Revature");
		System.out.println(sb1.insert(2, "xxxx"));
		System.out.println(sb1.append("Pvt Ltd"));
		System.out.println(sb1.delete(6, 9));
		System.out.println(sb1.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb1.capacity());
		System.out.println(sb1.reverse());
		
		
		//String address="RevatureUSer-OMRRoad-Chennai-India";
		String address="RevatureUSer OMRRoad Chennai India";
		
		//StringTokenizer st=new StringTokenizer(address,"-");
		
		StringTokenizer st=new StringTokenizer(address);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
		System.out.println("using for loop with split ");
		String t[]=address.split(" ");
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
		String x="java";
		StringBuffer sb11=new StringBuffer(x);   //string to stringbuffer
		StringBuilder sb12=new StringBuilder(x);   //string to stringbuffer
		String sb11str=sb11.toString();  //sb to string 
		String sb12str=sb12.toString();
		String age="38";
		int agenumber=Integer.parseInt(age); //string into integer
			String bonus="43543543.234";
		double bonusvalue=Double.parseDouble(bonus);
	}
}
