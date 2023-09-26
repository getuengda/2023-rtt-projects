package loopshomework;

import java.util.ArrayList;
import java.util.List;

public class CountNotNullValueInArrayList {

	public static void main(String[] args) {
		int arraySize = 10;
		
		// this create a new array of type String each with 10 elements ... 0 to 9

		String[] stringArray = new String[arraySize];

		stringArray[0] = "One";
		stringArray[1] = "Two";
		stringArray[4] = "Four";
		stringArray[6] = "Six";
		stringArray[7] = "Seven";
		stringArray[9] = "Nine";

		// write a for loop that counts the number of nulls in the array
		int countOfNotNullValue = 0;
		for (String value : stringArray)
			if (value != null) {
				countOfNotNullValue++;
			}
		System.out.println("The number of null value is: " + countOfNotNullValue);
		
	}

}
