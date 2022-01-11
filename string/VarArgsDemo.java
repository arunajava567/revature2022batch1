package com.revature.string;

//Var Args Demo

public class VarArgsDemo
{
	static int sum(String name,int... n) //avoid overloading
	{
		int sum=0;
	
		for(int i=0;i<n.length;i++)
			sum = sum + n[i];
         System.out.println(name);
		return sum;	
	}
	public static void main(String[] args)
	{
	//	System.out.println(sum(10,20,30));

	//	System.out.println(sum(10,20,30,40,50));
		
	//	System.out.println(sum(10,20,2,7,8,9,6,7));
		System.out.println(sum("ram",89,78,67));
		
		int a[]= {3,4,5,2,6,7,89};
		int b[]=new int[5]; //empty
		System.arraycopy(a,0, b,2,3);
		
		System.out.println("array source  elements");
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0;i<b.length;i++) 
			System.out.print(b[i]+" ");
		
		System.out.println("for each elements");
		for(int x:a) 
			System.out.println(x);
		
		
		
		
	}
}