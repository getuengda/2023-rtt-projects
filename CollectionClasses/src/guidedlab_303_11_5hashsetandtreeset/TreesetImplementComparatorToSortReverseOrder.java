package guidedlab_303_11_5hashsetandtreeset;

import java.util.Comparator;

public class TreesetImplementComparatorToSortReverseOrder implements Comparator<String> {
	/*
	 * In this example, we will implement a Comparator class to sort the given
	 * TreeSet alphabetically in reverse order. By default, the TreeSet sorts data
	 * in ascending order. We can also sort TreeSet in a customized order by
	 * defining a new comparator class. In this comparator class, we need to
	 * override the ‘compare’ method to sort the elements of the TreeSet. This
	 * comparator object is then passed to the TreeSet constructor.
	 */
	
	//override compare method to compare two elements of the TreeSet

	@Override
	public int compare(String cities_one, String cities_two) {
		int value =  cities_one.compareTo(cities_two);
	       // sort elements in reverse order
	       if (value > 0) {
	         return -1;
	       }
	       else if (value < 0) {
	         return 1;
	       }
	       else {
	          return 0;
	       }

	}

}
