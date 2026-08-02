package objects;

public class Student extends Person {

	// contans

	public static final int STU_ID = (int) 0;
	public static final String STU_ID_MANAGE = "No ID manage";
	public static final String STU_SPECIALIED = "No Specialied";
	public static final byte STU_APPLY_YEAR = 21;

	// Student's properties - Thuộc tính
	private int stu_id; // mã tìm kiếm
	private String stu_id_manage; // Mã quản lý
	private String stu_specialied; // Chuyên ngành
	private byte stu_apply_year;// Năm nhập học

	// contructor là phương thức khởi tạo đối tượng
	public Student() {
		this(Student.FIRSTNAME, Student.LASTNAME, Student.AGE, Student.ADDRESS, Student.STU_ID, Student.STU_ID_MANAGE,
				Student.STU_SPECIALIED, Student.STU_APPLY_YEAR);
	}

	public Student(String firstName, String lastName, byte age, Address address, int stu_id, String stu_id_manage,
			String stu_specialied, byte stu_apply_year) {
		// Khởi tạo đối tượng cha Person
		super(firstName, lastName, age, address);

		// gán giá trị các thành phần thuộc tính của con(Student)
		this.stu_id = stu_id;
		this.stu_id_manage = stu_id_manage;
		this.stu_specialied = stu_specialied;
		this.stu_apply_year = stu_apply_year;
	}

	public int getStu_id() {
		return stu_id;
	}

	public String getStu_id_manage() {
		return stu_id_manage;
	}

	public String getStu_specialied() {
		return stu_specialied;
	}

	public byte getStu_apply_year() {
		return stu_apply_year;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public void setStu_id_manage(String stu_id_manage) {
		this.stu_id_manage = stu_id_manage;
	}

	public void setStu_specialied(String stu_specialied) {
		this.stu_specialied = stu_specialied;
	}

	public void setStu_apply_year(byte stu_apply_year) {
		this.stu_apply_year = stu_apply_year;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + "   SI" + stu_id + ", SIM = " + stu_id_manage + ", SS" + stu_specialied
				+ ", SAY = " + stu_apply_year + "]";
	}

	public static void main(String[] args) {
		// Khởi tạo đối tượng
		Person s2 = new Student("Quyền", "Ma Thế", (byte)19, new Address("Tuyên Quang", "Chiêm Hóa", "Tri phú"), (int)603162,"(2021)603162", "Công Nghệ Thông Tin",
				(byte) 2021);
		Student s = new Student();
		s.setFirstName("Quyền");
		s.setLastName("Ma Thế");
		s.setAge((byte) 19);
		s.setAddress("Hà Nội", "Bắc Từ Liêm", "Kiều Mai");
		s.setStu_id((int) 32);
		s.setStu_id_manage("(2021)603162");
		s.setStu_specialied("Công Nghệ Thông Tin");
		s.setStu_apply_year((byte) 2021);

		System.out.println(s);
	}
}
