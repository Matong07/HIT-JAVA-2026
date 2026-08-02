package jse;

public class Address {
	// Constants - 1
	public static final String CITYNAME = "No CityName";
	public static final String DISTRICTNAME = "No DistrictName";
	public static final String STREETNAME = "No StreetName";

	private static int count = 0;
	// object's properties - 0
	private String cityName;
	private String districtName;
	private String streetName;

	// Constructor method - 2

	public Address() {
		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
	}

	public Address(String cityName) {
		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
	}

	public Address(String cityName, String districtName) {
		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
	}

	public Address(String cityName, String districtName, String streetName) {
		this.cityName = cityName;
		this.districtName = districtName;
		this.streetName = streetName;
	}

	// đặc biệt loại 3
	public Address(Address addr) {
		this(addr.getCityName(), addr.getStreetName());
	}

	// Getter methods - 3

	public String getCityName() {
		return this.cityName;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public String getStreetName() {
		return this.streetName;
	}
	// Setter methods - 4

	public Address setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	public Address setDistrictName(String districtName) {
		this.districtName = districtName;
		return this;
	}

	public Address setStreetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	// Other methods - 5
	public String toString() {
		return this.cityName + ", " + this.districtName + ", " + this.streetName;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khởi tạo các lớp đối tượng
		Address d;
		Address d1 = new Address();
		Address d2 = new Address("Tuyên Quang", "Chiêm Hóa", "Tri Phú");

		// In thông tin
		System.out.println(d2);

	}

}
