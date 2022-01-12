import java.util.*;

public class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		
		l.add("naveen");
		l.add(new Integer(10));
		l.add(null);
		l.add("naveen");

		//l.set(0,"suresh");
		//l.add(0,"pavan");

		System.out.println(l);
	}
}