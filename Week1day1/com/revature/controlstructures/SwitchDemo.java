package com.revature.controlstructures;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  day=sc.nextLine();
		switch (day) {
		case "m" : {System.out.println("Monday");  break;
		            }
	    case "s" : {System.out.println("Saturday");  break;
	               }
	    default: System.out.println("Wrong Data");
		}
	
	}

}
