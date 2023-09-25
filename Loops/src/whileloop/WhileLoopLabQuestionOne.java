package whileloop;

import java.util.Scanner;

public class WhileLoopLabQuestionOne {

	public static void main(String[] args) {
		/*
		 * Guess the Number Write a program that randomly generates an integer between 0
		 * and 100, inclusive. The program should prompt the user to enter a number
		 * repeatedly until the number matches the randomly generated number. 
		 * For each user input, the program tells the user whether the input is too low or too
		 * high. When the user discovers the correct answer, the program outputs a
		 * congratulatory message, and then provides the user with the opportunity to
		 * play again.
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please write your guess number: ");
		int userNumber = input.nextInt();
		
		int randomNumber = (int) (Math.random() * 101);
		
		while(userNumber != randomNumber) {
			if (userNumber < randomNumber) {
				System.out.print("Your number is too low. Try again");
				System.out.println("\nPlease write your guess number: ");
			}else {
				System.out.println("Your number is too high. Try again");
				System.out.println("\nPlease write your guess number: ");
			}
			userNumber = input.nextInt();
			
			// Congratulations message to the user.
	        System.out.println("Congratulations! You guessed the correct number!");
			
	        // Asking the user if they want to play again
	        System.out.println("Do you want to play again: (y/n)");
	        char playAgian = input.next().charAt(0);
	        
	        // If the user wants to play again, start the game over. Otherwise, exit the program
	        if(playAgian == 'y') {
	        	main(args);
	        } else {
	        	System.out.println("Goodbye!");
	        }
			
		}
		
		

	}

}
