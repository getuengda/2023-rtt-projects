package greatestcommondivider;

import java.util.Scanner;

public class GreatestCommonDivider {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int n1 = input.nextInt();
		
		if(n1 < 0) {
			System.out.println("Must be a positive number");
			System.exit(1);
		}
		
		System.out.println("The first number is : " + n1);
		
		
		System.out.println("Enter a a second positive integer: ");
		int n2 = input.nextInt();
		if(n2 < 0) {
			System.out.println("Must be a positive number");
			System.exit(1);
		}
		
		System.out.println("The second number is : " + n2);

	}

}
