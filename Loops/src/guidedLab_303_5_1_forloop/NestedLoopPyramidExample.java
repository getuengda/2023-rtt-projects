package guidedLab_303_5_1_forloop;

public class NestedLoopPyramidExample {

	public static void main(String[] args) {
		/*
		 * Here, the class name is PyramidExample. The main() is declared. After that,
		 * the two loop control variables are declared. One is the loop control variable
		 * “i,” and the other is the loop control variable “j.” Then the “*” is printed
		 * in the loop control. The new line is given so that the given format of the
		 * pyramid structure is maintained. In this code, the program runs five times.
		 * However, by increasing the value of the letter “i,” we can make sure that the
		 * pyramid is bigger.
		 */
		for(int i = 0; i <=6; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(); // new line
		}
	}

}
