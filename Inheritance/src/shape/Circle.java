package shape;

public  class Circle extends Shape{
	
	private double diameter;

	
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public double calculateArea() {
		return Math.PI * getDiameter()*getDiameter();
	}

	@Override
	public double calculatePerimeter() {
		
		 return  Math.PI * diameter;
				 
	}
	

}
