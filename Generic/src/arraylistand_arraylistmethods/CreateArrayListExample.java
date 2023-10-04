package arraylistand_arraylistmethods;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
	/*
	 * This example shows: 
	 * How to create an ArrayList using the ArrayList()
	 * constructor. How to add new elements to an ArrayList using the add() method.
	 */
	
	public static void main(String[] args) {
		// Creating an ArrayList of String
		List<String> animals = new ArrayList<>();

		// Adding new elements to the ArrayList
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");

		System.out.println(animals);

		// adding an element at a particular index in an ArrayList
		animals.add(2, "Elephant");
		animals.add(5, "Camel");
		System.out.println(animals);

	}

}
