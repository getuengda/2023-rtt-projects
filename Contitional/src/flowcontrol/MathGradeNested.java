package flowcontrol;

import java.util.Scanner;

public class MathGradeNested {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Learner please input your greade: ");
		int grade = sc.nextInt();
		
		System.out.println("Hey Learner please input your subject: ");
		String subject = sc.next();
		sc.close();
		
		
        //String subject = "Math";
		//String subject = "Science";

        if (grade >= 90) {
            if (subject.equals("Math")) {
                System.out.println("You got an A in Math!");
            } else if (subject.equals("Science")) {
                System.out.println("You got an A in Science!");
            } else {
                System.out.println("You got an A in another subject!");
            }
        } else if (grade >= 80) {
            if (subject.equals("Math")) {
                System.out.println("You got a B in Math!");
            } else if (subject.equals("Science")) {
                System.out.println("You got a B in Science!");
            } else {
                System.out.println("You got a B in another subject!");
            }
        } else if (grade >= 70) {
            if (subject.equals("Math")) {
                System.out.println("You got a C in Math!");
            } else if (subject.equals("Science")) {
                System.out.println("You got a C in Science!");
            } else {
                System.out.println("You got a C in another subject!");
            }
        } else {
            System.out.println("You got a D or F in this subject.");
        }

	}

}
