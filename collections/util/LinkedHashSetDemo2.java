import java.util.*;

public class LinkedHashSetDemo2
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();

		al.add("dhoni");
		al.add("yuvi");
		al.add("pavan");
		al.add("anu");
		al.add("yuvi");

		System.out.println(al);

		LinkedHashSet hs = new LinkedHashSet(al);

		System.out.println(hs);
	}
}   