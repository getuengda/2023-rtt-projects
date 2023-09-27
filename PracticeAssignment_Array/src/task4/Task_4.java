package task4;

public class Task_4 {
	/*
	 * Task 4: Write a program that creates an integer array with 5 elements (i.e.,
	 * numbers). The numbers can be any integers. Print out the value at the first
	 * index and the last index using length - 1 as the index. Now try printing the
	 * value at index = length (e.g., myArray[myArray.length] ). Notice the type of
	 * exception which is produced. Now try to assign a value to the array index 5.
	 * You should get the same type of exception.
	 */
	public static void main(String[] args) {
		// creates an integer array with 5 elements
		int[] numbers = {7,9,13,15,19};
		
		// Print out the value at the first index
		 System.out.println("The element at the first index: " + numbers[0]);
		
		 // Print out the value at the last index using length - 1
		 int lastIndex = numbers.length - 1;
		 System.out.println("The element at the first index: " + numbers[lastIndex]);
		 
		 // try printing the value at index = length (e.g., myArray[myArray.length] )
		 System.out.println("The element at index = " + numbers[numbers.length]); //ArrayIndexOutOfBoundsException
		 System.out.println("The element at index = " + numbers[numbers.length - 1]);//this is correct
		 
		 // try to assign a value to the array index 5. You should get the same type of exception.
		 // numbers[5] = 33; //ArrayIndexOutOfBoundsException
	}

}
