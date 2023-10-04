package sortarraylistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListCollectionsSortExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(7);
		numbers.add(18);
		numbers.add(5);
		numbers.add(2);
		System.out.println("Before : " + numbers);
		
		// Sorting an ArrayList using Collections.sort() method
		Collections.sort(numbers);
		System.out.println("After : " + numbers);
		
		// create an ArrayList
	    ArrayList<String> languages = new ArrayList<>();
	    // add elements to ArrayList
	    languages.add("Python");
	    languages.add("Swift");
	    languages.add("C");
	    languages.add("JavaScript");
	    System.out.println("Unsorted ArrayList: " + languages);
	    // sort the ArrayList in ascending order
	    languages.sort(Comparator.reverseOrder());
	    System.out.println("Sorted ArrayList: " + languages);


	}

}
