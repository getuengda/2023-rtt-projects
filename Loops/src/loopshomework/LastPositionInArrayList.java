package loopshomework;

public class LastPositionInArrayList {

	public static void main(String[] args) {

		int arraySize = 10;

		// this create a new array of type double with 20 elements ... 0 to 19
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];

		stringArray[0] = "One";
		stringArray[1] = "Two";
		stringArray[4] = "Four";
		stringArray[6] = "Six";
		stringArray[7] = "Seven";
		stringArray[9] = "Nine";
		
		// Write a for loop that tells me the last position in the array
		int lastPositionInArray = 0;
		
		for (int position = 0; position < stringArray.length; position++)
			if (position == stringArray.length - 1) {
				lastPositionInArray = position;
				break;
			}
		System.out.println("Position of the last value is: " + lastPositionInArray);

	}

}
