package stringmethods;

public class JavaStringComparesContentAndReference {

	public static void main(String[] args) {
		/*
		 * We can compare String in Java based on content and reference. It is used in
		 * authentication (by equals() method), sorting (by compareTo() method), and
		 * reference matching (by == operator) etc. There are three ways to compare,
		 * String in Java: By Using equals() Method. By Using == Operator. By
		 * compareTo() Method.
		 */
		System.out.println("Here two strings are compared to using the \'equals() method\' ");
		TestStringComparison();

		System.out.println("Compare using \'==\' operator and compares references, not value");
		TestStringComparison2();

		System.out.println("CompareTo method compares values lexicographically, It returns an integer value "
				+ "that describes if the first string is less than, equal to, or greater than the second string");
		Teststringcomparison3();

	}

	private static void TestStringComparison() {
		// TODO Auto-generated method stub
		String s1 = "PerScholas";
		String s2 = "PerScholas";

		String s3 = new String("PerScholas");
		String s4 = "Teksystem";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

		/*
		 * In the above code, two strings are compared to using the equals() method of
		 * String class. The result is printed as Boolean values, true or false.
		 */

	}

	public static void TestStringComparison2() {

		// The == operator compares references, not values.

		String s1 = "Perscholas";
		String s2 = "Perscholas";

		String s3 = new String("Perscholas");

		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in non-pool)
	}

	public static void Teststringcomparison3() {
		/*
		 * CompareTo method compares values lexicographically, It returns an integer
		 * value " + "that describes if the first string is less than, equal to, or
		 * greater than the second string. Return 0 if this string is the same as
		 * another; return <0 if lexicographically less than another; or >0
		 * 
		 */

		String s1 = "Perscholas";
		String s2 = "Perscholas";
		String s3 = "Perschola";
		String s4 = "PerscholasX";
		
		System.out.println(s1.compareTo(s2)); // return zero
		System.out.println(s1.compareTo(s3)); // return one because s1 > s3 
		System.out.println(s1.compareTo(s4)); // return -1 because s1 < s4

	}

}
