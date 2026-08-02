package Baitap1;

public abstract class Feline extends Animal {

	// object's
	private String feline_food;// Thức ăn
	private String feline_address;// Địa điểm xuất hiện

	public abstract boolean Climb();//Leo trèo
	
	public Feline() {

	}

	public Feline(String color, String size,String feline_food, String feline_address) {
		
		this.feline_food = feline_food;
		this.feline_address = feline_address;
	}

	public String getFeline_food() {
		return feline_food;
	}

	public String getFeline_address() {
		return feline_address;
	}

	public void setFeline_food(String feline_food) {
		this.feline_food = feline_food;
	}

	public void setFeline_address(String feline_address) {
		this.feline_address = feline_address;
	}

	@Override
	public String Characteristic() {
		// TODO Auto-generated method stub
		return this.feline_food;
	}

	@Override
	public String Habitat() {
		// TODO Auto-generated method stub
		return this.feline_address;
	}

	@Override
	public String toString() {
		return "Feline [GetColor=" + getColor() + ", Size=" + getSize() + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
