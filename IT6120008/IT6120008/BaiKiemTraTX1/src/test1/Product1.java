package test1;

import baiktratx1.Product;

public abstract class Product1 extends Category1 {

	public static final Integer PRO_ID = (Integer)0;
	public static final String PRO_NAME = "No Name";
	public static final String PRO_COST_STRUCTURE = "No cost structure";
	public static final float PRO_IMPORT_PRICE = (float) 0;
	public static final float PRO_PRICE = (float) 0;
	public static final String PRO_PRODUCER = "No Producer";
	public static final String PRO_DETAIL = "No Detail";
	public static final String PRO_DATE_MANUFACTURE = "No Date Manufacture";

	// object's properties

	private Integer pro_id;// Mã Sp
	private String pro_name;// Tên sản phẩm
	private String pro_cost_structure;// Cơ cấu giá thành
	private float pro_import_price;// Giá nhập
	private float pro_price;// Giá bán
	private String pro_producer;// Nhà sản xuất
	private String pro_detail;// Mô tả chi tiết
	private String pro_date_manufacture;// Ngày sản xuất

	public abstract double findPrice();

	public Product1() {
		this(Product1.PRO_ID, Product1.PRO_NAME, Product1.PRO_COST_STRUCTURE, Product1.PRO_IMPORT_PRICE,
				Product1.PRO_PRICE, Product1.PRO_PRODUCER, Product1.PRO_DETAIL, Product1.PRO_DATE_MANUFACTURE);
	}

	public Product1(Integer pro_id, String pro_name, String pro_cost_structure, float pro_import_price, float pro_price,
			String pro_producer, String pro_detail, String pro_date_manufacture) {
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_cost_structure = pro_cost_structure;
		this.pro_import_price = pro_import_price;
		this.pro_price = pro_price;
		this.pro_producer = pro_producer;
		this.pro_detail = pro_detail;
		this.pro_date_manufacture = pro_date_manufacture;
	}

