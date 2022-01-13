package com.revature.io;

import java.io.*;
public class Demo1 {

	public static void main(String[] args) throws IOException{
		
		FileReader f1=new FileReader("e:\\Demo.java");
		BufferedReader br=new BufferedReader(f1);
	    FileWriter f2=new FileWriter("e:\\Revaturedemooutput.txt",true);
		BufferedWriter bw=new BufferedWriter(f2);
		  
		String line=null;  
		
		 while((line=br.readLine())!=null)
		 { System.out.print(line);
		 bw.write(line); 
		 }
		
		 f1.close();
		 br.close();
		 bw.close();
		 f2.close();
		 
		/*
		 * FileInputStream f1=new FileInputStream("e:\\Demo.java");
		 * 
		 * FileOutputStream f2=new FileOutputStream("e:\\Revaturedemooutput.txt",true);
		 * int k; while((k=f1.read())!=-1) { System.out.print((char)k);
		 * f2.write((char)k); }
		 */
		
		/*
		 * BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 * String name=br.readLine(); Integer marks=Integer.parseInt(br.readLine());
		 * System.out.println("Name:"+name +" Marks:"+marks);
		 */
		
		f1.close();
		f2.close();

	}

}
