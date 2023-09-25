package stringmethods;

public class StringTrimExample {

	public static void main(String[] args) {

		/*
		 * The Java string trim() method removes the leading and trailing spaces. It
		 * checks the Uni-code value of the space character (‘\u0020’) before and after
		 * the string. If it exists, then remove the spaces and return the omitted
		 * string.
		 */

		String s1 = "  Hello   ";
		System.out.println(s1 + "how are you"); // without trim()
		
		System.out.println(s1.trim() + " how are you"); // with trim()

	}

}
