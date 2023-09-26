package loopshomework;

public class CountOfNullValueInArrayList {

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

		// write a for loop that counts the number of nulls in the array
		int countOfNullValue = 0;
		for (String value : stringArray)
			if (value == null) {
				countOfNullValue++;
			}
		System.out.println("The number of null value is: " + countOfNullValue);

	}

}
