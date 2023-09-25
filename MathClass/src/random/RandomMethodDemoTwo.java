package random;

public class RandomMethodDemoTwo {

	public static void main(String[] args) {
		// declare max and min
		int min = 100;
		int max = 1000;
		
		// calculate range
		int range = (max - min) + 1;
		
		//generate integer number b/w 100 and 1000
		int d1 = (int) (Math.random()*range + min);
		System.out.println(d1);
		
		//generate integer number b/w 100 to 1000
		int n1 = (int) (Math.random()*range + min);
		System.out.println(n1);
	}

}
