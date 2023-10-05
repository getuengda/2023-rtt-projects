package exception;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		try {
			// this will cause a null pointer exception
			// String x = null;
			// x.toUpperCase()

			ee.readNumber();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// when you add throws Exception to a method it forces a checked exception
	public void readNumber() throws Exception {
		Scanner scanner = new Scanner(System.in);

		// try to make it so the user has to keep trying until they enter a number
		// hint : use a while loop and a break;
		try {
			System.out.println("Please enter a number:");
			// this can throw an unchecked exception
			int x = scanner.nextInt();

			// this code executes only if no exception occurs
			// If the user enters a number, the code will break out of the loop.
			System.out.println("You entered the number : " + x);

		} catch (Exception e) {
			// this code executes only if an exception occurs
			System.out.println("The error message is : " + e.getMessage());
			System.out.println("You did not enter a number");
		} finally {
			// finally is optional .. meaning you do not have to implement it
			// this code executes no matter what
			// most of the time this is used for resource cleanup
			System.out.println("This executes no matter what.");
		}

	}
}
