package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListiterator {
	// Iterating using Iterator interface
	/*
	 * An Iterator can be used to loop through a LinkedList. The method hasNext( )
	 * returns true if there are more elements in LinkedList and false otherwise.
	 * The method next( ) returns the next element in the LinkedList and throws the
	 * exception NoSuchElementException if there is no next element.
	 */
	public static void main(String[] args) {
		LinkedList<String> lin = new LinkedList<String>();
		lin.add("Sam");
		lin.add("Bob");
		lin.add("Kal");
		lin.add("Dan");
		lin.add("Nathan");

		System.out.println("The linkedList elements are: ");
		Iterator itr = lin.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
