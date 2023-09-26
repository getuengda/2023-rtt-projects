package arraysexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayDemoOne {

	public static void main(String[] args) {
		int arraySize = 11;

		// this create a new array of type double and String each with 11 elements ... 0 to 10
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];

		stringArray[0] = "One";
		stringArray[1] = "Two";
		stringArray[4] = "Four";
		stringArray[6] = "Six";
		stringArray[7] = "Seven";
		stringArray[9] = "Nine";

		int count = 0;
		int sumNullCount = 0;
		
		System.out.println("The value in position 0 is: " + stringArray[0]);
		System.out.println("The value in position 7 is: " + stringArray[7]);
		System.out.println("The value in position 10 is: " + stringArray[10]);

		// loop over the entire array and print the value in each location
		for (int position = 0; position < stringArray.length; position++) {
			System.out.println("The value in position: " + position + " is " + stringArray[position]);
		}

		// Enhanced Loop
		System.out.println("\n///// Enhanced for loop ////");

		for (String value : stringArray) {
			System.out.println("The value of pos is: " + value);
		}

		// write a for loop that counts the number of nulls in the array
		System.out.println("\n///// Count Null values ////");
		for (String value : stringArray)
			if (value == null) {
				sumNullCount = sumNullCount + 1;
			}
		System.out.println("The number of times null value is: " + sumNullCount);
			
		// THE FOLLOWING HOMEWORK IS COMPLETED IN SEPARATE CLASSES inside loops package
		// Write a for loop that tells me the location of the first null in the way

		// Write a for loop that tells me how many values not null

		// Write a for loop that tells me the last position in the array

		// Write a for loop that starts at the final position in the array and count
		// down

		// Loop over the array and count the number of letters that are not vowels
	
	}

}
