package task1;

public class Task_1 {
	/*
	 * Task 1: Write a program that creates an array of integers with a length of 3.
	 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
	 */

	public static void main(String[] args) {
		// create array of integers with size 3
		int[] array = new int[3];
		
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		//enhanced loop
		for(int arr : array) {
			System.out.println(arr);
		}
		
		//normal loop
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
 		
	}

}
