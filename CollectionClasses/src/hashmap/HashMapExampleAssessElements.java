package hashmap;

import java.util.HashMap;

public class HashMapExampleAssessElements {
	/*
	 * The methods that we used in our code include: 
	 * entrySet() - returns a set of
	 * all the key/values mapping (entry) of a treemap. 
	 * keySet() - returns a set of
	 * all the keys of a tree map. 
	 * values() - returns a set of all the maps of a
	 * tree map.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();

		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashMap: " + languages);

		// get() method to get value
		String value = languages.get(1);
		System.out.println("Value at index 1: " + value);

		// return set view of keys using keySet()
		System.out.println("Keys: " + languages.keySet());

		// return set view of key/value pairs using entrySet()
		System.out.println("Key/Value mapping: " + languages.entrySet());
	}

}
