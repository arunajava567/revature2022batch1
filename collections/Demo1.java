package com.revature.collections;
import java.util.*;


class Product{
	Integer id;
	String name;
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		//HashSet is not ordered
		                    // ordered
		//Set<Integer> hs=new LinkedHashSet<Integer>();
		                       //sorted
		Set<Integer> hs=new TreeSet<Integer>();
		
		hs.add(23);
		hs.add(16);
		hs.add(126);
		hs.add(96);
		System.out.println(hs);
		
		
		//ArrayList l1=new ArrayList();
		/*
		Vector<Object> l1=new Vector<Object>(); //legacy,slow, synhcronized, multithreading
		
		l1.add(34);
		l1.add(67);
		l1.add(new Date());
		l1.add("java");
		l1.add(67);
		l1.add("java");
		l1.add(new Product(101,"Bag"));
		System.out.println(l1);
		
		System.out.println(l1.indexOf(67));
		System.out.println(l1.lastIndexOf(67));
		System.out.println(l1.contains(34));
	//	l1.remove(3);
		//l1.remove("java");
		//l1.clear();
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
				
		List l2=Arrays.asList(20,30,40,50,"java",37);
		
		l1.addAll(l2);
		
		System.out.println(l1);
		
		System.out.println(l1.containsAll(l2));
		
	//	l1.removeAll(l2);
	//	l1.retainAll(l2);
		System.out.println(l1);
		
		Iterator i=l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("for each loop");
		
		for(Object o  : l1 )
		System.out.println(o);
		
		//Iterable
		System.out.println(" this is  using lambda , stream");
		l1.stream().forEach(x->System.out.println(x));
		
		
		List l3=Arrays.asList(5,2,7,8,1,3);
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);
		
		
		Stack s=new Stack();
		s.push(34);
		s.push(12);
		s.push(78);
		System.out.println(s);
		System.out.println(s.pop());
	*/

	}

}
