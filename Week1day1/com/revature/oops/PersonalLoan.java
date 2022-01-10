package com.revature.oops;
//inheritanc e    L -super/parent/base PL -sub/child/derived
public class PersonalLoan extends Loan{ //is a   , Personal is a Loan
	
	String employerName;
	String bankName;
	PersonalLoan() {
		System.out.println("in sub");
	}
	PersonalLoan(int id,String name) {
		super(id,name);
		
	}
	void show() {
		
	}
  void getPersonalLoanDetails() {
	  this.show();  //nesting
	  super.show();
	  
	  System.out.println("PErsonal loan- child " +"  "+super.bankName+"  "+this.bankName);
  }
	
	public static void main(String[] args) {
		PersonalLoan pl=new PersonalLoan();
		pl.disburseLoan();
		pl.applyLoan();
		pl.calculateEmi();
		
		
	}
	
}
