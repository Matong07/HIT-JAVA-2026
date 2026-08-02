package objects;

public class Housing {

	// contans - 1
	public static short HOUSINGID = (short) 0;
	public static float HOUSINGWIDTH = (float) 0;
	public static float HOUSINGHEIGHT = (float) 0;
	public static float HOUSINGSQUARE = (float) 0;
	public static Type TYPE = Type.NO_TYPE;
	public static Sub_Type SUBTYPE = Sub_Type.NO_SUB_TYPE_HOME;
	public static Address HOUSINGADDRESS = new Address();
	public static Person HOUSINGPERSON = new Person();
	public static float HOUSINGPRICE = (float) 0;
	public static String HOUSINGDIRECTION = "No direction";
	public static Room_Number ROOMNUMBER = Room_Number.NO_ROOM;
	public static String HOUSINGTIMEBUILDING = "No Building";
	// object's properties - 0

	// Mã Nhà
	private short housing_id;
	// Chiều rộng
	private float housing_width;
	// Chiều cao
	private float housing_height;
	// Diện tích
	private float housing_square;
	// Loại nhà ở
	private Type housing_type;
	// Kiểu dáng nhà ở
	private Sub_Type housing_sub_type;
	// Địa chỉ
	private Address housing_address;
	// Liên hệ
	private Person housing_person;
	// giá cả
	private float housing_price;
	// direction - phương hướng
	private String housing_direction;
	// Room number - số phòng
	private Room_Number housing_room_number;
	// time for building - thời gian xây dựng
	private String housing_time_building;
	//private boolean housing_is_redbook;

	// contructor method - 2

	public Housing() {
		this(Housing.HOUSINGID, Housing.HOUSINGWIDTH, Housing.HOUSINGHEIGHT, Housing.HOUSINGSQUARE, Housing.TYPE,
				Housing.SUBTYPE, Housing.HOUSINGADDRESS, Housing.HOUSINGPERSON, Housing.HOUSINGPRICE,
				Housing.HOUSINGDIRECTION, Housing.ROOMNUMBER, Housing.HOUSINGTIMEBUILDING);
	}

	public Housing(short housing_id, float housing_width, float housing_height, float housing_square, Type housing_type,
			Sub_Type housing_sub_type, Address housing_address, Person housing_person, float housing_price,
			String housing_direction, Room_Number housing_room_number, String housing_time_building) {
		this.housing_id = housing_id;
		this.housing_width = housing_width;
		this.housing_height = housing_height;
		this.housing_square = housing_square;
		this.housing_type = housing_type;
		this.housing_sub_type = housing_sub_type;
		this.housing_address = housing_address;
		this.housing_person = housing_person;
		this.housing_price = housing_price;
		this.housing_direction = housing_direction;
		this.housing_room_number = housing_room_number;
		this.housing_time_building = housing_time_building;

	}

	// getter method - 3
	public short getHousingId() {
		return this.housing_id;
	}

	public float getHousingWidth() {
		return this.housing_height;
	}

	public float getHousingHeight() {
		return this.housing_height;
	}

	public float getHousingSquare() {
		return this.housing_square;
	}

	public Type getHousingType() {
		return this.housing_type;
	}

	public Sub_Type getHousingSubType() {
		return this.housing_sub_type;
	}

	public Address getHousingAddress() {
		return this.housing_address;
	}

	public Person getHousingPerson() {
		return this.housing_person;
	}

	public float getHousingPrice() {
		return this.housing_price;
	}

	public String getHousingDirection() {
		return this.housing_direction;
	}

	public Room_Number getRoomNumber() {
		return this.housing_room_number;
	}

	public String getHousingTimeBuilding() {
		return this.housing_time_building;
	}

	// setter method - 4

	public Housing setHousingId(short housing_id) {
		this.housing_id = housing_id;
		return this;
	}

	public Housing setHousingWidth(float housing_width) {
		this.housing_width = housing_width;
		return this;
	}

	public Housing setHousingHeight(float housing_height) {
		this.housing_height = housing_height;
		return this;
	}

	public Housing setHousingSquare(float housing_square) {
		this.housing_square = housing_square;
		return this;
	}

	public Housing setHousingType(Type housing_type) {
		this.housing_type = housing_type;
		return this;
	}

	public Housing setHousingSubTyte(Sub_Type housing_sub_type) {
		this.housing_sub_type = housing_sub_type;
		return this;
	}

	public Housing setHousingAddress(String cityName, String districtName, String streetName) {
		this.housing_address = new Address(cityName, districtName, streetName);
		return this;
	}

	public Housing setHousingPerson(String firstName, String lastName, byte age, Address address) {
		this.housing_person = new Person(firstName, lastName, age, address);
		return this;
	}

	public Housing setHousingPrice(float housing_price) {
		this.housing_price = housing_price;
		return this;
	}

	public Housing setHousingDirection(String housing_direction) {
		this.housing_direction = housing_direction;
		return this;
	}

	public Housing setHousingRoomNumber(Room_Number housing_room_number) {
		this.housing_room_number = housing_room_number;
		return this;
	}

	public Housing setHousingTimeBuilding(String housing_time_building) {
		this.housing_time_building = housing_time_building;
		return this;
	}

	// other method - 5
	public String toString() {
		return "Thông tin về nhà ở: \n1. Mã nhà ở: " + housing_id + "\n2. Chiều rộng : " + housing_width + "m"
				+ "\n3. Chiều dài : " + housing_height + "m" + "\n4. Diện tích : " + housing_square + "m^2"
				+ "\n5. Loại nhà ở : " + housing_type + "\n6. Kiểu dáng nhà ở : " + "\n7. Địa chỉ nhà : "
				+ housing_address + "\n8. Liên hệ người bán : " + housing_person + "\n9. Giá cả : " + housing_price
				+ "VNĐ" + "\n10. Phương hướng ngôi nhà : " + housing_direction + "\n11. Số phòng : "
				+ housing_room_number + " phòng." + "\n12. Thời gian sây dựng ngôi nhà : " + housing_time_building;
	}

	public static void main(String[] args) {
		// Khởi tạo các lớp đối tượng
		Address adr = new Address("Hà Nội", "Bắc Từ Liêm", "Cầu Diễn");
		Person prn = new Person("Quyền", "Thế", (byte) 19, adr);
		Housing h;
		Housing h1 = new Housing();
		Housing h2 = new Housing((short) 21, (float) 20, (float) 15, (float) 300, Type.MUA, Sub_Type.OFFICE_HOME, adr,
				prn, (float) 1500000000, "Đông Bắc", Room_Number.NAM, "12/10/2020");
		//In thông tin
		System.out.println(h2);
	}
	
}

enum Type {
	NO_TYPE, MUA, THUE
}

enum Sub_Type {
	NO_SUB_TYPE_HOME, HOME, BUSINESS_HOME, APARTMENT, OFFICE_HOME
}

enum Room_Number {
	NO_ROOM, MOT, HAI, BA, BON, NAM
}