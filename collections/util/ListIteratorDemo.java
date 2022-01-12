import java.util.*;

public class ListIteratorDemo
{
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();

		l.add("ravi");
		l.add("ram");
		l.add("raju");
		l.add("ravan");
		l.add(null);
		l.add(null);

		System.out.println(l);
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext())
		{
			String s =(String)li.next();
	
			if(s.equals("raju"))
			{
				li.add("pavan");
			}
		}
		System.out.println(l);
	}
}