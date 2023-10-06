package guidedlab_303_11_5hashsetandtreeset;

import java.util.HashSet;

public class HashSetUnion {


	public static void main(String[] args) {
		
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(10);
		evenNumbers.add(8);
		System.out.println("HashSet1: " + evenNumbers);
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(3);
		evenNumbers.add(7);
		System.out.println("HashSet2: " + numbers);
		
		// Union of two set
		numbers.addAll(evenNumbers);
		System.out.println("Union of two HashSet: " + numbers);


	}

}
