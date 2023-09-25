package controlflow_practice;

import java.util.Scanner;

public class PA303_4_1_Question5 {

	public static void main(String[] args) {
		/*
		 * Write a program that uses if-else-if statements to print out grades A, B, C,
		 * D, F, according to the following criteria: A: 90-100 B: 80-89 C: 70-79 D:
		 * 60-69 F: <60 Use the Scanner class to accept a number score from the user to
		 * determine the letter grade. Print out “Score out of range” if the score is
		 * less than 0 or greater than 100.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your score: ");
		int score = input.nextInt();
		input.close();

		if (score >= 90 && score <= 100) {
			System.out.println("Your grade is A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("Your grade is B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("Your grade is C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("Your grade is D");
		} else if (score < 60) {
			System.out.println("Your grade is F");
		} else if (score < 0 || score > 100) {
			System.out.println("Score out of range");
		}

	}

}
