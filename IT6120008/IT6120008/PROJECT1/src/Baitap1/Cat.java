package Baitap1;

public class Cat extends Feline {

	private String cat_characteristic;// Đặc tính của mèo
	private String cat_habitat;// Môi trường sống
	private boolean cat_climb;// Biết leo trèo

	public Cat() {

	}

	public Cat(String color, String size, String feline_food, String feline_address, String cat_characteristic,
			String cat_habitat, boolean cat_climb) {
		super(color, size, feline_food, feline_address);
		this.cat_characteristic = cat_characteristic;
		this.cat_habitat = cat_habitat;
		this.cat_climb = cat_climb;
	}

	public String getCat_characteristic() {
		return cat_characteristic;
	}

	public String getCat_habitat() {
		return cat_habitat;
	}

	public boolean isCat_climb() {
		return cat_climb;
	}

	public void setCat_characteristic(String cat_characteristic) {
		this.cat_characteristic = cat_characteristic;
	}

	public void setCat_habitat(String cat_habitat) {
		this.cat_habitat = cat_habitat;
	}

	public void setCat_climb(boolean cat_climb) {
		this.cat_climb = cat_climb;
	}

	public String Characteristic() {
		// TODO Auto-generated method stub
		return this.cat_characteristic;
	}

	@Override
	public String Habitat() {
		// TODO Auto-generated method stub
		return this.cat_habitat;
	}

	public boolean Climb() {
		// TODO Auto-generated method stub
		return this.cat_climb;
	}

	@Override
	public String toString() {
		return "Cat [cat_characteristic=" + cat_characteristic + ", cat_habitat=" + cat_habitat + ", cat_climb="
				+ cat_climb + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
