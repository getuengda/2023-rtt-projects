package nestedloops;

public class NestedLoopDemoOne {

	public static void main(String[] args) {
		for(int outer = 1; outer <= 10; outer++) {
			for(int inner = 1; inner <= outer; inner++) {
				System.out.print("X");
			}
			System.out.println("\n");
		}

	}

}
