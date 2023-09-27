package task2;

public class Task_2 {
	/*
	 * Task 2: Write a program that returns the middle element in an array. Give the
	 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
	 * following output: 7
	 */
	public static void main(String[] args) {
		
		int[] array = {13, 5, 7, 68, 2};

		// Get the middle element of the array.
		int middleElement = getMiddleElement(array);

		// Print the middle element
		System.out.println("The middle element of the array is: " + middleElement);
	}

	public static int getMiddleElement(int[] array) {
		// Check if the array is empty.
		if (array.length == 0) {
			System.out.println("The array cannot be empty.");
		}

		// Calculate the index for the middle element
		int middleIndex = array.length / 2;

		// check if there are two middle elements else return the middle element
		if (array.length % 2 == 0) {
			return (array[middleIndex] + array[middleIndex - 1]) / 2;
		} else {
			// Return the middle element.
			return array[middleIndex];
		}
	}

}
