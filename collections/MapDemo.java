package com.revature.collections;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
	//HashMap, LinkedHashMap, TreeMap
		Map<Integer,Object> map=new HashMap<Integer,Object>();
		
		map.put(2, new Product(101,"Bag"));
		
		map.put(1, 24);
		map.put(5, "java");
		map.put(4, 34543.34543);
		map.put(8, 'd');
		map.put(9, new Product(102,"Bags"));
		map.put(3, 1234);
		System.out.println(map);
		
		Set ks=map.keySet();
		System.out.println(ks);
		
		Collection val=map.values();
		System.out.println(val);
		
		Set en=map.entrySet();
		
		System.out.println(en);
		
		Iterator i=en.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+"  "+ entry.getValue());
		}
		

	}

}
