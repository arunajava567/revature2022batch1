package com.revature.controlstructures;

public class Fordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<10;i++)
	System.out.println(i);
		
System.out.println("array elements simple for ");
int a[]= {2,3,1,4,5,6,7,8,9};
for(int i=1;i<a.length;i++)
	System.out.println(a[i]);

System.out.println("array elements for each ");
for( int x: a)
	System.out.println(x);

		
	}

}
