package baiktratx1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Ma Thế Quyền - MSV: 2021603162
 *
 */
//Lớp Sản Phẩm
public class Product extends Category {

	// Contants
	public static final String PRO_ID = "No ID";
	public static final String PRO_NAME = "No Name";
	public static final String PRO_COST_STRUCTURE = "No cost structure";
	public static final float PRO_IMPORT_PRICE = (float) 0;
	public static final float PRO_PRICE = (float) 0;
	public static final String PRO_PRODUCER = "No Producer";
	public static final String PRO_DETAIL = "No Detail";
	public static final String PRO_DATE_MANUFACTURE = "No Date Manufacture";
	public static final Material PRO_MATERIAL = Material.No_Material;

	// object's properties

	private String pro_id;// Mã Sp
	private String pro_name;// Tên sản phẩm
	private String pro_cost_structure;// Cơ cấu giá thành
	private float pro_import_price;// Giá nhập
	private float pro_price;// Giá bán
	private String pro_producer;// Nhà sản xuất
	private String pro_detail;// Mô tả chi tiết
	private String pro_date_manufacture;// Ngày sản xuất
	private Material pro_material;// Chất liệu

	/*
	 * b, Tạo 4 Phương thức Contructor
	 */
	// Contructor loại 1: Không tham số
	public Product() {

	}

	// Contructor loại 2: đầy đủ tham số
	public Product(String category_name, String pro_id, String pro_name, String pro_cost_structure,
			float pro_import_price, float pro_price, String pro_producer, String pro_detail,
			String pro_date_manufacture, Material pro_material) {
		super(category_name);
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_cost_structure = pro_cost_structure;
		this.pro_import_price = pro_import_price;
		this.pro_price = pro_price;
		this.pro_producer = pro_producer;
		this.pro_detail = pro_detail;
		this.pro_date_manufacture = pro_date_manufacture;
		this.pro_material = pro_material;
	}

	// Contructor 3: Thiếu Mã sản phẩm, tên sản phẩm và mô tả chi tiết
	public Product(String category_name, String pro_cost_structure, float pro_import_price, float pro_price,
			String pro_producer, String pro_date_manufacture, Material pro_material) {
		this(category_name, Product.PRO_ID, Product.PRO_NAME, pro_cost_structure, pro_import_price, pro_price,
				pro_producer, Product.PRO_DETAIL, pro_date_manufacture, pro_material);

	}

	// Contructor 4: Thiếu giá nhập, nhà sản xuất và ngày sản xuất
	public Product(String category_name, String pro_id, String pro_name, String pro_cost_structure, float pro_price,
			String pro_detail, Material pro_material) {
		this(category_name, pro_id, pro_name, pro_cost_structure, Product.PRO_IMPORT_PRICE, pro_price,
				Product.PRO_PRODUCER, pro_detail, Product.PRO_DATE_MANUFACTURE, pro_material);
	}

	// getter

