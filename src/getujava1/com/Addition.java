package getujava1.com;

public class Addition {
		static int num1 = 3;
		static int num2 = 16;
	public static void main(String[] args) {
		
		
	Addition result = new Addition();
		
	System.out.println("Addition of 3 with 16 result: " + result.add(num1, num2));	
		
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}

}
