package objects;

//So sánh 1 và chỉ 1 phương thức
public class Person extends ABC implements Comparable<Person> {
	// constants
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No lastName";
	public static final byte AGE = (byte) 0;
	public static final Address ADDRESS = new Address();
	public static final Address ADDRESS2 = new Address(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);

	// classes' variables

	private static byte count = 0;

	// Object's properties
	// che dấu private tập con k truy cập đc
	// Che dấu protected tập con có thể truy cập
	private String firstName;
	private String lastName;
	private byte age;
	private Address address;

	// contructor: phương thức khởi tạo đối tượng, gắn các giá trị ban đầu cho tất
	// cả các thuộc tính
	// contructor methods
	public Person() {
		// Đặc biệt loại 1: Không tham số
//		this.firstName = "No FirstName";
//		this.lastName = "No lastName";
//		this.age = 0;
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
	}

//	public Person(byte age) {
//		// contructor trung gian
////		this.firstName = "No FirstName";
////		this.lastName = "No lastName";
////		this.age = age;
//		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
//	}
//
//	public Person(String firstName, byte age) {
//		// contructor trung gian
////		this.firstName = firstName;
////		this.lastName = "No lastName";
////		this.age = age;
//		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
//	}

	public Person(String firstName, String lastName, byte age, Address address) {
		// Đặc biệt loại 2: đầy đủ tham số
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		// cách 1
		// cùng 1 địa chỉ
		this.address = address;

		// cách 2
		// sao chép địa chỉ tạo 1 đối tượng mới độc lập nhau
		this.address = new Address(address);

		// Tăng biến đếm đối tượng
		Person.count++;
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

	public Address getAddress() {
		return this.address;
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

//	public Person setAddress(Address address) {
//		this.address = address;
//		return this;
//	}

	public Person setAddress(String cityName, String districtName, String streetName) {
		this.address = new Address(cityName, districtName, streetName);
		return this;
	}

	// Other methods
	public String toString() {
//		return lastName + " " + firstName + ", " + age + "," +this.address.toString();
		return lastName + " " + firstName + ", " + age;
	}

	public static byte getCountPerson() {
		return Person.count;
	}

	protected void finalize() throws Throwable {
		// Giảm số đối tượng được giải phóng khỏi bộ nhớ
		Person.count--;

	}
	public String getFirstname1() {
		String s = this.firstName.trim();//Trim() xóa khoảng trắng
		if(s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);//substring cắt chuỗi
		}else {
			return s;
		}
	}

	public static void main(String[] args) {
		// Khởi tao các thể hiện lớp đối tượng

		Address addr = new Address("Tuyên Quang", "Chiêm Hóa", "Tri phú");

		Person p;
		Person p1 = new Person();
//		Person p2 = new Person((byte) 18);
//		Person p3 = new Person("Quyền", (byte) 18);
		Person p4 = new Person("Quyền", "Thế", (byte) 18, addr);

		// in thông tin
		System.out.println(p1);
//		System.out.prbyteln(p2);
//		System.out.prbyteln(p3);
//		System.out.prbyteln(p4);
		// Bổ sung thông tin cho p1
//		p1.setFirstName("Đạt");
//		p1.setLastName("Tất");
//		p1.setAge((byte)19);
		p1.setFirstName("Đạt").setLastName("Dương Tất").setAge((byte) 20);

		System.out.println(p1);
		System.out.println(p4);
		// In thông tin đối tượng
		System.out.println("Số đối tượng được khởi tạo là " + Person.getCountPerson());
	}

	@Override
	// Peron trong ()được so sánh vs phương thức Person ở trên ở trên
	//compareTo chỉ đc dùng 1 lần
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		// this.age (được so sánh) là truy cập vào thuộc tính
		// o.getAge(so sánh) là lấy thuộc tính đã có
		return this.age - o.getAge();
	}

	// Xắp xếp theo tên
//	public int compareTo1(Person n) {
//		return (int)this.firstName.compareTo(n.getFirstName());
//
//	}
}