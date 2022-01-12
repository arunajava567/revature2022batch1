import java.util.*;

public class TreeSetDemo6
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet();

		t.add("A");
		t.add("Z");  
		t.add("L");
		t.add("B");
		t.add("C");
		t.add("X");
		
		System.out.println(t);
		
		SortedSet s = t.headSet("L");
		
		System.out.println(s);
	}
}