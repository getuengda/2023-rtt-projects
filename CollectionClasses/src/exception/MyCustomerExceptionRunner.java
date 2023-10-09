package exception;

public class MyCustomerExceptionRunner {

	public static void main(String args[]) {
		try {
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyCustomerException("This is My error Message");
		} catch (MyCustomerException exp) {
			System.out.println(" ->> Catch Block");
			System.out.println(exp);
		}

	}

}
