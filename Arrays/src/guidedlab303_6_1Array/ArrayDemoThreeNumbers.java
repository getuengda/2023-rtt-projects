package guidedlab303_6_1Array;

public class ArrayDemoThreeNumbers {
	
	public static void main(String[] args) {
		int[] numbers =  {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum = 0;
		Double average;
		
		// list all element using for loop
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//add each element in sum
		System.out.println("/////// add each element in sum /////");
		for(int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
		
		// get the total numbers of elements
		System.out.println("////// get the total numbers of elements ////");
		int numberOfElment = numbers.length;
		System.out.println("Total number of elements in the array is: " + numberOfElment);
		
		
		// calculate the average
		// convert the average from int to double
		System.out.println("////// calculate the average ////");
		average = (double) (sum/numberOfElment);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	
	}

}
