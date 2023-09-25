package hackerrank_stringintro;

import java.util.Scanner;

public class PrintSubstringOfAllCharacters {

	public static void main(String[] args) {
		/*
		 * Given a string, , and two indices, and , print a substring consisting of all
		 * characters in the inclusive range from to . You'll find the String class'
		 * substring method helpful in completing this challenge.
		 * 
		 * Input Format
		 * 
		 * The first line contains a single string denoting . The second line contain
		 * two space-separated integers denoting the respective values of and
		 * Constraints 1 <= |s| <= 100 0 <= start < end <= n String s consists of
		 * English alphabetic letters (i.e. [a -zA-Z]) only String consists of English
		 * alphabetic letters (i.e., ) only. Output Format
		 * 
		 * Print the substring in the inclusive range from to .
		 * 
		 * Sample Input
		 * 
		 * Helloworld 3 7
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String S = in.next();
		
		System.out.println("Enter your start int: ");
		int start = in.nextInt();
		
		System.out.println("Enter your ending int: ");
		int end = in.nextInt();
		
		System.out.println(S.substring(0, 4));

	}

}
