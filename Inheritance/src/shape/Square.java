package shape;

public class Square extends Shape{

	private double length;
	

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double calculateArea() {
		
		return length * length;
	}

	@Override
	public double calculatePerimeter() {
		
		return 4 * length;
	}

}
