package Baitap1;

public class Lion extends Feline {

	// object's
	private String lion_foot;// Chân
	private String lion_climate;// Khí hậu
	private boolean lion_climb;// Biết leo trèo

	public Lion() {

	}

	public Lion(String color, String size, String feline_food, String feline_address, String lion_foot,
			String lion_climate, boolean lion_climb) {
		this.lion_foot = lion_foot;
		this.lion_climate = lion_climate;
		this.lion_climb = lion_climb;
	}

	public String getLion_foot() {
		return lion_foot;
	}

	public String getLion_climate() {
		return lion_climate;
	}

	public boolean getLion_climb() {
		return lion_climb;
	}

	public void setLion_foot(String lion_foot) {
		this.lion_foot = lion_foot;
	}

	public void setLion_climate(String lion_climate) {
		this.lion_climate = lion_climate;
	}

	public void setLion_climb(boolean lion_climb) {
		this.lion_climb = lion_climb;
	}

	public String Characteristic() {
		// TODO Auto-generated method stub
		return this.lion_foot;
	}

	@Override
	public String Habitat() {
		// TODO Auto-generated method stub
		return this.lion_climate;
	}

	public boolean Climb() {
		// TODO Auto-generated method stub
		return this.lion_climb;
	}

	@Override
	public String toString() {
		return "Lion [lion_foot=" + lion_foot + ", lion_climate=" + lion_climate + ", lion_climb=" + lion_climb
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
