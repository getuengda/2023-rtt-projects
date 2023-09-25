package stringmethods;

public class ConcatDemo {

	public static void main(String[] args) {
		/*
		 * concat()method You can also use the + operator to concatenate two or more
		 * strings. But the Java String class provides the concat() method. This method
		 * combines a specific string at the end of another string, and ultimately
		 * returns a combined string.
		 */

		// By using concat method

		String str1 = "Learn ";
		String str2 = "Java";

		// concatenate str1 and str2
		System.out.println(str1.concat(str2));

		// By using + operator

		String s1 = "hello ";
		String s2 = "Learners";

		String s3 = s1 + s2;

		System.out.println(s3);

		// Three strings are concatenated

		String message = "Welcome " + "to " + "Java";
		System.out.println(message);

		// String chapter is concatenated with number 2
		String s4 = "Chapter" + 2;
		System.out.println(s4);

		// String chapter is concatenated with number 2
		String s5 = "Supplement" + 'B';
		System.out.println(s5);

	}

}
