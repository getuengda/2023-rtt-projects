package guidedLab_303_5_1_forloop;

public class FindSumOfNaturalNumbers {

	public static void main(String[] args) {
		// // Program to find the sum of natural numbers from 1 to 1000.
		int n = 1000;
		int sum = 0;
		
		// for loop
		for(int i = 1; i <= n; i++) {
			// body inside for loop
			sum += i; // sum = sum + i
		}
		System.out.println("The sum of natural numbers from 1 to 1000: Sum = " + sum);

	}

}
