package calculate_sumofall;

public class CalculateSumOfAllNumbers {
	// write a for loop that calculates the sum of all the numbers between 1 and 100
	public static void main(String[] args) {

		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum of all the numbers between 1 and 100 is: " + sum);

	}

}
