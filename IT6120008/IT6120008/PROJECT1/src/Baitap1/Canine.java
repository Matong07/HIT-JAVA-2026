package Baitap1;

public abstract class Canine extends Animal {

	private String surname;// Thuộc họ
	private String reproduction;// Sinh sản
	private String residence;// Nơi cư trú

	public abstract String Canine_Type();//Loại thú răng nanh

	public Canine() {

	}

	public Canine(String color, String size, String surname, String reproduction, String residence) {
		super(color, size);
		this.surname = surname;
		this.reproduction = reproduction;
		this.residence = residence;
	}

	public String getSurname() {
		return surname;
	}

	public String getReproduction() {
		return reproduction;
	}

	public String getResidence() {
		return residence;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setReproduction(String reproduction) {
		this.reproduction = reproduction;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	@Override
	public String Characteristic() {
		// TODO Auto-generated method stub
		return this.surname +" "+ this.reproduction;
	}

	@Override
	public String Habitat() {
		// TODO Auto-generated method stub
		return this.residence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
