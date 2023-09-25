package flowcontrol;

import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Input weight in kilogram: ");
		double weight = sc.nextDouble();
		System.out.println("\nInput height in kilogram: ");
		double height = sc.nextDouble();
		//Calculate bmi
		double BMI = weight / (height* height);
		
		//check ranges
		if(BMI < 18.5) {
			System.out.println("Under Weight");
		} else if(BMI >= 18.5 && BMI < 25) {
			System.out.println("Normal");
		} else if(BMI >= 25 && BMI < 30) {
			System.out.println("Overweigt");
		} else
	           System.out.println("Obese");
	       System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");

	}

}
