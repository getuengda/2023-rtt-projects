package task5;

public class Task_5 {
	/*
	 * Task 5: Write a program where you create an integer array with a length of 5.
	 * Loop through the array and assign the value of the loop control variable
	 * (e.g., i) to the corresponding index in the array.
	 */
	public static void main(String[] args) {
		// create an integer array with a length of 5
		int[] array = new int[5];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		
	}

}
