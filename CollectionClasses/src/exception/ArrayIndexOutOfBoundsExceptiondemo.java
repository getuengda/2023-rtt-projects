package exception;

public class ArrayIndexOutOfBoundsExceptiondemo {
	/*
	 * we will demonstrate how to declare and initialize Exception Handling for
	 * Array in our program. 
	 * The ArrayIndexOutOfBoundsException Object “e” carries
	 * information about the exception that has occurred, which can be useful in
	 * taking recovery actions.
	 */

	public static void main(String[] args) {
		try {
			String[] str = { "A", "B", "C", "D", "E" };
			str[11] = "x";

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index position is not exist -> " + e.getMessage());

			// e.printStackTrace();
		} finally {
			System.out.println("This is the fianl block");
		}

	}

}
