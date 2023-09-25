package stringformat;

public class StringFormatExampleOne {

	public static void main(String[] args) {
		// The Format Method Specifier expects at least one argument – the format string.
		/*
		 * It can accept any number of additional arguments, and of any type. The
		 * additional arguments are matched, in order to the format specifiers found
		 * within the format string. The format specifiers must match the provided
		 * arguments; otherwise, an IllegalFormatException is thrown.
		 */
		
		int i = 1024;
		byte b = 127;
		double d = 1.233, tiny = d / 1000000.0;
		boolean bool = true;

		System.out.format(" This is an integer: %d and this is a byte: %d.\r\n", i, b);

	}

}
