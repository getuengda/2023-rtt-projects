package guidedlab303_6_1Array;

public class MeanSDArray {
	// Find the mean and standard deviation of the numbers kept in an array.
	public static void main(String[] args) {
		// Declare variable
		int[] marks = { 74, 43, 58, 60, 90, 64, 70 };
		int sum = 0;
		int sumSquare = 0;
		double mean, stdDev;

		// Compute sum and square-sum using loop
		for (int i = 0; i < marks.length; ++i) {
			sum += marks[i];
			sumSquare += marks[i] * marks[i];
		}

		mean = (double) sum / marks.length;
		stdDev = Math.sqrt((double) sumSquare / marks.length - mean * mean);

		// Print results
		System.out.printf("Mean is: %.2f%n", mean);
		System.out.printf("Standard deviation is: %.2f%n", stdDev);

	}

}
