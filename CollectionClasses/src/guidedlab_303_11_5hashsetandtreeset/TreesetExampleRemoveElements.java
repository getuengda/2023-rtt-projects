package guidedlab_303_11_5hashsetandtreeset;

import java.util.TreeSet;

public class TreesetExampleRemoveElements {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(3);
		numbers.add(7);
		numbers.add(9);
		System.out.println("TreeSet: " + numbers);

		// Using the remove() method
		boolean value1 = numbers.remove(3);
		System.out.println("Is 3 removed? " + value1);
		boolean value2 = numbers.remove(0);
		System.out.println("Is 0 removed? " + value2); // false because 0 is not an element

		// Using the removeAll() method
		boolean value3 = numbers.removeAll(numbers);
		System.out.println("Are all elements removed? " + value3);

	}

}
