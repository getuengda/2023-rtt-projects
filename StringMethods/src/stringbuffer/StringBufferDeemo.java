package stringbuffer;

public class StringBufferDeemo {

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

		StringBuffer str = new StringBuffer("Java Full Stack Developer");
		int len = str.length();
		System.out.println("Length : " + len);
		int cap = str.capacity();
		System.out.println("Capacity : " + cap);
//
//		// ----- append()--------------------
		str.append(" and Software Eng "); // appends a string in the previously defined string.
		System.out.println(str);
		str.append("Java is my favourite language ");
		str.append("but i love python");
		System.out.println(str.toString());
//		// ----------- reverse()----------------------
		StringBuffer stringName = new StringBuffer("Welcome to Per Scholas");
		System.out.println("Original String: " + stringName);
		stringName.reverse();
		System.out.println("Reversed String: " + stringName);

//		// ------- inser() ---------
		StringBuffer s = new StringBuffer("Java");
		s.insert(0, "language");
		System.out.println(s);
//		// --------- replace()---------
		StringBuffer sT = new StringBuffer("Java");
		sT.replace(0, 2, "Hello");
		System.out.println(sT);
//
		StringBuffer str2 = new StringBuffer("Welcome to Java Fullstack");
		System.out.println("Original string: " + str2);
		System.out.println("Substring with start index: " + str2.substring(5));
		System.out.println("Substring with start and end index: " + str2.substring(5, 10));
		
		StringBuffer sb = new StringBuffer("135");
		sb.replace(0, 5, "6789");
		System.out.println(sb);
		sb.insert(0, "12345");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
	}

}
