package sethashset;

import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> evenNumbers = new TreeSet<>();
		
		// Using the add() method
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		System.out.println("TreeSet: " + evenNumbers);
		
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);
		numbers.add(22);
		
		TreeSet<String> str = new TreeSet<>();
		str.add("Get");
		str.add("Tadd");
		System.out.println("Before adding duplicate string valeuest: " + str);
		
		// addition of duplicate
		str.add("Get");
			//str.add(null); // will throw NullPointerException
		System.out.println("After adding duplicate string valeuest: " + str);
		
		// Addition of duplicate elements
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("After adding 2 and 4 again TreeSet: " + evenNumbers);
		
		// Addition of null values
			//evenNumbers.add(null);
			//evenNumbers.add(null);
		// after we run will get NullPointerException
		System.out.println("After adding two null values TreeSet: " + evenNumbers);
		
		// Using the addAll() method
		numbers.addAll(evenNumbers);
		
		System.out.println("New TreeSet: " + numbers);

	}

}
