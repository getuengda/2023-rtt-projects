package loopshomework;

public class PositionOfFirstNullValue {

	public static void main(String[] args) {
		int arraySize = 10;

		// the create a new array of type double and next one String with 10 elements ... 0 to 10
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];

		stringArray[0] = "One";
		stringArray[1] = "Two";
		stringArray[4] = "Four";
		stringArray[6] = "Six";
		stringArray[7] = "Seven";
		stringArray[9] = "Nine";
		
		// Write a for loop that tells me the location of the first null value in the array
		int firstNull = 0;
		
		//Iterate over the array list to observe where the null value start for validation
		for(String value : stringArray) {
			System.out.println("List of all array: " + value);
		}
		
		for (int pos = 0; pos < stringArray.length; pos++)
			if (stringArray[pos] == null) {
				firstNull = pos;
				break;
			}
		System.out.println("Position of the first null value is: " + firstNull);

	}

}
