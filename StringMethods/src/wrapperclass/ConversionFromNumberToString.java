package wrapperclass;

public class ConversionFromNumberToString {

	public static void main(String[] args) {
		/*
		 * A toString() is an in-built method in Java that returns the value given to it
		 * in a string format. Hence, any object that this method is applied to will be
		 * returned as a string object. The toString() method in Java has two
		 * implementations:
		 */
		
		// 1) first implementation is when it is called a method of an object instance
		Integer  number = 10;
		// Calling the toString() method as a function of the Integer variable
		System.out.println( number.toString() );

		// 2) second implementation is when you call the number method of 
		//the relevant class by passing the value as an argument.
		System.out.println(Double.toString(12.0)); //Double
		System.out.println(Integer.toString(13)); //Integer
		System.out.println(Long.toString(123213123)); //Long
		System.out.println(Boolean.toString(false)); //Boolean
		
	}

}
