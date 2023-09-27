package task8;

public class Task_8 {
	/*
	 * Task 8: Write a program that creates a String array of 5 elements and swaps
	 * the first element with the middle element without creating a new array
	 */
	public static void main(String[] args) {
		// Create a String array of 5 elements.
        String[] array = {"Java", "is", "very", "powerful", "language"};

        // Swap the first element with the middle element without creating a new array
        String temp = array[0];
        array[0] = array[2];
        array[2] = temp;

        // Print out the array.
        for (String elements : array) {
            System.out.println(elements);
        }

	}

}
