package jse;

public class Person {
	// constants
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No lastName";
	public static final byte AGE = (byte) 0;

	// Object's properties
	private String firstName;
	private String lastName;
	private byte age;

	// contructor methods
	public Person() {
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE);
	}

	public Person(String firstName, String lastName, byte age) {
		// Đặc biệt loại 2: đầy đủ tham số
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// geter method
	public String getFirstName() {
		return this.firstName;

	}

	public String getLastName() {
		return this.lastName;
	}

	public byte getAge() {
		return this.age;
	}

	// Setter method

	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public Person setAge(byte age) {
		this.age = age;
		return this;
	}


	// Other methods
	public String toString() {
//		return lastName + " " + firstName + ", " + age + "," +this.address.toString();
		return lastName + " " + firstName + ", " + age;
	}


	public static void main(String[] args) {
		// Khởi tao các thể hiện lớp đối tượng

		Address addr = new Address("Tuyên Quang", "Chiêm Hóa", "Tri phú");

		Person p;
		Person p1 = new Person();
//		Person p2 = new Person((byte) 18);
//		Person p3 = new Person("Quyền", (byte) 18);

		// in thông tin
		System.out.println(p1);
	}
}