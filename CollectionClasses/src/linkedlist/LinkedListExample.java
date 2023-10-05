package linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
	// LinkedList<E> Declaration and Initialization
	/*
	 * In this example, we will demonstrate, how to declare a Linkedlist, how to
	 * initialize elements in a LinkedList by using built- in methods, how to get
	 * elements, and how to remove elements from LinkedList.
	 */

	public static void main(String[] args) {
		// create linked List
		LinkedList<String> linkObj = new LinkedList<String>();
		// Adding elements
		linkObj.add("A");
		linkObj.add("B");
		linkObj.add("C");
		linkObj.add("D");
		System.out.println(linkObj);

		// Add elements at specified position
		linkObj.add(4, "A");
		linkObj.add(5, "A");
		System.out.println(linkObj);

		// Adding an element to the first position
		linkObj.addFirst("AddedOnFirst");

		// Add an element at the last position
		linkObj.addLast("LastAdded");
		System.out.println(linkObj);

		System.out.println("ELement on Index 4: " + linkObj.get(4));

		// set() method for override or replace any element
		linkObj.set(2, "B is replaced by BBBBB");
		System.out.println(linkObj);

		// Remove element
		linkObj.remove(0); // removes AddedOnFirst
		System.out.println(linkObj);

		linkObj.remove("A"); // removes A
		System.out.println(linkObj);

	}

}
