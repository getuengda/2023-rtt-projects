package scanner;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		//create an object of scanner class
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the height: ");
		int height = input.nextInt();
		
		System.out.println("Enter the width: ");
		int width = input.nextInt();
		
		//Calculate the area of rectangle
		int area = height * width;
		
		
	}

}
