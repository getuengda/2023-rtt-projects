package calculator;

import java.util.Scanner;

public class Calculator {
	/*
	 * Create a small calculator .. it will be able to do 4 operations - add,
	 * subtract, multiply and divide. Each of these will be a single method that
	 * does that operation. Ask the user for 2 numbers and then ask the user which
	 * operation they want to do. Then do that operation and print the result. Each
	 * operation should not print its own results. All operations should work with
	 * double values. (edited) 3:32 So this should be a main function with probably
	 * 6 methods ( 4 operations, 1 menu, 1 input ) each operation should take 2
	 * parameters and return a double 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Menu.
        System.out.println("Please select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        // Get the user's selection.
        int selection = input.nextInt();

        // Perform the selected operation.
        switch (selection) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            case 5:
                System.out.println("Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid selection.");
        }

	}

	private static void add() {
        // Get the two numbers from the user.
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Add the two numbers and print the result.
        double result = add(firstNumber, secondNumber);
        System.out.println("The result is: " + result);
    }
	private static double add(double a, double b) {
		return a + b;
	}
	
	private static void subtract() {
        // Get the two numbers from the user.
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Subtract the two numbers and print the result.
        double result = subtract(firstNumber, secondNumber);
        System.out.println("The result is: " + result);
    }

	private static double subtract(double a, double b) {
		return a - b;
	}
	private static void multiply() {
        // Get the two numbers from the user.
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Multiply the two numbers and print the result.
        double result = multiply(firstNumber, secondNumber);
        System.out.println("The result is: " + result);
    }

	private static double multiply(double a, double b) {
		return a * b;
	}
	private static void divide() {
        // Get the two numbers from the user.
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Divide the two numbers and print the result.
        double result = divide(firstNumber, secondNumber);
        System.out.println("The result is: " + result);
    }

	private static double divide(double a, double b) {
		 if (b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a / b;
	}

}