	public Integer getPro_id() {
		return pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public String getPro_cost_structure() {
		return pro_cost_structure;
	}

	public float getPro_import_price() {
		return pro_import_price;
	}

	public float getPro_price() {
		return pro_price;
	}

	public String getPro_producer() {
		return pro_producer;
	}

	public String getPro_detail() {
		return pro_detail;
	}

	public String getPro_date_manufacture() {
		return pro_date_manufacture;
	}

	public void setPro_id(Integer pro_id) {
		this.pro_id = pro_id;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public void setPro_cost_structure(String pro_cost_structure) {
		this.pro_cost_structure = pro_cost_structure;
	}

	public void setPro_import_price(float pro_import_price) {
		this.pro_import_price = pro_import_price;
	}

	public void setPro_price(float pro_price) {
		this.pro_price = pro_price;
	}

	public void setPro_producer(String pro_producer) {
		this.pro_producer = pro_producer;
	}

	public void setPro_detail(String pro_detail) {
		this.pro_detail = pro_detail;
	}

	public void setPro_date_manufacture(String pro_date_manufacture) {
		this.pro_date_manufacture = pro_date_manufacture;
	}

	// Danh mục sản phẩm
	public static Product[] generateProduct(int n) {
		// Khai báo danh sách trung gian
		Product[] listProduct = new Product[n];

		// Khai báo danh mục đồ nội thất gỗ và gạch ốp lát
		String[] category_name = { "Funiture", "Ceramic tiles" };

		// Khai báo mã đồ nội thất
		String[] pro_id = { "F1001", "F1002", "F1003", "F1004", "F1005", "F1006", "F1007", "F1008", "F1009", "F1010",
				"F1011", "F1012", "F1013", "F1014", "F1015", "F1016", "F1017", "F1018", "F1019", "F1020" };
		// Khai báo mã gạch ốp lát
		String[] pro_id1 = { "C1001", "C1002", "C1003", "C1004", "C1005", "C1006", "C1007", "C1008", "C1009", "C1010",
				"C1011", "C1012", "C1013", "C1014", "C1015", "C1016", "C1017", "C1018", "C1019", "C1020" };
		// Khai báo danh sách tên sản phẩm thuộc danh mục đồ gỗ nội thất
		String[] pro_name = { "Bàn Gỗ", "Ghế gỗ", "Cầu thang gỗ", "Cửa gỗ", "Giường gỗ", "Kệ gỗ", "Tủ gỗ", "Sàn gỗ" };
		// Khai báo danh sách tên sản phẩm thuộc danh mục gạch ốp lát
		String[] pro_name1 = { "Gạch Ốp Tường", "Gạch lát Sàn", "Gạch trang trí", "Gạch vân gỗ", "Gạch hoa cương",
				"Gạch vân đá tự nhiên", "Gạch vân đá", "Gạch thiết kế xi măng" };
		// Khai báo giá nhập sản phẩm
		float[] pro_import_price = { 1000000, 1010000, 2001000, 3490000, 2999999, 1999999, 450000, 650000, 1230000,
				175000 };
		// Khai báo giá bán sản phẩm
		float[] pro_price = { 112000, 1999999, 2999999, 3999999, 500000, 600000, 1500000, 670000, 564000, 499999,
				3500000 };
		// Khai báo nhà sản xuất đồ gỗ nội thất
		String pro_producer[] = { "Nội Thất Tùng Anh", "Nội Thất Hoàng Gia", "Nội Thất Châu Âu", "Nội Thất Quang Huy",
				"Nội Thất Đông Á", "Nội Thất Hoàng Anh" };
		// Khai báo nhà sản xuất gạch ốp lát
		String pro_producer1[] = { "Gạch ốp lát Mộc Lan ", "Gạch ốp lát Hoa Đá HOD", "Gạch ốp lát An Cư ACN",
				"Gạch ốp lát Sơn Khuê SOK", "Gạch ốp lát Dan Vi DAV", "Gạch ốp lát Lưu Thủy" };
		// Sinh ngẫu nhiên danh mục sản phẩm
		int index;
		for (int i = 0; i < listProduct.length; i++) {
			// Cấp phát bộ nhớ sinh mảng
			listProduct[i] = new Product();

			// Sinh ngẫu nhiên danh mục sản phẩm
			index = (int) (Math.random() * category_name.length);
			listProduct[i].setCategory_name(category_name[index]);

			// Nếu danh mục là Funiture sinh ngẫu nhiên mã sản phẩm, tên sản phẩm, giá nhập,
			// giá bán, nhà sản xuất của đồ gỗ nội thất

			// Sinh ngẫu nhiên mã sp
			index = (int) (Math.random() * pro_id.length);
			listProduct[i].setPro_id(pro_id[index]);

			// Sinh ngẫu nhiên tên sản phẩm
			index = (int) (Math.random() * pro_name.length);
			listProduct[i].setPro_name(pro_name[index]);

			// Sinh ngẫu nhiên giá nhập sản phẩm
			index = (int) (Math.random() * pro_import_price.length);
			listProduct[i].setPro_import_price(pro_import_price[index]);

			// Sinh ngẫu nhiên giá giá bán sản phẩm
			index = (int) (Math.random() * pro_price.length);
			listProduct[i].setPro_price(pro_price[index]);

			// Sinh ngẫu nhiên Nhà sản xuất
			index = (int) (Math.random() * pro_producer.length);
			listProduct[i].setPro_producer(pro_producer[index]);

			// Sinh ngẫu nhiên mã sản phẩm gạch ốp lát
			index = (int) (Math.random() * pro_id1.length);
			listProduct[i].setPro_id(pro_id1[index]);

			// Sinh ngẫu nhiên tên sản phẩm
			index = (int) (Math.random() * pro_name1.length);
			listProduct[i].setPro_name(pro_name1[index]);

			// Sinh ngẫu nhiên giá nhập sản phẩm
			index = (int) (Math.random() * pro_import_price.length);
			listProduct[i].setPro_import_price(pro_import_price[index]);

			// Sinh ngẫu nhiên giá giá bán sản phẩm
			index = (int) (Math.random() * pro_price.length);
			listProduct[i].setPro_price(pro_price[index]);

			// Sinh ngẫu nhiên Nhà sản xuất
			index = (int) (Math.random() * pro_producer1.length);
			listProduct[i].setPro_producer(pro_producer1[index]);
		}
		return listProduct;
	}

	@Override
	public String toString() {
		return "Product [pro_id=" + pro_id + ", pro_name=" + pro_name + ", pro_cost_structure=" + pro_cost_structure
				+ ", pro_import_price=" + pro_import_price + ", pro_price=" + pro_price + ", pro_producer="
				+ pro_producer + ", pro_detail=" + pro_detail + ", pro_date_manufacture=" + pro_date_manufacture + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
