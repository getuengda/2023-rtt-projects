package com.perscolas.java_operatorsandnumbers;

public class OperatorsAndNumbers {

	public static void main(String[] args) {
		
		// declares an integer a variable x and assigns the value 2 to i	
		int x = 2;
		int y = 9;
		int z = 17;
		int q = 88;
		//prints out the binary string version of the number (Integer.toBinaryString(x))
		String binaryString = Integer.toBinaryString(x);
		String binaryString_y = Integer.toBinaryString(y);
		String binaryString_z = Integer.toBinaryString(z);
		String binaryString_q = Integer.toBinaryString(q);
		System.out.println("The binary string version of " + x + " is " + binaryString);
		System.out.println("The binary string version of " + y + " is " + binaryString_y);
		System.out.println("The binary string version of " + z + " is " + binaryString_z);
		System.out.println("The binary string version of " + q + " is " + binaryString_q);
		
		// Left shift the binary string by 1 position.
        binaryString = "0" + binaryString;
        binaryString_y = "0" + binaryString_y;
        binaryString_z = "0" + binaryString_z;
        binaryString_q = "0" + binaryString_q;
        
        // Convert the binary string back to an integer.
        x = Integer.parseInt(binaryString, 2);
        y = Integer.parseInt(binaryString_y, 2);
        z = Integer.parseInt(binaryString_z, 2);
        q = Integer.parseInt(binaryString_q, 2);
		
        // Assign the converted integer to the variable x.
        x = x << 1;
        y = y << 1;
        z = z << 1;
        q = q << 1;
        System.out.println("The left shifted number is for x " + x + " is " + binaryString);
        System.out.println("The left shifted number is for y " + y + " is " + binaryString_y);
        System.out.println("The left shifted number is for z " + z + " is " + binaryString_z);
        System.out.println("The left shifted number is for q " + q + " is " + binaryString_q);
        
        ////////// 
        
        // declares an integer a variable a, b, c,d and assigns the value 	
     		int a = 150;
     		int b = 255;
     		int c = 1555;
     		int d = 32456;
     		//prints out the binary string version of the number (Integer.toBinaryString(x))
     		String binaryString_a = Integer.toBinaryString(a);
     		String binaryString_b = Integer.toBinaryString(b);
     		String binaryString_c = Integer.toBinaryString(c);
     		String binaryString_d = Integer.toBinaryString(d);
     		
     		System.out.println("The binary string version of " + a + " is " + binaryString_a);
     		System.out.println("The binary string version of " + b + " is " + binaryString_b);
     		System.out.println("The binary string version of " + c + " is " + binaryString_c);
     		System.out.println("The binary string version of " + d + " is " + binaryString_d);
     		
     	// right shift the binary string by 2 position.
     		binaryString_a = binaryString_a.substring(2);
     		binaryString_b = binaryString_b.substring(2);
     		binaryString_c = binaryString_c.substring(2);
     		binaryString_d = binaryString_d.substring(2);
             
     	// Convert the binary string back to an integer.
             a = Integer.parseInt(binaryString_a, 2);	
     		 b = Integer.parseInt(binaryString_b, 2);	
     		 c = Integer.parseInt(binaryString_c, 2);	
     		 d = Integer.parseInt(binaryString_d, 2);	
        // Assign the converted integer to the variable x.
             a = a >> 2;
             b = b >> 2;
             c = c >> 2;
             d = d >> 2;
             System.out.println("The left shifted number is for a " + a + " is " + binaryString_a);
             System.out.println("The left shifted number is for b " + b + " is " + binaryString_b);
             System.out.println("The left shifted number is for c " + c + " is " + binaryString_c);
             System.out.println("The left shifted number is for d " + d + " is " + binaryString_d);
             
	}

}
