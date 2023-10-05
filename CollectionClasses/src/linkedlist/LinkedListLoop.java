package linkedlist;

import java.util.LinkedList;

public class LinkedListLoop {
	// Iterating using Enhanced for loop
	public static void main(String[] args) {
		LinkedList<String> lin = new LinkedList<String>();
		lin.add("Betty");
		lin.add("Bob");
		lin.add("Sara");
		lin.add("Dan");
		lin.add("Nathan");
		System.out.println("The linkedlist elements are: ");
		
		// Enhanced for each loop
		for(String name: lin) {
			System.out.println(name);
		}

	}

}
