package decimalformat;

import java.text.DecimalFormat;

public class DecimalFormatClass {

	public static void main(String[] args) {
		/*
		 * We often need to format numbers by taking two decimal places for a number or
		 * showing only the integer part of a number. 
		 * Java provides a DecimalFormat class, which can help you to format numbers and use your specified pattern as
		 * quickly as possible.
		 */
		
		//String pattern = "####,####.##";
		String pattern = "###.##";
		double number = 123456789.123;
		
		DecimalFormat numberFormat = new DecimalFormat(pattern);
		System.out.println(number);
		System.out.println(numberFormat.format(number));
		

	}

}
