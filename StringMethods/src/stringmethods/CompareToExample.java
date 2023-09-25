package stringmethods;

public class CompareToExample {

	public static void main(String[] args) {
		/* compare To()method:
		 * The Java String compareTo() method compares the given string with the current
		 * string. It is a method of ‘Comparable’ INTERFACE that is IMPLEMENTED by the
		 * String class. It either returns a positive number, a negative number, or 0
		 */
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hemlo";
		String s4 = "flag";
		
		System.out.println(s1.compareTo(s2));

		System.out.println(s1.compareTo(s3));

		System.out.println(s1.compareTo(s4));
		

	}

}
