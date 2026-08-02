package Baitap1;

public class Tiger extends Feline {

	// object's
	private String tiger_characteristic;// Đặc tính
	private String tiger_habitat;// Môi trường sống
	private boolean tiger_climb;// Leo trèo

	public Tiger(String color, String size, String feline_food, String feline_address, String tiger_characteristic,
			String tiger_habitat, boolean tiger_climb) {
		super(color, size, feline_food, feline_address);
		this.tiger_characteristic = tiger_characteristic;
		this.tiger_habitat = tiger_habitat;
		this.tiger_climb = tiger_climb;
	}

	public String getTiger_characteristic() {
		return tiger_characteristic;
	}

	public String getTiger_habitat() {
		return tiger_habitat;
	}

	public boolean isTiger_climb() {
		return tiger_climb;
	}

	public void setTiger_characteristic(String tiger_characteristic) {
		this.tiger_characteristic = tiger_characteristic;
	}

	public void setTiger_habitat(String tiger_habitat) {
		this.tiger_habitat = tiger_habitat;
	}

	public void setTiger_climb(boolean tiger_climb) {
		this.tiger_climb = tiger_climb;
	}

	@Override
	public String Characteristic() {
		// TODO Auto-generated method stub
		return this.tiger_characteristic;
	}

	@Override
	public String Habitat() {
		// TODO Auto-generated method stub
		return this.tiger_habitat;
	}

	@Override
	public boolean Climb() {
		// TODO Auto-generated method stub
		return this.tiger_climb;
	}

	@Override
	public String toString() {
		return "Tiger [tiger_characteristic=" + tiger_characteristic + ", tiger_habitat=" + tiger_habitat
				+ ", tiger_climb=" + tiger_climb + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
