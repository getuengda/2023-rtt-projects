package hackerrank_stringintro;

import java.util.Scanner;

public class StringCharacterLength {

	public static void main(String[] args) {
		/*
		 * This exercise is to test your understanding of Java Strings. A sample String
		 * declaration:
		 * 
		 * String myString = "Hello World!" The elements of a String are called
		 * characters. The number of characters in a String is called the length, and it
		 * can be retrieved with the String.length() method.
		 * 
		 * Given two strings of lowercase English letters, and , perform the following
		 * operations:
		 * 
		 * Sum the lengths of and . Determine if is lexicographically larger than (i.e.:
		 * does come before in the dictionary?). Capitalize the first letter in and and
		 * print them on a single line, separated by a space. Input Format
		 * 
		 * The first line contains a string . The second line contains another string .
		 * The strings are comprised of only lowercase English letters.
		 * 
		 * Output Format
		 * 
		 * There are three lines of output: For the first line, sum the lengths of and .
		 * For the second line, write Yes if is lexicographically greater than otherwise
		 * print No instead. For the third line, capitalize the first letter in both and
		 * and print them on a single line, separated by a space.
		 * 
		 * Sample Input 0
		 * 
		 * hello java
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character for String A: ");
		String A = sc.next();
		
		System.out.println("Enter a character for String B: ");
		String B = sc.next();

		// Sum the lengths of the strings.
		int lengthSum = A.length() + B.length();

		// Determine if the first string is lexicographically larger than the second
		// string.
		boolean isString1Larger = A.compareTo(B) > 0;

		// Capitalize the first letter of each string.
		String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
		String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

		// Print the output.
		System.out.println(lengthSum);
		System.out.println(isString1Larger ? "Yes" : "No");
		System.out.println(capitalizedA + " " + capitalizedB);

	}

}
