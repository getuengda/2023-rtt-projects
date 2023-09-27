package task6;

public class Task_6 {
	/*
	 * Task 6: Write a program where you create an integer array of 5 numbers. Loop
	 * through the array and assign the value of the loop control variable
	 * multiplied by 2 to the corresponding index in the array.
	 */
	public static void main(String[] args) {
		// create an integer array with a length of 5
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2;
			System.out.println(array[i]);
		}

	}

}
