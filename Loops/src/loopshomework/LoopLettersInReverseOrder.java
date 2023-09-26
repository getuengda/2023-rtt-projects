package loopshomework;

import java.util.Arrays;

public class LoopLettersInReverseOrder {

	public static void main(String[] args) {
		// Write a for loop that starts at the final position in the array and count
		// down
		
		//create primitive string data type letters and assign a to z letters 
		String letters = "a, b, c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		
		//Convert to array list using String split method
		String[] letterArray = letters.split(",");
		System.out.println("List of 26 alphabetic letters: " + Arrays.toString(letterArray));
		
		//Loop the letters array list in reverse order
		for (int i = letterArray.length - 1; i >= 0; i--) {
			System.out.println(letterArray[i]);
		}

	}

}
