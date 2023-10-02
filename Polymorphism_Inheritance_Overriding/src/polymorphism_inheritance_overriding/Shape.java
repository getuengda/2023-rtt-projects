package polymorphism_inheritance_overriding;

public class Shape {
	// This is a Super or Parent Class
	// have field common to all subclass/child
	private String color;
	protected double area = 1.0;
	protected double base = 1.0;
	protected double width = 1.0;
	protected double height = 1.0;

	public Shape() {

	}

	// Construct a shape instance with only color
	public Shape(String color) {
		this.color = color;
	}

	// COnstruct a Shape instance with the given values
	public Shape(String color, double area, double base, double width, double height) {
		this.color = color;
		this.area = area;
		this.base = base;
		this.width = width;
		this.height = height;	
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setBase(double base) {
		this.base = base;			
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// Return a self-descriptive string
	public String toString() {
		return "Shape[color=" + color;
	}
	//All shapes must provide a method called getArea()
	public double getArea() {
		// We have a problem here!
		// We need to return some value to compile the program
		System.out.println("Shape unknown! Cannot compute areaaaaaa1");
		return 0;
	}
	public void displayshapeName() {
		System.out.println("I am a shape");
	}

}
