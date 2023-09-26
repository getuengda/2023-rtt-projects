package guidedLab_303_5_1_forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// A Palindrome number when reversed, represents the same number
		
		String original, reverse = "";
		
		//accept an input number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a string/number to check if it is a palindrome: ");
		original = input.nextLine();
		
		// then check the size or length of the input string / number and assign to a variable
		int length = original.length();
		for(int i = length -1; i >=0; i--) 
			reverse = reverse + original.charAt(i);
			
		if(original.equals(reverse)) {
			System.out.println("Entered string/number is a palindrome.");
		}else {
			System.out.println("Entered string/number isn't a palindrome.");
		}
		
	}

}
