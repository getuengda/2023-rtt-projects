package guidedlab_303_11_5hashsetandtreeset;

import java.util.HashSet;

public class HashSetEnhancedForLoop {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
		hset.add("Apple");
		hset.add("Banana");
		hset.add("Orange");
		hset.add("Fig");
		hset.add("Grape");

		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");

		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Using advanced for loop
		for (String str : hset) {
			System.out.println(" -> " + str);
		}
		
		// HashSet DOES NOT maintain any order, so this order might be changed if you
		// run your code a second time.

	}

}
