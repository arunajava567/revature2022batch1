import java.util.*;

public class TreeSetDemo2
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet();

		t.add("A");
		t.add("Z");
		t.add("X");
		t.add("C");
		t.add("B");
		
		//t.add(new Integer(10));
		
		System.out.println(t);
	}
}