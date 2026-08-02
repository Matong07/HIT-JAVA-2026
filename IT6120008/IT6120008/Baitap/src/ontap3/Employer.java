package ontap3;

import objects.Address;
import objects.Person;

public class Employer {

	private String firstName;
	private String lastName;
	private MyDate birthDay;
	private MyDate applyDay;

	public void printIntro() {

	}

	public void printData() {

	}

	public Employer() {

	}

	public Employer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employer(String firstName, String lastName, MyDate birthDay, MyDate applyDay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.applyDay = applyDay;
	}

	public MyDate getBirthDay() {
		return birthDay;
	}

	public MyDate getApplyDay() {
		return applyDay;
	}

	public void setBirthDay(MyDate birthDay) {
		this.birthDay = birthDay;
	}

	public void setApplyDay(MyDate applyDay) {
		this.applyDay = applyDay;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public MyDate setBirthDay(int day, int month, int year) {
		this.birthDay = new MyDate(day, month, year);
		return this;
	}

	@Override
	public String toString() {
		return "Employer [firstName=" + firstName + ", lastName=" + lastName + ", birthDay=" + birthDay + ", applyDay="
				+ applyDay + "]";
	}

}
