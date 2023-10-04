package inheritanceprotestcheck;

public class main {

	public static void main(String args[]) {
		B obj = new C();
		for (int i = 0; i < obj.getSdlc().length; i++) {
			System.out.print(obj.getSdlc()[i] + "");
		}

		// pro test check for the output for the following conditional 
		int x = 2;
		for (int y = 0; y < 10; ++y) { // the increment needs first add 1 to y and then run
			if (y % x == 0) // first iteration y = 0+1, 1+1= 2, (2+1= 3), 3+1 = 4, (4+1=5), 5=1=6, (6+1=7), 7+1 = 8, (8+1=9)
				continue;
			else if (y == 8)
				break;
			else

				System.out.println(y + " ");
		}
	}

}
