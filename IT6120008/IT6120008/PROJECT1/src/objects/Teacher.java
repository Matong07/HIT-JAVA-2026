package objects;

public class Teacher extends Person {

	// contants
	public static final byte TEA_ID = (byte) 0;
	public static final String TEA_SUBJECT = "No Subject";
	public static final String TEA_APPLY_JOB = "Note";
	public static final short TEA_APPLY_YEAR = (short) 0;
	public static final String TEA_ACADEMIC_LEVEL = "No Level";
	public static final String TEA_POSITION = "VT0";
	public static final float TEA_WAGE = (float) 0;
	public static final byte TEA_HEIGHT = (byte) 0;
	public static final byte TEA_WEIGHT = (byte) 0;

	// object's properties
	private byte tea_id;
	private String tea_subject;// Mon hoc
	private String tea_apply_job;
	private short tea_apply_year;
	private String tea_academic_level;// Trình độ
	private String tea_position;// Vị trí
	private float tea_wage;// Mức lương
	private byte tea_height;// Chiều cao
	private byte tea_weight;// Cân nặng

	// contructor

	public Teacher() {

	}

	public Teacher(String firstName, String lastName, byte age, Address address, byte tea_id, String tea_subject,
			String tea_apply_job, short tea_apply_year, String tea_academic_level, String tea_position, float tea_wage,
			byte tea_height, byte tea_weight) {
		// Khởi tạo cha
		super(firstName, lastName, age, address);
		// Khởi tạo con
		this.tea_id = tea_id;
		this.tea_subject = tea_subject;
		this.tea_apply_job = tea_apply_job;
		this.tea_apply_year = tea_apply_year;
		this.tea_academic_level = tea_academic_level;
		this.tea_position = tea_position;
		this.tea_wage = tea_wage;
		this.tea_height = tea_height;
		this.tea_weight = tea_weight;
	}

	public byte getTea_id() {
		return tea_id;
	}

	public String getTea_subject() {
		return tea_subject;
	}

	public String getTea_apply_job() {
		return tea_apply_job;
	}

	public short getTea_apply_year() {
		return tea_apply_year;
	}

	public String getTea_academic_level() {
		return tea_academic_level;
	}

	public String getTea_position() {
		return tea_position;
	}

	public float getTea_wage() {
		return tea_wage;
	}

	public byte getTea_height() {
		return tea_height;
	}

	public byte getTea_weight() {
		return tea_weight;
	}

	public void setTea_id(byte tea_id) {
		this.tea_id = tea_id;
	}

	public void setTea_subject(String tea_subject) {
		this.tea_subject = tea_subject;
	}

	public void setTea_apply_job(String tea_apply_job) {
		this.tea_apply_job = tea_apply_job;
	}

	public void setTea_apply_year(short tea_apply_year) {
		this.tea_apply_year = tea_apply_year;
	}

	public void setTea_academic_level(String tea_academic_level) {
		this.tea_academic_level = tea_academic_level;
	}

	public void setTea_position(String tea_position) {
		this.tea_position = tea_position;
	}

	public void setTea_wage(float tea_wage) {
		this.tea_wage = tea_wage;
	}

	public void setTea_height(byte tea_height) {
		this.tea_height = tea_height;
	}

	public void setTea_weight(byte tea_weight) {
		this.tea_weight = tea_weight;
	}

	@Override
	public String toString() {
		return "Teacher [" + super.toString() + "+tea_id=" + tea_id + ", tea_subject=" + tea_subject
				+ ", tea_apply_job=" + tea_apply_job + ", tea_apply_year=" + tea_apply_year + ", tea_academic_level="
				+ tea_academic_level + ", tea_position=" + tea_position + ", tea_wage=" + tea_wage + ", tea_height="
				+ "cm" + +tea_height + "KG" + ", tea_weight=" + tea_weight + "VNĐ" + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address("Hà Nội", "Bắc Từ Liêm", "Kiều Mai");
		// Khởi tạo đa hình
		Person p = new Teacher("Đạt", "Dương Tất", (byte) 20, addr, (byte) 332, "Testing black box", "Thử việc",
				(short) 1, "Nhân viên", "Thực tập sinh", (float) 350000,(byte) 162, (byte) 60);

		// Khởi tạo lớp đối tượng
		Teacher t = new Teacher();
		t.setFirstName("Huy");
		t.setLastName("Hoàng Quang");
		t.setAge((byte) 18);
		t.setTea_id((byte) 1);
		t.setTea_subject("Lập Trình Hướng Đối Tượng");
		t.setTea_apply_year((short) 10);
		t.setTea_apply_job("Chính thức");
		t.setTea_academic_level(" Thạc Sĩ");
		t.setTea_position("Giảng Viên");
		t.setTea_height((byte) 165);
		t.setTea_weight((byte) 62);
		t.setTea_wage((float) 20000000);
		// In thông tin
		System.out.println(t);
		System.out.println(p.toString());

	}

}
