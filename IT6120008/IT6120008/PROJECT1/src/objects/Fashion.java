package objects;

public class Fashion {

	// contans - 1
	public static final short FASHIONID = (short) 0;
	public static final String FASHIONMANAGEID = "ADMIN00";
	public static final String FASHIONNAME = "No Name";
	public static final byte FASHIONCATEGORYID = (byte) 0;
	public static final byte FASHIONGROUPID = (byte) 0;
	public static final byte FASHIONSYSTEMID = (byte) 0;
	public static final String FASHIONGRAND = "No Brand";
	public static final float FASIONPRICE = 0;
	public static final float FASHIONPRICEDISCOUNT = 0;
	public static final byte FASHIONSIZE = (byte) 0;
	public static final String FASHIONUPDATE = "No date";
	public static final String FASHIONLASTMODIFIED = "No last modified";
	public static final short FASHIONCOUNT = (short) 0;
	public static final String FASHIONINTRO = " No intro ";
	public static final String FASHIONDETAIL = " No detail";
	public static final Season SEASON = Season.NO_SEASON;
	public static final Quality QUALITY = Quality.NO_QUALITY;
	public static final Color COLOR = Color.NO_COLOR;
	public static final Person PERSON = new Person();
	public static final Address ADDRESS = new Address();
	// object's properties - 0

	private short fashion_id;// Mã tìm kiếm
	private String fashion_manage_id;// Mã quản lí - Bắt buộc
	private String fashion_name;// Tên sản phẩm - Bắt buộc
	private byte fashion_category_id;// Loại sản phẩm
	private byte fashion_group_id;// Nhóm sản phẩm
	private byte fashion_system_id;// Phân hệ sản phẩm
	// private String[] fashion_images;// Danh sách ảnh + video minh họa
	private String fashion_grand;// Thương hiệu sản phẩm
	private float fashion_price;// Giá sản phẩm - Bắt buộc
	private float fashion_price_discount;// Giá khuyến mại
	private byte fashion_size;// Kích thuocws
	private String fashion_update;// Ngày cập nhật - Bắt buộc
	private String fashion_last_modified;// Ngày chỉnh sửa
	private short fashion_count;// Số lượng trong kho
	// private boolean fashion_is_show;// Hiển thị trang chủ
	// private boolean fashion_is_delete;// Đánh dấu loại bỏ
	private String fashion_intro;// Tóm tắt nhanh
	private String fashion_detail;// Chi tiết
	private Season fashion_season;// Thời trang theo mùa
	private Quality fashion_quality;// Chất lượng
	private Color fashion_color;// Màu sắc - Bắt buộc
	private Person person;// Người quản lí
	private Address address; // Địa chỉ

	// Contructor method - 2
	public Fashion() {
		this(Fashion.FASHIONID, Fashion.FASHIONMANAGEID, Fashion.FASHIONNAME, Fashion.FASHIONCATEGORYID,
				Fashion.FASHIONGROUPID, Fashion.FASHIONSYSTEMID, Fashion.FASHIONGRAND, Fashion.FASIONPRICE,
				Fashion.FASHIONPRICEDISCOUNT, Fashion.FASHIONSIZE, Fashion.FASHIONUPDATE, Fashion.FASHIONLASTMODIFIED,
				Fashion.FASHIONCOUNT, Fashion.FASHIONINTRO, Fashion.FASHIONDETAIL, Fashion.SEASON, Fashion.QUALITY,
				Fashion.COLOR, Fashion.PERSON, Fashion.ADDRESS);
	}

