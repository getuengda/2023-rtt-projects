package shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Take input from users
		Scanner input = new Scanner(System.in);
		
		
		
		//area = l*w
		Rectangle rect = new Rectangle();
		rect.setName("Rectangle");
		rect.getName();
		rect.setHeight(5.4);
		rect.setWidth(10.5);
		
		//area = pi*D
		Circle circle = new Circle();
		circle.setDiameter(25.5);
		circle.getName();
		circle.setName("Circle");
		
		//area triangle
		Triangle tri = new Triangle();
		tri.setName("Triangle");
		tri.getName();
		tri.setSide2(5.0);
		tri.setSide3(6.2);
		tri.setSideBase(10.5);
		tri.setTriangleHeight(5.2);
		
		//Square
		Square squ= new Square();
		squ.setLength(10.5);
		squ.getName();
		squ.setName("Square");
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(rect);
		shapes.add(circle);
		shapes.add(tri);
		shapes.add(squ);
		
		
		for (Shape shape: shapes) {
			System.out.println("The area for shape " + shape.getName() + " is " + shape.calculateArea());
			System.out.println("The perimeter for shape " + shape.getName() + " is " + shape.calculatePerimeter());
		}

	}

}
