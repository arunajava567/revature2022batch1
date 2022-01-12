package com.revature.exception;
class DepositException extends Exception {
	DepositException(String msg) {
		super(msg);
	
	}

}
public class ExDemo2 {

	public static void main(String[] args) throws DepositException {
		
		int amt=899;
		if(amt<1000)
                throw new DepositException("Minimum deposit amount is: 1000");
		else
			System.out.println(" Thnaks for using banking services");

  //String name=null;
 // System.out.println(name.length());
}

}