import java.util.*;

public class TreeMapDemo
{
	public static void main(String args[])
	{
		TreeMap tm = new TreeMap();

		tm.put(new Integer(5),"ramu");
		tm.put(new Integer(2),"ravi");
		tm.put(new Integer(1),"pavan");
		tm.put(new Integer(4),"veeru");
		
		System.out.println(tm);
	}
}