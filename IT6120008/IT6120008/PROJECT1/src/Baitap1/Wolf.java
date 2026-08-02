package Baitap1;

public class Wolf extends Canine {

	private String wofl_type;// Loại sói

	public Wolf(String color, String size, String surname, String reproduction, String residence, String wofl_type) {
		super(color, size, surname, reproduction, residence);
		this.wofl_type = wofl_type;
	}

	public String getWofl_type() {
		return wofl_type;
	}

	public void setWofl_type(String wofl_type) {
		this.wofl_type = wofl_type;
	}

	@Override

	public String Canine_Type() {
		// TODO Auto-generated method stub
		return this.wofl_type;
	}

	@Override
	public String toString() {
		return "Wolf [wofl_type=" + wofl_type + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
