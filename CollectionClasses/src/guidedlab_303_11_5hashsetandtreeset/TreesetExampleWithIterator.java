package guidedlab_303_11_5hashsetandtreeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExampleWithIterator {
	// The following Java program demonstrates the use of the Iterator to iterate
	// through TreeSet.

	public static void main(String[] args) {
		TreeSet<Integer> num_Treeset = new TreeSet<>();
		num_Treeset.add(30);
		num_Treeset.add(50);
		num_Treeset.add(15);
		num_Treeset.add(25);
		num_Treeset.add(35);
		
		// Call iterator() method to define Iterator for TreeSet
		Iterator<Integer> itr_set = num_Treeset.iterator();
		
		// Access TreeSet elements using Iterator
		while(itr_set.hasNext()) {
			System.out.print(itr_set.next());
			System.out.print(", ");
		}
	}

}
