package com.revature.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(2);
		v.add(56);
		v.add(45);
		//slow
		Enumeration e=v.elements();    //slow, leagcy , remove is not possible
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Iterator i=v.iterator(); //faster, used with all collections, remove can be done
		while(i.hasNext()) {
			if((Integer)i.next()==2)
				i.remove();
			
		}
		System.out.println(" List iterator.....");
		ListIterator li=v.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
