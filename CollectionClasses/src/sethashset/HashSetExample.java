package sethashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grape");
		hset.add("Fig");
		hset.add("Orange");
		hset.add("Avocado");
		System.out.println("list of hset element: " + hset);

		// Addition of duplicate elements to the HashSet
		hset.add("Fig");
		hset.add("Mango");
		hset.add("Grape");

		// Addition of null values
		hset.add(null);
		hset.add(null);
		hset.add(null);
		
		// display HashSet elements
		System.out.println(hset);
		Iterator<String> itObj = hset.iterator();
		System.out.println("HashSet using Iterator: ");
		
		//Access elements 
		while(itObj.hasNext()) {
			System.out.print(itObj.next());
			System.out.print(", ");
		}
		
		

	}

}
