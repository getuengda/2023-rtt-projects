package arraytolist;

import java.util.ArrayList;

public interface MyList {

	// converts the given string array a to the MyList list
	void convert(String[] a) throws InvalidStringException;

	// replaces the element at the given index idx of the MyList list with the
	// string null
	void replace(int idx) throws InvalidStringException;

	// returns a new ArrayList containing all of the
	// non-null elements of the MyList list.
	ArrayList<String> compact() throws InvalidStringException;

}
