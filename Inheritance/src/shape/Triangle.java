package shape;

public class Triangle extends Shape{
	
	private double sideBase;
	private double side2;
	private double side3;
	private double height;
	

	public double getSideBase() {
		return sideBase;
	}

	public void setSideBase(double sideBase) {
		this.sideBase = sideBase;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}
	

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getTriangleHeight() {
		return height;
	}

	public void setTriangleHeight(double triangleHeight) {
		this.height = triangleHeight;
	}

	@Override
	public double calculatePerimeter() {
		return sideBase + side2 + side3;
	}

	@Override
	public double calculateArea() {
		return ((sideBase * height)*1/2);
	}
	
	

}
