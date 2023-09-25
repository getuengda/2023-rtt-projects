package com.perscholas.java_scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		/*In this challenge, you must read  integers from stdin and then print them to stdout.
		Each integer must be printed on a new line. To make the problem a little easier, 
		a portion of the code is provided for you in the editor below.
		*/

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Add the first number a: ");
        int a = scan.nextInt();
        
        // Complete this line
        System.out.println("Add the second number b: ");
        int b = scan.nextInt();
        
        // Complete this line
        System.out.println("Add the third number c: ");
        int c = scan.nextInt();
        
        System.out.println(a);
        // Complete this line
        System.out.println(b);
        // Complete this line
        System.out.println(c);

	}

}
