package objects;

public class Book {
	// contants - 1
	public static final int BOOKID = (int) 0;
	public static final String BOOKTITLE = "No Book Title";
	public static final String BOOKAUTHORNAME = "No Book Author Name";
	public static final String BOOKSUMMARY = "No Book Summary";
	public static final String BOOKIMAGE = " No Book Image";
	public static final short BOOKPAGES = (short) 0;
	public static final String BOOKURL = "No Book Url";

	// objects's properties - 0
	private int book_id;
	private String book_title;
	private String book_author_name;
	private String book_summary;
	private String book_images;
	private short book_pages;
	private String book_url;
	
	private Person book_author;
	private Address book_publisher_address;
	private String book_publisher;

	// Contructions method - 2
	public Book() {
		this(Book.BOOKID, Book.BOOKTITLE, Book.BOOKAUTHORNAME, Book.BOOKSUMMARY, Book.BOOKIMAGE, Book.BOOKPAGES,
				Book.BOOKURL);
	}

	public Book(int book_id, String book_title, String book_author_name, String book_summary, String book_images,
			short book_pages, String book_url) {
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_author_name = book_author_name;
		this.book_summary = book_summary;
		this.book_images = book_images;
		this.book_pages = book_pages;
		this.book_url = book_url;
	}

	// getter method - 3
	public int getBookID() {
		return this.book_id;
	}

	public String getBookTitle() {
		return this.book_title;
	}

	public String getBookAuthorName() {
		return this.book_author_name;
	}

	public String getBookSummary() {
		return this.book_summary;
	}

	public String getImages() {
		return this.book_images;
	}

	public short getPages() {
		return this.getPages();
	}

	public String getBookUrl() {
		return this.book_url;
	}

	// setter method -4
	public Book setBookID(int book_id) {
		this.book_id = book_id;
		return this;
	}

	public Book setBookTitle(String book_title) {
		this.book_title = book_title;
		return this;
	}

	public Book setBookAuthorName(String book_author_name) {
		this.book_author_name = book_author_name;
		return this;
	}

	public Book setBookSummary(String book_summary) {
		this.book_summary = book_summary;
		return this;
	}

	public Book setImages(String book_images) {
		this.book_images = book_images;
		return this;
	}

	public Book setPages(short book_pages) {
		this.book_pages = book_pages;
		return this;
	}

	public Book setBookUrl(String book_url) {
		this.book_url = book_url;
		return this;
	}

	// other method - 5
	public String toString() {
		return "Mã sách: " + book_id + "\nTên sách: " + book_title + "\nTác Giả: " + book_author_name
				+ "\nTóm Tắt Cuốn Sách: " + book_summary + "\nSách Hình Ảnh: " + book_images + "\nSố Trang: "
				+ book_pages + "\nUrl sách: " + book_url;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo các lớp đối tượng
		Book  b;
		Book b1 = new Book();
		Book b2 = new Book((int)942003, "Lập Trình Hướng Đối Tượng", "Đại Học Công Nghiệp", "Hướng Dẫn Học OOP bằng ngôn ngữ java", "Có", (short)120, "Không có !" );
		
		//In ra màn hình thông tin
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
