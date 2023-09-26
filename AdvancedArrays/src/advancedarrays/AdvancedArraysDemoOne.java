package advancedarrays;

import java.util.Arrays;

public class AdvancedArraysDemoOne {

	public static void main(String[] args) {
		
		double[] numbers = {6.0,4.5,7.3,5.8,8.1};
		String[] strings = {"one", "two", "three"};
		
		//String is immutable so toUpperCase does NOT modify this string itself
		String str1 = "abc";
		str1.toUpperCase();
		
		//Array library will modify the array
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		
		// Find the minimum and maximum values of the array
		double min = numbers[0];
		double max = numbers[0];
		
		for(double number : numbers) {
			if(number < min) {
				min = number;
			}
			if(number > max) {
				max = number;
			}
		}
		System.out.println("The minmum number in the array is " + min + " maximum number is: " + max);
	}

}
