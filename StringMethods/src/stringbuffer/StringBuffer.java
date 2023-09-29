package stringbuffer;
import java.lang.*;

public class StringBuffer {

	public StringBuffer(String string, int i) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		/*
		 * new StringBuffer() → Creates an empty String buffer with the initial capacity
		 * of 16.
		 * 
		 * new StringBuffer​(int capacity) → Creates an empty String buffer with the
		 * specified capacity as length. StringBuffer​(100) → Room for 100 characters.
		 * 
		 * new StringBuffer​(String str) → Creates a String buffer with the specified
		 * string. New StringBuffer(“Per Scholas”) → Room for given string and 16
		 * additional characters.
		 */

		StringBuffer str = new StringBuffer("Java Full Stack Developer", 20);
		int len = str.length();
		System.out.println("Length : " + len);
		int cap = str.capacity();
		System.out.println("Capacity : " + cap);

		// ----- append()--------------------
		str.append("and Software Eng "); // appends a string in the previously defined string.
		System.out.println(str);
		str.append("Java is my favourite language ");
		str.append("but i love python");
		System.out.println(str.toString());
		// ----------- reverse()----------------------
		StringBuffer stringName = new StringBuffer("Welcome to Per Scholas", 20);
		System.out.println("Original String: " + stringName);
		stringName.reverse();
		System.out.println("Reversed String: " + stringName);

		// ------- inser() ---------
		StringBuffer s = new StringBuffer("Java", 10);
		s.insert(4, "language");
		System.out.println(s);
		// --------- replace()---------
		StringBuffer sT = new StringBuffer("Java", 0);
		sT.replace(0, 2, "Hello");
		System.out.println(sT);

		StringBuffer str2 = new StringBuffer("Welcome to Java Fullstack", 20);
		System.out.println("Original string: " + str2);
		System.out.println("Substring with start index: " + str2.substring(5));
		System.out.println("Substring with start and end index: " + str2.substring(5, 10));

	}

	private String substring(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private void replace(int i, int j, String string) {
		// TODO Auto-generated method stub
		
	}

	private void reverse() {
		// TODO Auto-generated method stub

	}

	private void append(String string) {
		// TODO Auto-generated method stub

	}

	private int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String substring(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(int i, String string) {
		// TODO Auto-generated method stub

	}

}
