package controlflow_practice;

import java.util.Scanner;

public class PA303_4_1_Question6 {

	public static void main(String[] args) {
		/*
		 * 6. Write a program that accepts an integer between 1 and 7 from the user. Use
		 * a switch statement to print out the corresponding weekday. Print “Out of
		 * range” if the number is less than 1 or greater than 7. Do not forget to
		 * include “break” statements in each of your cases.
		 */
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter a number: ");
		int number = input.nextInt();

		switch (number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		case 8: 
			System.out.println("Out of range");
		}
	}

}
