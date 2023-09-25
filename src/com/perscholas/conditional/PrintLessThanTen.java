package com.perscholas.conditional;

public class PrintLessThanTen {

	public static void main(String[] args) {

		System.out.println("////// Question 1 /////////");
		/*
		 * 1) Write a program that declares 1 integer variable x, and then assigns 7 to
		 * it. Write an if statement to print out “Less than 10” if x is less than 10.
		 * Change x to equal 15, and notice the result (console should not display
		 * anything).
		 */

		int x = 7;

		if (x < 10) {
			System.out.println("Less than 10.");
		}

		System.out.println("////// Question 2 /////////");

		/*
		 * 2) Write a program that declares 1 integer variable x, and then assigns 7 to
		 * it. Write an if-else statement that prints out “Less than 10” if x is less
		 * than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and
		 * notice the result.
		 */

		int y = 20;

		if (y < 10) {
			System.out.println("Less than 10.");
		} else if (y > 10) {
			System.out.println("Greater than 10.");
		}

		System.out.println("////// Question 3 /////////");
		/*
		 * 3. Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else-if statement that prints out “Less than 10” if x is less
		 * than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
		 * “Greater than or equal to 20” if x is greater than or equal to 20. Change x
		 * to 50 and notice the result.
		 */

		int z = 15;
		if (z < 10) {
			System.out.println("Less than 10");
		} else if (z > 10 && z < 20) {
			System.out.println("z is between 10 and 20");
		} else if (z >= 20) {
			System.out.println("z is greater than or equal to 20");
		} else {
			System.out.println("Please assign a number");
		}

		System.out.println("////// Question 4 /////////");
		/*
		 * 4. Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else statement that prints “Out of range” if the number is
		 * less than 10 or greater than 20 and prints “In range” if the number is
		 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
		 * result.
		 */
		int q = 15;

		if (q < 10 && q > 20) {
			System.out.println("Out of range");
		} else if (10 <= q && q <= 20) {
			System.out.println("In range");
		} else {
			System.out.println("Please check your number!");
		}

		System.out.println("////// Question 5 /////////");
		/*
		 * 5. Write a program that uses if-else-if statements to print out grades A, B,
		 * C, D, F, according to the 
		 * following criteria: 
		 * A: 90-100 
		 * B: 80-89 
		 * C: 70-79 
		 * D: 60-69 
		 * F: <60 Use the Scanner class to accept a number score from the user to
		 * determine the letter grade. Print out “Score out of range” if the score is
		 * less than 0 or greater than 100.
		 */

	}

}
