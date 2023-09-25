package nestedloops;

public class NestedLoopDemoOne {
	/* Nested Loops
	 * The placement of one loop inside the body of another loop is called nesting.
	 * When we nest two loops, the outer loop takes control of the number of
	 * complete repetitions of the inner loop. Any type of loop may be nested.
	 */
	
	public static void main(String[] args) {
		for (int outer = 1; outer <= 10; outer++) {
			for (int inner = 1; inner <= outer; inner++) {
				System.out.print("X");
			}
			System.out.println("\n");
		}

	}

}
