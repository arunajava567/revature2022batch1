package com.revature.oops.abstraction;

public class MMRide  extends Ride1{
	
	@Override
	void sq(int x) {
		System.out.println("Volume:"+(3*x+10));
	}
	public static void main(String[] args) {
		Ride r=new MMRide();
		r.sq(8);

	}

}
