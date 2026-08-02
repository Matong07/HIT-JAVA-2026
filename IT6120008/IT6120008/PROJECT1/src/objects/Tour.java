package objects;

public class Tour {

	// contants - 1
	public static final short TOURID = (short) 0;
	public static final String TOURINTRO = "No intro";
	public static final String TOURSUMMARY = "No summary";
	public static final String TOURDETAIL = "No detail";
	public static final String TOURSTARTDATE = "No date";
	public static final String TOURENDDATE = "No date";
	public static final Address TOURSOURCE = new Address();
	public static final Address TOURDESTINATION = new Address();
	public static final double TOURPRICE = (double) 0;
	public static final double TOURDISCOUNTPRICE = (double) 0;
	public static final Hotel HOTEL = Hotel.NOSTAR;
	public static final String TOURNOTES = "No notes";
	public static final Transport TRANSPORT = Transport.NO_TRANSPORT;

	// object's properties - 0
	private short tour_id;// Mã Tuor
	private String tour_intro;// Giới thiệu về tour
	private String tour_summary;// Tóm tắt
	private String tour_detail;// Chi tiết
	private String tour_start_date;// Ngày bắt đầu
	private String tour_end_date;// Ngày kết thúc
//	private ArrayList<String> tour_image;
//	private boolean tour_is_bound;
	private Address tour_source;// Nguồn du lịch
	private Address tour_destination;// Điểm đến
//	private ArrayList<String> tour_list_persons;//Danh sách người
	private double tour_price;// Giá cả
	private double tour_discount_price;// Giá khuyến mãi
	private Hotel tour_hotel;// Chỗ ở
	private String tour_notes;// Ghi chú
	private Transport tour_transport;// Phương tiện di chuyển

	// contructor - 2
	public Tour() {
		this(Tour.TOURID, Tour.TOURINTRO, Tour.TOURSUMMARY, Tour.TOURDETAIL, Tour.TOURSTARTDATE, Tour.TOURENDDATE,
				Tour.TOURSOURCE, Tour.TOURDESTINATION, Tour.TOURPRICE, Tour.TOURDISCOUNTPRICE, Tour.HOTEL,
				Tour.TOURNOTES, Tour.TRANSPORT);
	}

	public Tour(short tour_id, String tour_intro, String tour_summary, String tour_detail, String tour_start_date,
			String tour_end_date, Address tour_source, Address tour_destination, double tour_price,
			double tour_discount_price, Hotel tour_hotel, String tour_notes, Transport tour_transport) {
		this.tour_id = tour_id;
		this.tour_intro = tour_intro;
		this.tour_summary = tour_summary;
		this.tour_detail = tour_detail;
		this.tour_start_date = tour_start_date;
		this.tour_end_date = tour_end_date;
		this.tour_source = tour_source;
		this.tour_destination = tour_destination;
		this.tour_price = tour_price;
		this.tour_discount_price = tour_discount_price;
		this.tour_hotel = tour_hotel;
		this.tour_notes = tour_notes;
		this.tour_transport = tour_transport;
	}

	// getter method - 3

	public short getTOURID() {
		return this.tour_id;
	}

	public String getTOURINTRO() {
		return this.tour_intro;
	}

	public String getTOURSUMMARY() {
		return this.tour_summary;
	}

	public String getTOURDETAIL() {
		return this.tour_detail;
	}

	public String getTOURSTARTDATE() {
		return this.tour_start_date;
	}

	public String getTOURENDDATE() {
		return this.tour_end_date;
	}

	public Address getTOURSOURCE() {
		return this.tour_source;
	}

	public Address getTOURDESTINATION() {
		return this.tour_destination;
	}

	public double getTOURPRICE() {
		return this.tour_price;
	}

	public double getTOURDISCOUNTPRICE() {
		return this.tour_discount_price;
	}

	public Hotel getTOURHOTEL() {
		return this.tour_hotel;
	}

	public String getTOURNOTES() {
		return this.tour_notes;
	}

	public Transport getTOURTRANSPORT() {
		return this.tour_transport;
	}

	// setter method - 4

	public Tour setTOURID(short tour_id) {
		this.tour_id = tour_id;
		return this;
	}

	public Tour setTOURINTRO(String tour_intro) {
		this.tour_intro = tour_intro;
		return this;
	}

	public Tour setTOURSUMMARY(String tour_summary) {
		this.tour_summary = tour_summary;
		return this;
	}

	public Tour setTOURDETAIL(String tour_detail) {
		this.tour_detail = tour_detail;
		return this;
	}

	public Tour setTOURSTARTDATE(String tour_start_date) {
		this.tour_start_date = tour_start_date;
		return this;
	}

	public Tour setTOURENDDATE(String tour_end_date) {
		this.tour_end_date = tour_end_date;
		return this;
	}

	public Tour setTOURSOURCE(Address tour_source) {
		this.tour_source = tour_source;
		return this;
	}

	public Tour setTOURDESTINATION(Address tour_destination) {
		this.tour_destination = tour_destination;
		return this;
	}

	public Tour setTOURPRICE(double tour_price) {
		this.tour_price = tour_price;
		return this;
	}

	public Tour setTOURDISCOUNTPRICE(double tour_discount_price) {
		this.tour_discount_price = tour_discount_price;
		return this;
	}

	public Tour setTOURHOTEL(Hotel tour_hotel) {
		this.tour_hotel = tour_hotel;
		return this;
	}

	public Tour setTOURNOTES(String tour_notes) {
		this.tour_notes = tour_notes;
		return this;
	}

	public Tour setTOURTRANSPORT(Transport tour_transport) {
		this.tour_transport = tour_transport;
		return this;
	}

	// other method - 5
	public String toString() {
		return "Thông tin về chuyến du lịch: \n1. Mã tour : " + tour_id + "\n2. Giới thiệu về tour : " + tour_intro
				+ "\n3. Tóm tắt về chuyến đi : " + tour_summary + "\n4. Chi tiết : " + tour_detail
				+ "\n5. Ngày bắt đầu : " + tour_start_date + "\n6. Ngày kết thúc" + tour_end_date
				+ "\n7. Nguồn du lịch : " + tour_source + "\n8. Điểm đến : " + tour_destination + "\n9. Giá cả : "
				+ tour_price + "VNĐ" + "\10. Giá khuyến mãi " + tour_discount_price + "VNĐ" + "\n11. Chỗ ở : "
				+ tour_hotel + "\n12. Ghi chú : " + tour_notes + "\n13. Phương tiện di chuyển : " + tour_transport;
	}

	public static void main(String[] args) {

		//Khởi tạo giá trị
		
		
	}
}

enum Hotel {
	NOSTAR, ONESTAR, TWOSTAR, THREESTAR, FOURSTAR, FIVESTAR
}

enum Transport {
	NO_TRANSPORT, CAR, PLANT, TRAIN, SHIPS, METRO

}
