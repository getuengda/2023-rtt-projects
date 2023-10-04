package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExampleTwo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();
		al.add("Jack");
		al.add("Tyler");
		al.add("James");

		/*
		 * In the above code, The Iterator method hasNext() returns true if there are
		 * more elements in Arraylist, and false otherwise. The method next( ) returns
		 * the next element in the Arraylist and throws the exception
		 * NoSuchElementException if there is no next element.
		 */
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Enhanced for each loop
		System.out.println("==== Enhanced for each loop =====");
		for (String st : al) {
			System.out.println(st);
		}

	}

}
