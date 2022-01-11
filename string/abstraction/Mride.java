package com.revature.oops.abstraction;
//runtime, dynamic
//final 
class Ride{
	final int y=10;
	//final 
	void sq(int x) {
		System.out.println("area:"+(x*x));
		System.out.println(y++);
	}
}
class Ride1 extends Ride {
	@Override
	void sq(int x) {
		System.out.println("Perimeter:"+(4*x));
	}
}

public class Mride {

	public static void main(String[] args) {
		Ride r=new Ride();
		r.sq(8);
		r=new Ride1();
		r.sq(8);
	}

}
