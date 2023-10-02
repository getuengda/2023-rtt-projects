package polymorphism_inheritance_overriding;

public class Circle extends Shape{

	protected double radius;
	private final double PI = Math.PI;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public double getArea() {
		//double area = PI * this.radius * this.radius
		// And initializer value in parent class variable
		super.area = PI* Math.pow(this.radius, 2);
		return super.area; // reference to parent class variable
	}
	@Override
	public void displayshapeName() {
		System.out.println("Drawing a circle of radius " + this.radius);
	}
	// Return a self-descriptive string
	public String toString() {
		return "Circle[ radius " + radius + super.toString() + "]"; 
	}

}
