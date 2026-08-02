package Baitap1;

public abstract class Animal {

	// object's
	private String color;// Màu sắc
	private String size;// Kích thước

	public abstract String Characteristic();// Đặc tính

	public abstract String Habitat();// Môi trường sống

	public Animal() {

	}

	public Animal(String color, String size) {
		this.color = color;
		this.size = size;
	}
	

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Animal [color=" + color + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
