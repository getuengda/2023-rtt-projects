package advancedarrays;

public class ReverseOrderExample {

	public static void main(String[] args) {
		/*
		 * If we want to print the array in the reverse order, without actually
		 * reversing it, we can do that just by providing a for loop that will start
		 * printing from the end of the array. This is a good option as long as we just
		 * want to print the array in reverse order without doing any processing with
		 * it.
		 */
		
		Integer[] intArray = {10,20,30,40,50,60,70,80,90};
		
		//First print array starting from first element ....
		for(Integer intNum : intArray) {
			System.out.println(intNum + " ");
		}
		System.out.println();
		// ---- print array starting from last element
		System.out.println("Original Array printed in reverse order");
		for(int i=intArray.length-1; i>=0; i--) {
			System.out.println(intArray[i] + " ");
		}

	}

}
