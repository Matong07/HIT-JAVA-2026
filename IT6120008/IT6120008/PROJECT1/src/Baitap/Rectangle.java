package Baitap;

public class Rectangle extends Geometric {

	public double width;
	public double length;

	public Rectangle() {

	}

	public Rectangle(String colour, boolean filedin, double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public double findArea() {
		return this.width*this.length;
	}

	@Override
	public double findPerimeter() {
		return (this.length+this.width) * 2;
	}
	@Override
	public String toString() {
		return "Rectangle [getColour()=" + getColour() + ", isFiledin()=" + isFiledin() + ", toString()="
				+ super.toString() + "]";
	}
}
