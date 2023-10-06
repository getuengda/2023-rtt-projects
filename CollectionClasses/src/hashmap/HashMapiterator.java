package hashmap;

import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapiterator {
	/*
	 * In this example, we will demonstrate, how to iterate through each entry of
	 * the hashmap. We can use enhanced loop. We can iterate through keys only,
	 * vales only, and key/value mapping.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashMap: " + languages);

		// iterate through keys only
		System.out.println("Keys: ");
		for (Integer key : languages.keySet()) {
			System.out.println(key);
		}

		// iterate through values only
		System.out.println("\nValues: ");
		for (String value : languages.values()) {
			System.out.println(value);
		}

		// iterate through key/value entries
		System.out.println("\nEntries: ");
		for (Entry<Integer, String> entry : languages.entrySet()) {
			System.out.println(entry);
		}
	}

}
