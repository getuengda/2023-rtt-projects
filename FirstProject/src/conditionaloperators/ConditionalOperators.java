package conditionaloperators;

public class ConditionalOperators {

	public static void main(String[] args) {
		boolean conditionOne = false;
		boolean conditionTwo = false;
		
		// && is add
		if(conditionOne && conditionTwo) {
			//do something only if both variable are true
			System.out.println("Both variables are true");
		}
		
		// || is or
		if(conditionOne && conditionTwo) {
			//do something if one or the other or both variable are true
			System.out.println("Either  or both of the variables are true");
		}
		
		// neither is true
		if(!conditionOne && !conditionTwo) {
			//do something if one or the other or both variable are true
			System.out.println("Neither is true");
		}
		
		//this is using mathematical operator
		int x = 10;
		if(x > 3 && x < 20) {
			System.out.println("x is between 3 and 20");
		}
		
		//odd vs even
		//this is using modulus
		
		// 2 % 2 = 1 R 0
		// 3 % 2 = 1 R 1
		
		// 4 % 2 = 2 R 0
		// 4 % 3 = 1 R 1
		
		int y =4;
		if((y % 2) ==1) {
			System.out.println("This is an odd number");
		}else {
			System.out.println("This is an even number");
		}
		
		
		
	}

}
