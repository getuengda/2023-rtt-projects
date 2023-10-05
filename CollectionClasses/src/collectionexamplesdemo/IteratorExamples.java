package collectionexamplesdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExamples {


	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<>(); // always make your reference small case and plural
		
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(19);
		numbers.add(21);
		numbers.add(23);
		numbers.add(-33);
		numbers.add(47);
		
		
		for(String string : strings ) {
			numbers.remove(0);
			System.out.println("Loop using for --- loop: " + string);
		}
		
		// print after remove
		System.out.println("Loop using for --- loop: " + strings);
		
		// advanced one is to use iterator
		
		Iterator<String> itr = strings.iterator();
		while(itr.hasNext()) {
			System.out.println("Loop using --- Iterator: " + itr.next());
		}
		
		// advanced iteration using iterator
		Iterator<Integer> number = numbers.iterator();
		while(number.hasNext()) {
			//numbers.remove(0); // ConcurrentModificationException
			System.out.println("Loop Nnumbers using --- Iterator: " + number.next());
		}
	}

}
