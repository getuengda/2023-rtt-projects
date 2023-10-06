package guidedlab_303_11_5hashsetandtreeset;

import java.util.TreeSet;

public class TreeSetExampleCom {

	public static void main(String[] args) {
		// Create a TreeSet with user-defined comparator
	       TreeSet<String> cities = new TreeSet<>(new TreesetImplementComparatorToSortReverseOrder());
	       //add elements to the comparator
	       cities.add("UAE");
	       cities.add("Mumbai");
	       cities.add("NewYork");
	       cities.add("Hyderabad");
	       cities.add("Karachi");
	       cities.add("Xanadu");
	       cities.add("Lahore");
	       cities.add("Zagazig");
	       cities.add("Yingkou");
	       TreeSet<String> cities_one = new TreeSet<>(new TreesetImplementComparatorToSortReverseOrder());
	       cities_one.add("UAE");
	       cities_one.add("Mumbai");
	       cities_one.add("NewYork");
	       cities_one.add("Hyderabad");
	       
	       TreeSet<String> cities_two = new TreeSet<>(new TreesetImplementComparatorToSortReverseOrder());
	       cities_two.add("UAE");
	       cities_two.add("Mumbai");
	       cities_two.add("NewYork");
	       cities_two.add("Hyderabad");
	       cities_two.add("Zagazig");
	       cities_two.add("Yingkou");
	       //print the contents of TreeSet
	       System.out.println("TreeSet: " + cities);
	       System.out.println("TreeSet: " + cities_one);
	       System.out.println("TreeSet: " + cities_two);
	       
	       
	   }


}
