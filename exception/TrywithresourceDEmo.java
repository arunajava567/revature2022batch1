package com.revature.exception;

import java.io.FileReader;

public class TrywithresourceDEmo {

	public static void main(String[] args) {
		//try with resource , auto closable   1.7
		try(FileReader f=new FileReader("e:\\abc.txt")) 
		{
			
			
			//f.read
			//....
			//  1 
			// 2 
			
		} //jk1.7 multi catch block
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException  e) {
			e.printStackTrace();
		}
		

	}

}
