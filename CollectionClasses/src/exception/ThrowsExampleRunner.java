package exception;

public class ThrowsExampleRunner {


	public static void main(String[] args) {
		try {
			// this try block calls the above method so handle the exception
			Throws_Example obj = new Throws_Example();
			obj.testMethod(1);
		}catch(Exception ex){
			System.out.println(ex);
		}

	}

}
