package sumof_remainders;

public class CalculateSumOfRemaindersDividedByTwo {
	// write a for loop that calculates the sum of the remainders of each number
	// divided by 2 between 1 and 100

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
				sum += i%2;
			
		}
		System.out.println("The sum of the remainders of each number " + "divided by 2 between 1 and 100 is : " + sum);

	}

}
