import java.util.*;

public class TreeMapDemo2
{
	public static void main(String args[])
	{
		TreeMap tm = new TreeMap(new MyComparator());

		tm.put(new Integer(5),"ramu");
		tm.put(new Integer(2),"ravi");
		tm.put(new Integer(1),"pavan");
		tm.put(new Integer(4),"veeru");
		
		System.out.println(tm);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		
		int i1 = I1.intValue();
		int i2 = I2.intValue();

		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		else 
			return 0;
	}
}