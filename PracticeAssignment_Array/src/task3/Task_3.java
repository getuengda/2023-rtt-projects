package task3;

import java.util.Arrays;

public class Task_3 {
	/*
	 * Task 3: Write a program that creates an array of String type and initializes
	 * it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array
	 * length. Make a copy using the clone( ) method. Use the Arrays.toString( )
	 * method on the new array to verify that the original array was copied.
	 */
	public static void main(String[] args) {
		String[] array = {"red", "green", "blue", "yellow"};
		int arrayLength = array.length;
		System.out.println(arrayLength);
		System.out.println("\tThe original array is:\t" + Arrays.toString(array));
		
		String[] newArray = array.clone();
		System.out.println("Copy of the original array is:\t" + Arrays.toString(newArray));
	}

}
