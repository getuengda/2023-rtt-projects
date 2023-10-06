package treemap;

import java.util.TreeMap;

public class TreeMapClassAccessElements {
	/*
	 * How to use the get() method to access the value from the hashmap. How to use
	 * keySet(), values(), and entrySet(). We can also access the keys, values, and
	 * key/value pairs of the hashmap as set views.
	 */
	public static void main(String[] args) {
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		System.out.println("TreeMap: " + numbers);

		// Using entrySet()
		System.out.println("Key/Value mappings: " + numbers.entrySet());

		// Using keySet()
		System.out.println("Keys: " + numbers.keySet());

		// Using values()
		System.out.println("Values: " + numbers.values());

	}

}
