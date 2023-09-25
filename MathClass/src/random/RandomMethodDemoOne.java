package random;

public class RandomMethodDemoOne {

	public static void main(String[] args) {
		// In general: a + Math.random() * b	
		//Returns a random number between a and a+b, excluding a+b.
		
		// generate integer number b/w 1 to 100
		int n1 = (int) (Math.random()*100);
		int n2 = (int) (Math.random()*100);
		
		  // display generated integer numbers
	     System.out.println(n1);
	     System.out.println(n2);
	}

}
