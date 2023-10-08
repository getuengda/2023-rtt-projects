package exception;

public class MyExceptionRunner {
	/*
	 * we will demonstrate how to declare and initialize Exception Handling for
	 * Arithmetic numbers in our program.
	 * 
	 * If you initialize a Positive Number to variable d, you will not get an
	 * Exception; only finally block will execute.
	 */
	public static void main(String[] args) {
		int divideByZero = 0;
		try {
			int d = 3;
			int n = 5;
			// code that generates exception when value of d is equal to zero
			divideByZero = n / d;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occur  => " + e.getMessage());
			e.printStackTrace();
		} finally {

			System.out.println("The result n divided by d is: " + divideByZero);
			System.out.println("This is the finally block");
		}

	}

}
