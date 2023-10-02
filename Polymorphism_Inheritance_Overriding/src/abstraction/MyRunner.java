package abstraction;

import java.util.Arrays;

public class MyRunner {

	public static void main(String[] args) {
		AbstractStudent student = new StudentService();
		student.setUsername("Mikiel");
		student.setPassword("password012345");
		student.setRollnumber(00345);
		student.displayinformation();
		String[] name = {"Mikiel", "Anna"};
		System.out.println(Arrays.toString(student.getFullName(name)));
	}

}
