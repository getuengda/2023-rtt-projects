package arraytolist;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList implements MyList {

	// initializes the empty list arrayToList
	private ArrayList<String> arrayToList = new ArrayList<>();

	public ArrayToList() {
	}

	/*
	 * adds the strings in the array a, to the list arrayToList. Also prints
	 * "I have added the string: {string} at the index: {index}".
	 */

	@Override
	public void convert(String[] a) throws InvalidStringException {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null || a[i].isEmpty()) {
				throw new InvalidStringException("Invalid string: " + a[i]);
			}
			// adds the strings in the array a, to the list arrayToList
			arrayToList.add(a[i]);
			System.out.println("I have added the string: " + a[i] + " at the index: " + i);
		}
	}
	/*
	 * replace the string at the index idx of arrayToList, with an empty string.
	 * Also print "I have replaced the string: {string} with a null string".
	 */
	@Override
	public void replace(int idx) throws InvalidStringException {
		if (idx < 0 || idx >= arrayToList.size()) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + idx);
		}
		String oldString = arrayToList.get(idx);
		arrayToList.set(idx, null);
		System.out.println("I have replaced the string: " + oldString + " with a null string");
	}
	// the next method should remove all the empty string from the list and return the resulting list.
	@Override
	public ArrayList<String> compact() {
		ArrayList<String> compactedList = new ArrayList<>();
		for (String arr : compactedList) {
			if (arr != null) {
				compactedList.add(arr);
			}
		}
		System.out.println("Compacted List: " + compactedList);
		return compactedList;
	}

}
