package arraytolist;

import java.util.ArrayList;

public class MyListRunner {

	public static void main(String[] args) throws InvalidStringException{
		ArrayToList myList = new ArrayToList();

        // Convert a static array to a dynamic list.
        String[] a = {"Abu", "Dan", "Misha"};
        myList.convert(a);

        // Replace the element at index 1 of the list with an empty string.
        myList.replace(1);

        // Remove all the empty strings from the list.
        ArrayList<String> compactedList = myList.compact();

        // Print the contents of the compacted list to the console.
        for (String element : compactedList) {
            System.out.println(element);
        }

	}

}
