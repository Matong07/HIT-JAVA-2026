package Baitap;

public class Circle extends Geometric{
	
	
	public double radius;
	
	
	public Circle() {
		
	}
	public Circle(String colour, boolean filedin, double radius) {
		
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double findArea() { 
		return Math.PI *this.radius*this.radius;
	}
	@Override
	public double findPerimeter() {
		return 2*Math.PI*this.radius;
	}
	@Override
	public String toString() {
		return "Circle [getColour()=" + getColour() + ", isFiledin()=" + isFiledin() + ", toString()="
				+ super.toString() + "]";
	}
}

