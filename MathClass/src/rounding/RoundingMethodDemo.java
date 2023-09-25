package rounding;

public class RoundingMethodDemo {

	public static void main(String[] args) {
		/*
		 * he Math Class offers multiple methods to round off a number such as round(),
		 * ceil(), floor(), rint(). double ceil(double x). x rounded up to its nearest
		 * integer. This integer is returned as a double value. double floor(double x).
		 * x is rounded down to its nearest integer. This integer is returned as adouble
		 * value. double rint(double x). x is rounded to its nearest integer. If x is
		 * equally close to two integers, the even one is returned as a double. int
		 * round(float x). Return (int)Math.floor(x+0.5). long round(double x). Return
		 * (long)Math.floor(x+0.5).
		 */
		double d = 83.67;
		
		System.out.println(Math.ceil(d)); // return double & rounded up to its nearest integer
		System.out.println(Math.floor(d)); // return double and rounded down to its nearest integer
		System.out.println(Math.rint(d)); // return double but find the closest integers for these double numbers
		
		// Math.round() It is used to round of the decimal numbers to the nearest value.
		System.out.println(Math.round(d)); // 84;
		
		double a = 1.878;
		System.out.println(Math.round(a)); // 2
		
		// value equals to 5 after decimal
		double b = 1.5;
		System.out.println(Math.round(b)); // 2
		
		// value less than 5 after decimal
		double c = 1.34;
		System.out.println(Math.round(c)); // 1

	}

}
