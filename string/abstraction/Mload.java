package com.revature.oops.abstraction;
//compiletime, static poly
public class Mload {
	void sum(int a,int b) {
		System.out.println("sum:"+(a+b));
	}
	void sum(double x, double y,double z ) {
		System.out.println(x+y+z);
		
	}
	void sum(int a[]) {
		int s=0;
		for(int x:a)
			s+=x;
		System.out.println("sum of array :"+s);
	}
	public static void main(String[] args) {
		Mload m=new Mload();
		int a[]= {3,4,5,2,6,7,8};
		m.sum(3,4);
		m.sum(3.45,6.78,9.78);
		m.sum(a);
	}

}
