package Baitap1;

public class Hippo extends Animal {

	// object's
	private String hippo_food;// Thức ăn
	private String hippo_habitat;// Môi trường sống

	public Hippo() {

	}

	public Hippo(String color, String size, String hippo_food, String hippo_habitat) {
		super(color, size);
		this.hippo_food = hippo_food;
		this.hippo_habitat = hippo_habitat;
	}

	public String getHippo_food() {
		return hippo_food;
	}

	public String getHippo_habitat() {
		return hippo_habitat;
	}

	public void setHippo_food(String hippo_food) {
		this.hippo_food = hippo_food;
	}

	public void setHippo_habitat(String hippo_habitat) {
		this.hippo_habitat = hippo_habitat;
	}

	@Override
	public String Characteristic() {
		// TODO Auto-generated method stub
		return this.hippo_food;
	}

	@Override
	public String Habitat() {
		// TODO Auto-generated method stub
		return this.hippo_habitat;
	}

	@Override
	public String toString() {
		return "Hippo [hippo_food=" + hippo_food + ", hippo_habitat=" + hippo_habitat + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
