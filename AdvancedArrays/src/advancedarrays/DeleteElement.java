package advancedarrays;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		// position to delete
		
		int[] numbers = {0,1,3,4,5,6};
		System.out.println("Original" + Arrays.toString(numbers));
		
		int positionToDelete = 1;
		
		for(int pos = positionToDelete; pos < numbers.length -1; pos++) {
			numbers[pos] = numbers[pos + 1];
		}
		System.out.println("after move" + Arrays.toString(numbers));
		
		//Make a new array that is one smaller than the original
		int[] target = new int[numbers.length - 1];
		for(int pos = 0; pos < target.length; pos++) {
			target[pos] = numbers[pos];
		}
		System.out.println("after copy" + Arrays.toString(numbers));

	}

}
