package exception;

import java.io.IOException;

public class ThrowsExampleRunner {

	public static void main(String[] args) {
		try {
			// this try block calls the above method so handle the exception
			Throws_Example obj = new Throws_Example();
			obj.testMethod(2);
		} catch (IOException ex1) {
			System.out.println(ex1);
		} catch (ArithmeticException ex2) {
			System.out.println(ex2);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
