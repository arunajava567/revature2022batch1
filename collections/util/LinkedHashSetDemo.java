import java.util.*;

public class LinkedHashSetDemo
{
	public static void main(String args[])
	{
		LinkedHashSet hs = new LinkedHashSet();

		hs.add("B");
		hs.add("z");
		hs.add(new Integer(10));
		hs.add(null);
		hs.add("A");           

		System.out.println(hs.add("C"));

		System.out.println(hs.add("z"));

		System.out.println(hs);
	}
}