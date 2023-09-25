package flowcontrol;

import java.util.Scanner;

public class NestedChained {

	public static void main(String[] args) {
		
		//int score = 90;zl
		
		Scanner input_score = new Scanner(System.in);
		System.out.println("Please enter your score: ");
		int score = input_score.nextInt();
		
		if (score >= 90.0)
			System.out.println("A");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 60.0)
			System.out.println("D");
		else
			System.out.println("F");
		
		
		///// Nested Loop ///////
		
		int age = 25;
        boolean isCitizen = true;

        if (age >= 18) {
            if (isCitizen) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote because you are not a citizen.");
            }
        } else {
            System.out.println("You are not eligible to vote because you are not old enough.");
        }
        	
        
        ////// third example of nested conditional //////
        
        Scanner sc =new Scanner (System.in);
        
        System.out.println("Input your Number: ");
		double num = sc.nextDouble();
       
        
        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is negative.");
        }
	
	}
		

}
