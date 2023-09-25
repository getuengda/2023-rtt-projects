package whileloop;

public class WhileLoopDemoOne {

	public static void main(String[] args) {
		// while loop will continually process a statement or given code block while its evaluation condition is true.
		
		boolean condition = true;
		
//		while(condition) {
//			System.out.println("Will run forever.");
//			condition = false;
//		}
		
		
		int count = 3;
		
		while(count >= 1 && count <= 10) {
			System.out.println("Will run forever.");
			count++;
		}
		System.out.println("Will not run forever");
		

	}

}
