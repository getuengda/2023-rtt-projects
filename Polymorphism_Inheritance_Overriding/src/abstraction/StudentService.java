package abstraction;

public class StudentService extends AbstractStudent{

	// Assume this gpa is coming from Database
	private double gpa = 4.8;

	@Override
	public void displayinformation() {
		System.out.println("Welcome to " + this.COLLAGENAME);
		System.out.println("Your username is " + this.username + " and password " + this.password);
		System.out.println("Your roll number is " + this.rollnumber + " and you got " + this.gpa);
		
	}

	@Override
	public String[] getFullName(String[] name) {
		String[] fullname = name;
		return fullname;
	}

}
