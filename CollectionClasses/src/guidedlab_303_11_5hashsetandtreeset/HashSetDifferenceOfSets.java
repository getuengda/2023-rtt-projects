package guidedlab_303_11_5hashsetandtreeset;

import java.util.HashSet;

public class HashSetDifferenceOfSets {

	public static void main(String[] args) {
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		primeNumbers.add(7);
		System.out.println("HashSet1: " + primeNumbers);
		
		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		oddNumbers.add(7);
		System.out.println("HashSet1: " + oddNumbers);
		
	    // Difference between HashSet1 and HashSet2
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference : " + primeNumbers);

	}

}
