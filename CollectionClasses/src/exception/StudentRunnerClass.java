package exception;

public class StudentRunnerClass {
	/*
	 * we will demonstrate how to throw an unchecked exception. We can throw a
	 * user-defined exception in the same way.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Registration process");
		Studentinfo_throw stud = new Studentinfo_throw();
		stud.checkEligibility(17, 1.7);
		System.out.println("Have a nice day..");
	}

}
