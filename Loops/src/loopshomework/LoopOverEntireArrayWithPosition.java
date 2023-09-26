package loopshomework;

public class LoopOverEntireArrayWithPosition {

	public static void main(String[] args) {
		int arraySize = 11;

		// the create a new array of type double and next one String with 11 elements ... 0 to 10
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
			System.out.println(value);
		}

	}

}
