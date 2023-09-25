package stringmethods;

import java.util.Arrays;

public class SplitExample {

	public static void main(String[] args) {
		/*
		 * split() method The split() method divides the string at the specified regex
		 * and returns an array of substrings. The syntax of the string split() method is:
		 * 
		 *  string.split(String regex, int limit)
		 * 
		 * regex - the string is divided at this regex (can be strings) 
		 * limit (optional)- controls the number of resulting substrings
		 * 
		 */
		String vowels = "a::b::c::d::e";
		
		//splitting the string at "::"
		//storing the result in an array of strings
		
		String[] result = vowels.split("::");
		
		// converting array to string and printing it
		System.out.println("result = " + result); //only show where this output reference is
		
		// converting array to string and printing it
		System.out.println("result = " + Arrays.toString(result));

		String cav = "a, b, c, d, e, f,g, h, i, j, k";
		String[] comas = cav.split(",");
		System.out.println("result = " + Arrays.toString(comas));
		
		//First and last name
		//Split into first name and last name
		
		String name = "Firstname Lastname";
		String[] names = name.split(" ");
		System.out.println("result = " + Arrays.toString(names));
		
		String fullName = "Getanesh Aberra";
		String[] myName = fullName.split(" ");
		System.out.println("result = " + Arrays.toString(myName));
		
		
		
		
	}

}
