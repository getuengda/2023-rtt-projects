package treemap;

import java.util.TreeMap;

public class TreeMapExampleOne {
	/*
	 * As you can see, all of the duplicate values are present in the output, and
	 * Key is not repeated. The Value of Key 1 and 3 is replaced with new value. If
	 * you try to add a null key, you will get an error. Elements are sorted in
	 * ascending order by Key
	 */
	public static void main(String[] args) {
		TreeMap<Integer, String> mapObj = new TreeMap<>();
		
		mapObj.put(1, "Per Scholas New Yok, NY");
		mapObj.put(2, "Per Scholas Atlanta GA");
		mapObj.put(3, "Per Scholas Columbas, OH");
		mapObj.put(3, "Per Scholas  Florida, Orlando");
		mapObj.put(4, "Per Scholas Chicago, Ill");
		mapObj.put(5, "Per Scholas Chicago, Ill");
		mapObj.put(1, "Per Scholas New Jersey , NJ");
		
		// mapObj.put(null, "Per Scholas Dallas , TX");
		mapObj.put(6, null);
		mapObj.put(7, null);
		System.out.println(mapObj);

	}

}