	public Fashion(short fashion_id, String fashion_manage_id, String fashion_name, byte fashion_category_id,
			byte fashion_group_id, byte fashion_system_id, String fashion_grand, float fashion_price,
			float fashion_price_discount, byte fashion_size, String fashion_update, String fashion_last_modified,
			short fashion_count, String fashion_intro, String fashion_detail, Season fashion_season,
			Quality fashion_quality, Color fashion_color, Person person, Address address) {
		this.fashion_id = fashion_id;
		this.fashion_manage_id = fashion_manage_id;
		this.fashion_name = fashion_name;
		this.fashion_category_id = fashion_category_id;
		this.fashion_group_id = fashion_group_id;
		this.fashion_system_id = fashion_system_id;
		this.fashion_grand = fashion_grand;
		this.fashion_price = fashion_price;
		this.fashion_price_discount = fashion_price_discount;
		this.fashion_size = fashion_size;
		this.fashion_update = fashion_update;
		this.fashion_last_modified = fashion_last_modified;
		this.fashion_count = fashion_count;
		this.fashion_intro = fashion_intro;
		this.fashion_detail = fashion_detail;
		this.fashion_season = fashion_season;
		this.fashion_quality = fashion_quality;
		this.fashion_color = fashion_color;
		this.person = person;
		this.address = address;

	}

	// getter method - 3
	public short getFashionId() {
		return this.fashion_id;
	}

	public String getFashionManageId() {
		return this.fashion_manage_id;
	}

	public String getFashionName() {
		return this.fashion_name;
	}

	public byte getFashionCategoryId() {
		return this.fashion_category_id;
	}

	public byte getFashionGroupId() {
		return this.fashion_group_id;
	}

	public byte getFashionSystemId() {
		return this.fashion_system_id;
	}

	public String getFashionGrand() {
		return this.fashion_grand;
	}

	public float getFashionPrice() {
		return this.fashion_price;
	}

	public float getFashionPriceDiscount() {
		return this.fashion_price_discount;
	}

	public byte getFashionSize() {
		return this.fashion_size;
	}

	public String getFashionUpdate() {
		return this.fashion_update;
	}

	public String getFashionLastModified() {
		return this.fashion_last_modified;
	}

	public short getFashionCount() {
		return this.fashion_count;
	}

	public String getFashionIntro() {
		return this.fashion_intro;
	}

	public String getFashionDetail() {
		return this.fashion_detail;
	}

	public Season getSeason() {
		return this.fashion_season;
	}

	public Quality getQuality() {
		return this.fashion_quality;
	}

	public Color getColor() {
		return this.fashion_color;
	}

	public Person getPeson() {
		return this.person;
	}

	public Address getAddress() {
		return this.address;
	}

	// setter method - 4

	public Fashion setFashionId(short fashion_id) {
		this.fashion_id = fashion_id;
		return this;
	}

	public Fashion setFashionManageId(String fashion_manage_id) {
		this.fashion_manage_id = fashion_manage_id;
		return this;
	}

	public Fashion setFashionName(String fashion_name) {
		this.fashion_name = fashion_name;
		return this;
	}

	public Fashion setFashionCategoryId(byte fashion_category_id) {
		this.fashion_category_id = fashion_category_id;
		return this;
	}

	public Fashion setFashionGroupId(byte fashion_group_id) {
		this.fashion_group_id = fashion_group_id;
		return this;
	}

	public Fashion setFashionSystemId(byte fashion_system_id) {
		this.fashion_system_id = fashion_system_id;
		return this;
	}

	public Fashion setFashionGrand(String fashion_grand) {
		this.fashion_grand = fashion_grand;
		return this;
	}

	public Fashion setFashionPrice(float fashion_price) {
		this.fashion_price = fashion_price;
		return this;
	}

	public Fashion setFashionPriceDiscount(float fashion_price_discount) {
		this.fashion_price_discount = fashion_price_discount;
		return this;
	}

	public Fashion setFashionSize(byte fashion_size) {
		this.fashion_size = fashion_size;
		return this;
	}

	public Fashion setFashionUpdate(String fashion_update) {
		this.fashion_update = fashion_update;
		return this;
	}

	public Fashion setFashionLastModified(String fashion_last_modified) {
		this.fashion_last_modified = fashion_last_modified;
		return this;
	}

	public Fashion setFashionCount(short fashion_count) {
		this.fashion_count = fashion_count;
		return this;
	}

