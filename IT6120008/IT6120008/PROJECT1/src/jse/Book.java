package jse;

public class Book {

	// constants
	public static final short BOOKID = (short) 0;
	public static final String BOOKNAME = "No name";
	public static final String BOOKTITLEPAGES = "No title page";
	public static final String BOOKSUMMARY = " No summary";
	public static final String BOOLURDOWLOAD = "No url dowload";
	public static final Person BOOKAUTHOR = new Person();
	public static final String BOOKPUBLISHERNAME = "No publisher name";
	public static final Address BOOKADDRESSPUBLISER = new Address();
	public static final short BOOKNUMBERPAGES = (short) 0;

	// object's

	private short book_id;// Mã sách
	private String book_name;// Tên sách
	private String book_title_pages;// trang bìa sách
	private String book_summary;// Tóm tắt nội dung
	private String book_url_dowload;// Liên kết tải về
	private Person book_author;// Tác giả
	private String book_publisher_name;// Nhà xuất bản
	private Address book_address_publisher;// Địa chỉ nhà sản xuất
	private short book_number_pages;// Số trang

	// Constructor
	public Book() {

	}

	public Book(short book_id, String book_name, String book_title_pages, String book_summary, String book_url_dowload,
			Person book_author, String book_publisher_name, Address book_address_publisher, short book_number_pages) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_title_pages = book_title_pages;
		this.book_summary = book_summary;
		this.book_url_dowload = book_url_dowload;
		this.book_author = book_author;
		this.book_publisher_name = book_publisher_name;
		this.book_address_publisher = book_address_publisher;
		this.book_number_pages = book_number_pages;
	}

	public short getBook_id() {
		return book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public String getBook_title_pages() {
		return book_title_pages;
	}

	public String getBook_summary() {
		return book_summary;
	}

	public String getBook_url_dowload() {
		return book_url_dowload;
	}

	public Person getBook_author() {
		return book_author;
	}

	public String getBook_publisher_name() {
		return book_publisher_name;
	}

	public Address getBook_address_publisher() {
		return book_address_publisher;
	}

	public short getBook_number_pages() {
		return book_number_pages;
	}

	public void setBook_id(short book_id) {
		this.book_id = book_id;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public void setBook_title_pages(String book_title_pages) {
		this.book_title_pages = book_title_pages;
	}

	public void setBook_summary(String book_summary) {
		this.book_summary = book_summary;
	}

	public void setBook_url_dowload(String book_url_dowload) {
		this.book_url_dowload = book_url_dowload;
	}

	public void setBook_author(Person book_author) {
		this.book_author = book_author;
	}

	public void setBook_publisher_name(String book_publisher_name) {
		this.book_publisher_name = book_publisher_name;
	}

	public void setBook_address_publisher(Address book_address_publisher) {
		this.book_address_publisher = book_address_publisher;
	}

	public void setBook_number_pages(short book_number_pages) {
		this.book_number_pages = book_number_pages;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_title_pages=" + book_title_pages
				+ ", book_summary=" + book_summary + ", book_url_dowload=" + book_url_dowload + ", book_author="
				+ book_author + ", book_publisher_name=" + book_publisher_name + ", book_address_publisher="
				+ book_address_publisher + ", book_number_pages=" + book_number_pages + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khởi tạo thể hiện các lớp đối tượng
		Book b = new Book();
		Person p = new Person("Duy", "Vũ Đình", (byte) 20);
		Address addr = new Address("Hà Nội", "Bắc Từ Liêm", "Phố Nhổn");

		b.setBook_id((short) 1234);
		b.setBook_name("Lập trình hướng đối tượng");
		b.setBook_title_pages("Bìa sách ....");
		b.setBook_summary("");
		b.setBook_url_dowload("//httm/OOP/Huongdoituong.vn.com");
		b.setBook_author(p);
		b.setBook_publisher_name("Nguyễn Văn A");
		b.setBook_address_publisher(addr);
		b.setBook_number_pages((short) 180);
		
		//In thông tin
		System.out.println(b);
	}

}
