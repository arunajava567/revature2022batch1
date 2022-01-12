import java.util.*;

public class HashSetDemo
{
	public static void main(String args[])
	{
		HashSet hs = new HashSet();

		hs.add("B");
		hs.add("C");
		hs.add(new Integer(10));
		hs.add(null);
		//hs.add(null);
		//hs.add("C");
		
		System.out.println(hs.add("C"));
		
		System.out.println(hs.add("z"));
		
		System.out.println(hs);
	}
}