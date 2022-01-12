import java.util.*;

public class HashtableDemo
{
	public static void main(String args[])
	{
		Hashtable ht = new Hashtable();

		ht.put(new Temp(5),"A");
		ht.put(new Temp(2),"B");
		ht.put(new Temp(6),"C");
		ht.put(new Temp(15),"D");
		ht.put(new Temp(23),"E");
		ht.put(new Temp(16),"F");
		
		System.out.println(ht);
	}
}

class Temp
{
	int i;
	
	Temp(int i)
	{
		this.i = i;
	}
	
	public int hashCode()
	{
		return i;
	}

	public String toString()
	{
		return i+"";
	}
}