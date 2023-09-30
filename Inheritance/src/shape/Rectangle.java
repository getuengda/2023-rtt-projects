package shape;

public class Rectangle extends Shape{
	

	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}
	//this is the specific for the area 
	//of a rectangle. This is implementation the area interface
	public double calculateArea() {
		return height * width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double calculatePerimeter() {
	
		return 2*(height+width);
	}
	
	

}