	public String getPro_id() {
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

	public Material getPro_material() {
		return pro_material;
	}

	// Setter

	public void setPro_id(String pro_id) {
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

	public void setPro_material(Material pro_material) {
		this.pro_material = pro_material;
	}

	@Override
	public String toString() {
		return "Product " + super.toString() + "[pro_id=" + pro_id + ", pro_name=" + pro_name + ", pro_cost_structure="
				+ pro_cost_structure + ", pro_import_price=" + pro_import_price + ", pro_price=" + pro_price
				+ ", pro_producer=" + pro_producer + ", pro_detail=" + pro_detail + ", pro_date_manufacture="
				+ pro_date_manufacture + ", pro_material=" + pro_material + "]";
	}

	// Câu c
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
			if (listProduct[i].getCategory_name() == "Funiture") {

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
			} else {
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
		}
		return listProduct;
	}

	/* Câu d: Sắp xếp mảng: Phương thức sắp xếp sản phẩm theo giá tăng dần */
	public static void arrangeProductPrice(Product[] generateProduct) {
		for (int i = 0; i < generateProduct.length; i++) {
			for (int j = i + 1; j < generateProduct.length; j++) {
				if (generateProduct[i].getPro_price() > generateProduct[j].getPro_price()) {
					Product swap = generateProduct[i];
					generateProduct[i] = generateProduct[j];
					generateProduct[j] = swap;
				}
			}
		}
	}

	// d: Tìm kiếm một phần tử trong mảng
	// Tìm xem tên sản phẩm có trong mảng hay không
	public static int findName(Product[] generateProduct, String NameInput) {
		int Index = generateProduct.length + 1;
		for (int i = 0; i < generateProduct.length; i++) {
			// Upcase lên giúp dễ so sánh
			String ProductName = generateProduct[i].getPro_name().toUpperCase();
			String StringInput = NameInput.toUpperCase();
			// Tìm xem trong mảng có tên cần tìm không , nếu không trả về -1
			Index = ProductName.indexOf(StringInput);
			if (Index == -1) {
				continue;
			} else {
				Index = 1;
				break;
			}
		}
		if (Index == generateProduct.length + 1) {
			return -1;
		} else {
			return Index;
		}
	}

	// Thông báo ra mang hình là mảng có sản phẩm đó hay không
	public static Product checkNameFound(Product[] generateProduct, int Index) {
		if (Index == -1) {
			System.out.println("Sản Phẩm này hiện không có !");
		}else {
		return generateProduct[Index];
		}
		return null;
	}

	// d: Cập nhật một sản phẩm
	public static void UpdateProduct(Product[] generateProduct, float price, String producer) {
		// Sinh ngẫu nhiên vị trí cập nhật sản phẩm
		int index = (int) (Math.random() * generateProduct.length);
		System.out.print("Nhập danh sách cập nhật của sản phẩm: ");
		// Sử dụng setter để cập nhật các thuộc tính
		generateProduct[index].setPro_price(price);
		generateProduct[index].setPro_producer(producer);
	}

	// d: xóa một sản phẩm
	// Dùng hàm có sẵn của của java để xóa
	public static void deleteProduct(Product[] generateProduct) {
		// Sinh ngẫu nhiên vị trí sản phẩm cần xóa
		int index = (int) (Math.random() * generateProduct.length);
		// Chuyển đổi mảng qua dạng danh sách
		List<Product> list = new ArrayList<Product>(Arrays.asList(generateProduct));
		// Xóa phần tử có index = index trong mảng và xóa ô nhớ của phần tử đó
		list.remove(index);
		// Biến trở lại qua mảng
		generateProduct = list.toArray(generateProduct);
		// In mảng
		System.out.println("Danh mục sau khi xóa sản phẩm : ");
		for (int i = 0; i < generateProduct.length - 1; i++) {
			System.out.println(generateProduct[i]);
		}

	}

	// Câu e
	// Phương thức để in danh sách sản phẩm ra màn hình
	public static void printProduct(Product[] listProduct) {
		for (Product c : listProduct) {
			System.out.println(c);
		}
	}

	// Phương thức để in số lượng thống kê trong từng danh mục ra màn hình
	public static void NumberOfStatistic(Product[] generateProduct) {
		// Tạo biến lưu giá trị tổng số tiền bán và Số lượng sản phẩm theo từng danh mục
		float TotalPriceFuniture = 0;
		float TotalPriceCernamicTiles = 0;
		// Biến để đếm mỗi danh mục có bao nhiêu sản phẩm
		int coutFuniture = 0;
		int coutCernamicTiles = 0;
		// Dùng vòng for để duyệt mảng
		for (int i = 0; i < generateProduct.length; i++) {
			if (generateProduct[i].getCategory_name() == "Funiture") {
				TotalPriceFuniture += generateProduct[i].getPro_price();
				coutFuniture++;
			} else {
				TotalPriceCernamicTiles += generateProduct[i].getPro_price();
				coutCernamicTiles++;
			}
		}
		// In số lượng thống kê theo từng danh mục
		System.out.println("Funiture: Tổng số lượng sản phẩm là : " + coutFuniture + "\n Tổng số tiền bán : "
				+ TotalPriceFuniture + "VNĐ");
		System.out.println("Crenamic: Tổng số lượng sản phẩm là : " + coutCernamicTiles + "\n Tổng số tiền bán : "
				+ TotalPriceCernamicTiles + "VNĐ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sinh ngẫu nhiên sản phẩm
		Product[] listProduct = Product.generateProduct(10);
		Scanner input = new Scanner(System.in);
		// Câu C: In danh sách
		Product.printProduct(listProduct);
		/*
		 * Câu d: In ra danh sách sắp xếp theo giá tăng dần
		 */
		System.out.println("Mời bạn nhập tên sản phẩm muốn tra cứu: ");
		String Srearching = input.next();

		// Tìm kiếm một sản phẩm
		System.out.println("Danh sách theo thứ tự giá tăng dần (PP): ");
		Product.arrangeProductPrice(listProduct);

		// In ra sản phẩm cần tìm
		System.out.println(Product.checkNameFound(listProduct, Product.findName(listProduct, Srearching)));
		/*
		 * Câu e: // In ra màn hình Danh sách sản phẩm
		 */
		Product.printProduct(listProduct);
		// In ra số lượng thống kê trong từng danh mục sản phẩm*/
		System.out.println();
		Product.NumberOfStatistic(listProduct);

		// Gọi phương thức xóa 1 phần tử trong mảng
		Product.deleteProduct(listProduct);
	}

}

//enum chứa chất liệu
enum Material {
	No_Material, Oval_Wood, Brich_Wood, Oak_Wood, Forest_Wood, Porcelain_Ceramic,
};