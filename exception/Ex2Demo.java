package com.revature.exception;
import java.io.*;


class Parent{
	void show()  throws InterruptedException,IOException{
		
	}
}
public class Ex2Demo  extends Parent {
     @Override
	  void show() throws InterruptedException ,FileNotFoundException
	{
		Thread.sleep(800);
		FileReader f=new FileReader("e:\\abc.txt");
	}
	
	public static void main(String[] args) throws InterruptedException,IOException
	{
		Ex2Demo e=new Ex2Demo();
		e.show();

	}

}
