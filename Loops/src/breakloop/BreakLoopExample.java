package breakloop;

public class BreakLoopExample {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int number = 0;
		
		while(number < 20) {
			number++;
			sum += number;
			
			if(sum >= 40) {
				break;
			}
			System.out.println(number + " This code will not excute  after the break: " + sum);
			
		}
		
		System.out.println("The number is: " + number);
		System.out.println("The sum is: " + sum);

	}

}
