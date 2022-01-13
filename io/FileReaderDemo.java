// Demonstrate FileReader. 
import java.io.*; 

class FileReaderDemo
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr = new FileReader("FileReaderDemo.java"); 

		//BufferedReader br = new BufferedReader(fr); 
		
		String s; 
		int i;
		
		while((i = fr.read()) != -1)
		{
			System.out.print((char)i); 
		} 
		fr.close(); 
	} 
}