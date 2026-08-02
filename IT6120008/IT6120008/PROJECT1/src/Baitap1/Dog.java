package Baitap1;

public class Dog extends Canine {
	private String dog_type;// Loại chó

	public Dog() {

	}

	public Dog(String color, String size, String surname, String reproduction, String residence, String dog_type) {
		super(color, size, surname, reproduction, residence);
		this.dog_type = dog_type;
	}

	public String getDog_type() {
		return dog_type;
	}

	public void setDog_type(String dog_type) {
		this.dog_type = dog_type;
	}

	@Override
	public String Canine_Type() {
		// TODO Auto-generated method stub
		return "Loại chó: " + this.dog_type;
	}

	@Override
	public String toString() {
		return "Dog [dog_type=" + dog_type + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
