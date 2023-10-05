package collectionexamplesdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	
	public static void main(String[] args) {
		
		Set<String> stringSet = new HashSet<>(); // duplicate value not shown in our out put
		stringSet.add("a");
		stringSet.add("b");
		stringSet.add("c");
		stringSet.add("d");
		stringSet.add("a");
		
		ArrayList<String> listString = new ArrayList<String>(); // duplicate values allowed
		listString.add("a");
		listString.add("b");
		listString.add("c");
		listString.add("d");
		listString.add("a");
		listString.add("cinziro");
		listString.add("belay");
		listString.add("alem");
		listString.add("cinziro");
		listString.add("alem");
		
		// get by a position from a list
		String value = listString.get(7);
		
		Set<String> nameSet = new HashSet<>();
		
		stringSet.add("cinziro");
		stringSet.add("belay");
		stringSet.add("alem");
		stringSet.add("cinziro");
		stringSet.add("alem");
		
		for( String string: stringSet) {
			System.out.println("List of added strings: " + string);
		}
		
		// Using list to show the duplicate values in our lists
		
		System.out.println("List of added strings: " + listString);
		System.out.println("Print the value at position: " + value);
		
		
		for( String name: nameSet) {
			System.out.println("List of added nameSet: " + name);
		}
		

	}

}
