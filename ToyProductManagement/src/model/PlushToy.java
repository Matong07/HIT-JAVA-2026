package model;

public class PlushToy extends Toy{
	private String material;
	public PlushToy(String material) {
		super(id, name,price,quatity);
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	 		
}
