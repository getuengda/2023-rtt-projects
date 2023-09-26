package advancedarrays;

public class FindlargestNumber {

	public static void main(String[] args) {
		// Java does not have any built-in functions for finding maximum elements
		int[] arr = {25,0,2,4,6,8,10};
		int maxVal = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println("The Maximum element = " + maxVal);

	}

}
