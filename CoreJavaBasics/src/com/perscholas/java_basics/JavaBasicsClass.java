package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		// declare two integer variables
		int num1 = 13;
		int num2 = 17;
		
		//create integer result to assign the sum
		
		int result = num1 + num2;
		
		//Print the out put 
		
		System.out.println("The sum of two integer variable num1 and num2 is: " + result);
		
		//Write a program that declares two double variables and assigns a number to each
		double n = 10;
		double m = 16;
		
		//adds them together and assign the sum to a variable
		double sum = n + m;
		
		//Print out the result
		System.out.println("The sum of two double variable n and m is: " + sum);
		
		//Write a program that declares an integer variable and a double variable
		int num3 = 9;
		double num4 = 8.2;
		
		//assigns numbers to each, and adds them together, Assign the sum to a variable
		double sumOfIntandDoubleNumber = num3 + num4;
		
		//Print out the result. What variable type must the sum be? //it has to be double
		System.out.println("The sum of two double variable x and y is: " + sumOfIntandDoubleNumber);
		
		//Write a program that declares two integer variables
		int num5 = 10;
		int num6 = 20;
		
		//assigns an integer to each, and divides the larger number by the smaller number.
		int shareOflargToSmall = num6/num5;
		
		//Print out the result. What variable type must the sum be? //it has to be double
		System.out.println("When integer num6 devided by integer num5 the result is integer: " 
		+ shareOflargToSmall);
		
		//If we change larger number to decimal/float what will be the result?
			//the correction required will be change variable data type to float 
			//And change result variable type to float also
				int num52 = 10;
				float num62 = 22.5F; //variable type changed to float
				float shareOflargToSmall2 = num62/num52; //variable type changed to float
				
		//Print out the result. The result will be float 
		System.out.println("When decimal num62 devided by integer num52 the result is float: " 
				+ shareOflargToSmall2);
		
		//Write a program that declares two double variables,
		double a = 14;
		double b = 15;
		
		//assigns a number to each, and divides the larger by the smaller number, Assign the result to a variable
		double resultDivides = b/a; 
		
		//Print out the result. 
		System.out.println("When dividing one double varaible type by other the result is double: " 
						+ resultDivides);
		
		//What if we cast the result data type to integer type? It's working and get integer
		int resultDivides2 = (int) (b/a); 
		System.out.println("When dividing double varaible types and cast the result will be integer: " 
				+ resultDivides2);
		
		
		//Write a program that declares two integer variables, x and y, 
		//and assigns the number 5 to x and the number 6 to y
		int x = 5;
		int y = 6;
		
		//Declare a variable q and assign y/x to it and print q
		int q= y/x;
		System.out.println("When int y is divided to int x the result q: " 
				+ q);
			//cast y to a double and assign it to q. Print q again.
			double q2 = (double) y/x; //the result has to be double or 
			int q3 = (int)((double) y/x); //the variables need to be cast to integer
			System.out.println("When int y casted to double is divided to int x the result q2 is double: " 
					+ q2);
			System.out.println("When int y casted to double is divided to int x the result q2 is int: " 
					+ q3);
		
		//Write a program that declares a named constant and uses it in a calculation. Print the result.
		
		final double Pi = 3.1414;
		double raduis = 5;
        double square = Math.pow(raduis, 2);
		
		//Area of circle
		double areaOfCircle = Pi * square;
		System.out.println("Area of a circle with raduis of 5 is: " + areaOfCircle);
		
		
		//Write a program where you create three variables that represent products at a cafe
		
			float coffee = 4.75F;
			float cappuccino = 4.25F;
			float espresso = 3.99F;
			float greenTea = 3.28F;
			
		//Create two more variables called sub-total and totalSale 
			
			//complete an “order” for three items of the first product, 
			//four items of the second product, and two items of the third product
			
			float subTotal = (3*coffee) + (4*cappuccino) + (2*espresso);
			
			final float SALES_TAX = (float) (subTotal * 0.002);
			
			float totalSale = subTotal + SALES_TAX;
			
			System.out.print("Total sale amount for this service is: $" + totalSale);
		
		
	}

}
