package stringprintf;

public class SpringPrintfMethodExample {

	public static void main(String[] args) {
		// If we have multiple printf() statements without a newline specifier:

		System.out.printf("Hello, %s!", "Michael Scott");
		System.out.printf("Hello, %s!", "Jim");
		System.out.printf("Hello, %s!", "Dwight");
		
		//However, if we include the newline character:
		System.out.printf("\nHello, %s!%n", "Michael Scott");
		System.out.printf("Hello, %s!%n", "Jim");
		System.out.printf("Hello, %s!%n", "Dwight");

	}

}
