import java.io.*;

public class SerializationDemo 
{
	public static void main(String args[]) 
	{
		try 
		{
			// Object serialization
			MyClass object1 = new MyClass("Hello", -7, 2.7e10);
	
			System.out.println("object1: " + object1);
			
			FileOutputStream fos = new FileOutputStream("serial1.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(object1);
			
			oos.flush();
			
			oos.close();
		}
		catch(IOException e) 
		{
			System.out.println("Exception during serialization: " + e);
			
			System.exit(0);
		} 
	}
}
		
class MyClass implements Serializable 
{
	int i;
	double d;
	String s;
	
	public MyClass(String s, int i, double d)
	{
		this.s = s;
		this.i = i;
		this.d = d;
	}
	
	public String toString() 
	{
		return "s=" + s + "; i=" + i + "; d=" + d;
	}
}