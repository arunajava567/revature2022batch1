import java.util.*;

public class TreeSetDemo3
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet();

		t.add("A");
		t.add("Z");
		t.add("X");
		t.add("C");
		t.add("B");
		
		t.add(null);
		
		System.out.println(t);
	}
}