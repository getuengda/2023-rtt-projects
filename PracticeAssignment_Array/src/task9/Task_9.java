package task9;

import java.util.Arrays;

public class Task_9 {
	/*
	 * Write a program to sort the following int array in ascending order: {4, 2, 9,
	 * 13, 1, 0}. Print the array in ascending order, and print the smallest and the
	 * largest element of the array. The output will look like the following: Array
	 * in ascending order: 0, 1, 2, 4, 9, 13 The smallest number is 0 The biggest
	 * number is 13
	 */
	public static void main(String[] args) {
		
        int[] array = {10, 6, 11, 4, 3, 1};

        Arrays.sort(array);

        // Print the array 
        System.out.println("Array in ascending order:");
        for (int elements : array) {
            System.out.println(elements);
        }

        // the smallest and the largest element of the array.
        System.out.println("The smallest value: " + array[0]);
        System.out.println("The biggest value: " + array[array.length - 1]);

	}

}
