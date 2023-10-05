package guidedlab_303_11_4linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListsortExample {
	/*
	 * we will demonstrate how to sort a LinkedList using the Collections.sort()
	 * method. Please note that for custom sorting of objects, we can use
	 * Collections.sort(linkedList, comparator) method.
	 */

	public static void main(String[] args) {
		// Create linked list
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("B");
		linkedList.add("F");
		linkedList.add("C");
		linkedList.add("G");
		linkedList.add("D");
		linkedList.add("A");
		linkedList.add("E");

		// Unsorted
		System.out.println(linkedList);

		// 1. Sort the list
		Collections.sort(linkedList);

		// Sorted
		System.out.println(linkedList);

		// 2. Custom sorting
		Collections.sort(linkedList, Collections.reverseOrder());

		// Custom sorted
		System.out.println(linkedList);

	}

}
