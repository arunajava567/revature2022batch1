import java.util.*;

public class HashtableDemo2
{
	public static void main(String args[])
	{
		Hashtable ht = new Hashtable();

		ht.put(5,"A");
		ht.put(2,"B");
		ht.put(6,"C");
		ht.put(15,"D");
		ht.put(23,"E");
		ht.put(16,"F");
		
		//ht.put(null,"Z");
		
		// ht.put(16,"H");
		
		System.out.println(ht);
	}
}