package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExampleTwo {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int i = 0;

        do {
            try {
                System.out.println("Enter a number: ");
                number = scanner.nextInt();
                // If the user enters a number, the code will break out of the loop.
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
            }

            i++; // Increase the counter
        } while (i <= 2); // Only loop 3 times

        // If the user has not entered a number after 3 tries, print an error message and exit the program.
        if (number == 0) {
            System.out.println("You have exceeded the number of retries. Please try again later.");
            System.exit(1);
        }

        // Do something with the number.
    }

}
