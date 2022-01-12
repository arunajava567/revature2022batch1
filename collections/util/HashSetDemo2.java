import java.util.*;

public class HashSetDemo2
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
		
		HashSet hs = new HashSet(al);
		
		System.out.println(hs);
	}
}