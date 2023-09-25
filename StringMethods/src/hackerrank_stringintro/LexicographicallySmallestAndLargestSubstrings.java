package hackerrank_stringintro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LexicographicallySmallestAndLargestSubstrings {

	 public static String getSmallestAndLargest(String s, int k) {
	        // Create a list to store all the substrings of length `k`.
	        List<String> substrings = new ArrayList<>();

	        // Iterate over the string and add all the substrings of length `k` to the list.
	        for (int i = 0; i <= s.length() - k; i++) {
	            substrings.add(s.substring(i, i + k));
	        }

	        // Sort the list of substrings lexicographically.
	        substrings.sort(String::compareTo);

	        // Get the first and last elements of the sorted list of substrings.
	        String smallestSubstring = substrings.get(0);
	        String largestSubstring = substrings.get(substrings.size() - 1);

	        // Return the two substrings separated by a newline character.
	        return smallestSubstring + "\n" + largestSubstring;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String s = scanner.nextLine();
	        int k = scanner.nextInt();

	        String smallestAndLargestSubstrings = getSmallestAndLargest(s, k);

	        System.out.println(smallestAndLargestSubstrings);
	    }

}
