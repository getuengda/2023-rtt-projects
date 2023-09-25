package introductionloop;

public class LoopIntro {

	public static void main(String[] args) {
		/*
		 * In general, statements are executed sequentially – the first statement in a
		 * method is executed first, followed by the second, the third, and so on. There
		 * are times when you need to execute a block of code multiple times; often with
		 * variations in each execution. Programming languages provide flow-control
		 * structures that allow more complicated execution paths. Loop statements allow
		 * for executing a single statement or group of statements multiple times. A
		 * loop is typically controlled by an index or counter variable.
		 */
		
		for(int i=0; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i=0; i <= 2; i++) {
			System.out.println("Welcome to Java");
		} System.out.println("Goodbye");
		

	}

}
