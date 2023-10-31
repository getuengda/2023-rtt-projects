package perscholas.testing;

public class Calculator {
	
	public double add(double x, double y) {
		return x + y;
	};
	
	public double subtract(double x, double y) {
		return x - y;
	};
	
	public double multiply(double x, double y) {
		return x * y;
	};
	public double divid(double x, double y) {
		return x / y;
	};

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		double sum = c.add(5.0, 6.0);
		double sub = c.subtract(16.0, 6.0);
		double div = c.divid(25.0, 3.0);
		double mult = c.multiply(13.0, 10.0);

	}

}
