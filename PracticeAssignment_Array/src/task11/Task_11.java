package task11;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {
	/*
	 * Task 11: Write some Java code that asks the user how many favorite things
	 * they have. Based on their answer, you should create a String array of the
	 * correct size. Then ask the user to enter the things and store them in the
	 * array you created. Finally, print out the contents of the array.
	 */
	public static void main(String[] args) {
		// Create a Scanner object to read user input.
		Scanner scanner = new Scanner(System.in);

		// Ask the user how many favorite things they have
		System.out.println("How many favorite things do you have?");
		int numberOfFavoriteThings = scanner.nextInt();
		scanner.nextLine();

		// Create a String array of the correct number of favorite things
		String[] favoriteThings = new String[numberOfFavoriteThings];

		// Ask the user to enter the things and store them in the array list
		for (int i = 0; i < numberOfFavoriteThings; i++) {
			System.out.println("Enter your " + i + " favorite thing: ");
			favoriteThings[i] = scanner.nextLine();
		}

		// Print out the content
		System.out.println("Your favorite things are: ");
		System.out.println(Arrays.toString(favoriteThings));
		

	}

}
