package enhancedforloops;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {

	public static void main(String[] args) {
		/* Java enhanced loop
		 * The for statement has another form designed to iterate through arrays and
		 * collections. The syntax of the Java enhanced loop is that it can be applied
		 * to arrays, various collection classes, and any class implementing the
		 * Iterable interface.
		 */
		double[] doubleArray = new double[10];
		
		doubleArray[0] = 1.0;
		doubleArray[1] = 5.0;
		doubleArray[2] = 4.0;
		doubleArray[3] = 7.0;
		doubleArray[4] = 3.0;
		doubleArray[5] = 11.0;
		doubleArray[6] = 13.0;
		doubleArray[7] = 17.0;
		doubleArray[8] = 23.0;
		doubleArray[9] = 26.0;
		
		//List arrays
		for(double numbers : doubleArray) {
			System.out.println(numbers);
		}
	
		
		

	}

}