	public Fashion setFashionIntro(String fashion_intro) {
		this.fashion_intro = fashion_intro;
		return this;
	}

	public Fashion setFashionDetail(String fashion_detail) {
		this.fashion_detail = fashion_detail;
		return this;
	}

	public Fashion setSeason(Season fashion_season) {
		this.fashion_season = fashion_season;
		return this;
	}

	public Fashion Quality(Quality fashion_quality) {
		this.fashion_quality = fashion_quality;
		return this;
	}

	public Fashion setColor(Color fashion_color) {
		this.fashion_color = fashion_color;
		return this;
	}

	public Fashion setPerson(String firstName, String lastName, byte age,Address address) {
		this.person = new Person(firstName, lastName, age, address);
		return this;
	}

	public Fashion setAddress(String cityName, String districtName, String streetName) {
		this.address = new Address(cityName, districtName, streetName);
		return this;
	}

	// other method - 5
	public String toString() {
		return "Chủ đề về thời trang: \n 1. Mã tìm kiếm : " + fashion_id + "\n 2. Mã quản lí : " + fashion_manage_id
				+ "\n 3. Tên sản phẩm : " + fashion_name + "\n 4. Loại sản phẩm : " + fashion_category_id
				+ "\n 5. Nhóm sản phẩm : " + fashion_group_id + "\n 6. Phân hệ sản phẩm : " + fashion_system_id
				+ "\n 7. Thương hiệu sản phẩm : " + fashion_grand + "\n 8. Giá sản phẩm : " + fashion_price + "VNĐ"
				+ "\n 9. Giá khuyến mãi : " + fashion_price_discount + "VNĐ" + "\n 10. Kích thước : " + fashion_size
				+ "\n 11. Ngày cập nhật : " + fashion_update + "\n 12. Ngày chỉnh sửa : " + fashion_last_modified
				+ "\n 13. Số lượng còn trong kho : " + fashion_count + "\n 14. Tóm tắt nhanh : " + fashion_intro
				+ "\n 15. Chi tiết : " + fashion_detail + "\n 16. Thời trang theo mùa : "
				+ this.fashion_season.toString() + "\n 17. Chất lượng : " + this.fashion_quality.toString()
				+ "\n 18. Màu sắc : " + this.fashion_color.toString() + "\n 19. Người quản lý : "
				+ this.person.toString() + "\n 20. Địa chỉ : " + this.address.toString();
	}

	public static void main(String[] args) {

		// Khởi tạo các thể hiện lớp đối tượng
		Address adr = new Address("Hà Nội", "Bắc Từ Liêm", "Kiều Mai");
		Person psn = new Person("Quyền", "Thế", (byte) 19,adr);
		
		Fashion f;
		Fashion f1 = new Fashion();
		Fashion f2 = new Fashion((short)001, "ADMIN 1", "Quần Kaki", (byte)23, (byte)10,(byte) 2, "MANDO",(float) 120000,(float) 95000,(byte) 29, "23/11/2022",
				"Chưa chỉnh sửa",(byte) 120, "Quần phù hợp với mọi lứa tuổi", " Quần có thiết kế theo style hàn quốc",
				Season.SUMMER, Quality.GOOD, Color.M, psn, adr);
//		Fsashion f2 = new fashion((short) 001, "ADMIN 1", "Quần Kaki", (byte) 23, (byte) 10, (byte) 2, "MANDO",
//				(float) 120000, (float) 95000, (byte)29, "23/11/2022", "Chưa chỉnh sửa", (byte)120, "Quần phù hợp với mọi lứa tuổi",
//				" Quần có thiết kế theo style hàn quốc", Season.SUMMER, Quality.GOOD, Color.M, psn, adr);
//		// In thông tin
		System.out.println(f2);
	}

}

enum Color {
	NO_COLOR, M, L, XL, XXL
}

enum Quality {
	NO_QUALITY, LESAST, MEDIUM, GOOD, VERYGOOD
}

enum Season {
	NO_SEASON, SPRING, SUMMER, AUTUMN, WINTER
}