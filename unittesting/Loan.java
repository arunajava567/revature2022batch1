package com.revature.unittesting;

public class Loan {
	
	public int getEmi(int amount) {
		return amount/12;
	}

	/*
	 * public static void main(String[] args) { Loan l=new Loan(); int
	 * emi=l.getEmi(600000); System.out.println(emi); if(emi<5000)
	 * System.out.println("within limit-test case passed"); else
	 * System.out.println("out of limit , testcase passed");
	 * 
	 * }
	 */
}
