package sba_review;

import java.util.Scanner;

public class SBAReviewAndHackerRankActivity {

	public static void main(String[] args) {
		// when we multiply a number by 10 --- it moves the decimal points
		// 1 * 10 =10
		// 10 * 10 = 100
		// 100 * 10 = 100
		// 1000 * 10 = 1000

		// when we divide by 10 ... it moves the decimal point left
		// 1000 / 10 = 100
		// 100 / 10 = 10
		// 10 / 10 = 1
		// 1 / 10 = 0.1
		// 0.1 / 10 = 0.01

		// this is using int primitive (x) to automatically truncate the reminder
		// figure out the length of 8763;
		// 8763 / 10 = 876
		// 876 / 10 = 87
		// 87 / 10 = 8
		// 8 / 10 = 0 - while ( x==0) then know you hit the end

		// for our case assume that a mode will always be a positive whole number int
		// 8763 % 10 = 3
		// 876 % 10 = 6
		// 87 % 10 = 7
		// 8 % 10 = 8

		int x = 8763 / 10; // this gets us the whole number 876
		x = x / 10;
		int y = 8763 % 10; // the reminder is what ever number at the end of the number
							// this gets us the remainder 3

		// 1) The length of an input number divided by ten, until the remainder is
		// the smallest positive integer

		// 2) The sum of all single digits of a number in an integer or
		// if you prepare as a method write a method getDigitsSum(int largeNumber) that takes an integer as an
		// argument and returns the sum of its single digits. 
		// the input integers will always be positive

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int length = 0;
		int remainder = number % 10;
		int sum = 0;
		while (number > 0) {
			// Get the last digit of the number
			int digit = number % 10;
			// Add the digit to the sum
			sum += digit;
			// Remove the last digit from the number
			number /= 10;
			length++;
			int tempRemainder = number % 10;

			if (tempRemainder < remainder && tempRemainder > 0) {
				remainder = tempRemainder;
			}

		}

		System.out.println("Number of digit for the input is: " + length);
		System.out.println("The sum of all digits in a number is: " + sum);
		//System.out.println("The last smallest number remained is: " + remainder); need

	}

}
