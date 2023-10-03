package calculatesumofdivisor;

public class CalculateSumOfDivisors {
	// 3) write a for loop that calculates the sum of the divisor of each number
	// divided by 2 between 1 and 100

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i / 2;
		}
		System.out.println("The sum of the divisor of each number" + "	divided by 2 between 1 and 100 is: " + sum);

		// 4) write a while loop ... while a number is greater than 0 subtract 1 from
		// the number starting at 10.
		int number = 10;
		while (number > 0) {
			number--;
			System.out.println(number);
		}

	}

}
