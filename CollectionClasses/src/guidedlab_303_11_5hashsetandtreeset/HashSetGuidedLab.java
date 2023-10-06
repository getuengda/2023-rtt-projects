package guidedlab_303_11_5hashsetandtreeset;

import java.util.HashSet;

public class HashSetGuidedLab {
	/*
	 * Example One: Insert Elements to HashSet using addAll(). addAll() - Inserts
	 * all of the elements of the specified collection to the set.
	 */

	public static void main(String[] args) {
		HashSet<Integer> evenNumber = new HashSet<>();
		// using add() method
		evenNumber.add(3);
		evenNumber.add(7);
		evenNumber.add(10);
		evenNumber.add(37);
		System.out.println("HashSet: " + evenNumber);
		
		// using  addAll() method add all above elements to new set
		HashSet<Integer> numbers = new HashSet<>();
		numbers.addAll(evenNumber);
		System.out.println("New HashSet: " + numbers);
		

	}

}
