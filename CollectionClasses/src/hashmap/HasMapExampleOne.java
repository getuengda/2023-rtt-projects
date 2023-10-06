package hashmap;

import java.util.HashMap;

public class HasMapExampleOne {
	/*
	 * In this example, we will demonstrate: How to create a HashMap. How to add
	 * elements to HashMap using put() method. How to add a duplicate Key and Value.
	 * How to add a null Key and value.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> mapObj = new HashMap<>();
		mapObj.put(1, "Per Scholas Yok, NY");
		mapObj.put(2, "Per Scholas Atlanta GA");
		mapObj.put(3, "Per Scholas Columbas, OH");
		mapObj.put(3, "Per Scholas  Florida, Orlando");
		mapObj.put(4, "Per Scholas Chicago, Ill");
		mapObj.put(5, "Per Scholas Chicago, Ill");
		mapObj.put(1, "Per Scholas New Jersey , NJ");
		mapObj.put(null, "Per Scholas Dallas , TX");
		mapObj.put(6, null);
		System.out.println(mapObj);
		/*
		 * As you can see, all of the duplicate values are present in the output, and
		 * Key is not repeated. The Value of Key 1 and 3 is replaced with new values.
		 */

	}

}
