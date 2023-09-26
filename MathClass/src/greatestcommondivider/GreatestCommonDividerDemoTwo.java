package greatestcommondivider;

import java.util.Scanner;

public class GreatestCommonDividerDemoTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1 = readPositiveNumber(input);
		int num2 = readPositiveNumber(input);

		System.out.println("First number : " + num1);
		System.out.println("Second number: " + num2);

		// Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2,
		// until k is greater than n1 or n2.

		// 5 and 15
		// 5 / 1 = 5 , 15 / 1 = 15 = Good !!!
		// 5 / 2 = 2.x , 15 / 2 = 7.x = No good
		// 5 / 3 = 1.x , 15 / 3 = 5 = No good
		// 5 / 4 = 1.x , 15 / 4 = 3.x = No good
		// 5 / 5 = 1 , 15 / 5 = 3 = Good !!!
		// 5 / 6 = 0.x ,
		// 5 / 7 = 0.x ,
		
		int gcd = 1;
		int min = Math.min(num1,  num2);
		for(int k = 1; k <= min; k++) {
			if((num1 % k == 0) && (num2 % k == 0)){
				gcd = k;
			}
		}
		System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcd);

	}

	public static int readPositiveNumber(Scanner input) {
		int number = -1;
		while (number <= 0) {
			System.out.println("Enter a positive integer greater than 0: ");
			number = input.nextInt();

			if (number <= 0) {
				System.out.println("Error: Must be a positive number");
			}
		}
		return number;
	}
}
