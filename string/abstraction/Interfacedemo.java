package com.revature.oops.abstraction;

interface Vehicle{ //public,abstract by default
	public static final int x=10;
	void speed();
	void milage();
	//java8
	default void show() {
		
	}
	static void disp() {
		
	}
	
}
interface Parking{
	void slotbooking();
}
class Car implements Vehicle,Parking {
	public void speed() {
		
	}
	public void milage() {
		
	}
	public void slotbooking() {
		
	}
}
class Bus implements Vehicle,Parking {
	public void speed() {
		
	}
	public void milage() {
		
	}
	public void slotbooking() {
		
	}
}
public class Interfacedemo {

	public static void main(String[] args) {
		Vehicle v;//=new Vehicle();
		v=new Car();
		v.milage();
		v.speed();

		v=new Bus();
		v.milage();
		v.speed();
		
		
		
	}

}
