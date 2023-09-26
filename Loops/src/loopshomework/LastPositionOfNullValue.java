package loopshomework;

public class LastPositionOfNullValue {

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
		
		int lastPositionOfNullValue = 0;
		for(int j = stringArray.length - 1; j >= 0; j--) {
			if (stringArray[j] == null) {
				lastPositionOfNullValue = j;
				break;
	        }
	    }
		System.out.println("Position of the last null value is: " + lastPositionOfNullValue);

	}

}
