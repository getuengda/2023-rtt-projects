package nestedloops;

public class NestedLoopDemoTwo {

	public static void main(String[] args) {
		int week = 7;
		int days = 7;
		
		//outer loop print weeks
		for(int i = 1; i<= week; i++) {
			System.out.println("Week: " + i);
			//inner loop prints days
			for(int j = 1; j <= days; j++) {
				System.out.println("Day: " + j);
			}
		}
		

	}

}
