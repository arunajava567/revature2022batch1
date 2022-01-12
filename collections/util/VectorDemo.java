import java.util.*;

public class VectorDemo
{
	public static void main(String args[])
	{
		Vector v = new Vector();
		
		v.addElement("A");
		
		System.out.println(v.capacity());

		for(int i=1;i<=15;i++)
		{
			v.addElement(new Integer(i));
		}
		System.out.println(v.capacity());
		
		System.out.println(v);
	}
}