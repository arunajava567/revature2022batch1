// Demonstrate FileWriter. 
import java.io.*; 

class FileWriterDemo
{
	public static void main(String args[]) throws Exception
	{
		String source = "Now is the time for all good men\\n" 
		+ " to come to the aid of their country\\n" 
		+ " and pay their due taxes."; 

		char buffer[] = new char[source.length()]; 
		
		source.getChars(0, source.length(), buffer, 0);  
		
		FileWriter f1 = new FileWriter("fw.txt"); 
		
		f1.write(buffer); 
		
		f1.close(); 
	} 
}