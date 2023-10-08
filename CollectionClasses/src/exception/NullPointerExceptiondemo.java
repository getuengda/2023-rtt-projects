package exception;

public class NullPointerExceptiondemo {
	/*
	 * we will demonstrate how to handle NullpointExeption. Create a new class named
	 * NullPointerExceptiondemo and write the code below in that class.
	 */
	public static void main(String[] args) {
		// First initializing String variable with null value
		String ptr = null;
		// the checking if ptr.equals null or works fine.
		try {
			if (ptr.equals("hello"))
				System.out.println("Same");
			else {
				System.out.println("not Same");
			}
		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught => " + e.getMessage());
			e.printStackTrace();
			// will get -> Caught => Cannot invoke "String.equals(Object)" because "ptr" is null

		}

	}

}
