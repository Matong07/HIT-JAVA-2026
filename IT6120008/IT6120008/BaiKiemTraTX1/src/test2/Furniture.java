package test2;
 import java.util.*;
public class Furniture extends Product {
	// Constants
	public static final String FURNITURE_SPECIALIZED = "No specialized";
	public static final String CATEGORY_NAME = "FURNITURE";
	// Furniture properties
	private String furniture_specialized;

	// Constructor methods

	// All parameters
	public Furniture(String category_name, short product_id, String product_name, short product_price,
			String product_manufacturer, String product_description, String furniture_specialized) {
		super(Furniture.CATEGORY_NAME, product_id, product_name, product_price, product_manufacturer,
				product_description);
		this.furniture_specialized = furniture_specialized;
	}

	// Any parameters
	public Furniture(short product_id) {
		this(Furniture.CATEGORY_NAME, product_id, Furniture.PRODUCT_NAME, Furniture.PRODUCT_PRICE,
				Furniture.PRODUCT_MANUFACTURER, Furniture.PRODUCT_DESCRIPTION, Furniture.FURNITURE_SPECIALIZED);
	}

	public Furniture(String product_name) {
		this(Furniture.CATEGORY_NAME, Product.PRODUCT_ID, product_name, Furniture.PRODUCT_PRICE,
				Furniture.PRODUCT_MANUFACTURER, Furniture.PRODUCT_DESCRIPTION, Furniture.FURNITURE_SPECIALIZED);
	}

	// Without parameter

	public Furniture() {
		this(Furniture.CATEGORY_NAME, Furniture.PRODUCT_ID, Furniture.PRODUCT_NAME, Furniture.PRODUCT_PRICE,
				Furniture.PRODUCT_MANUFACTURER, Furniture.PRODUCT_DESCRIPTION, Furniture.FURNITURE_SPECIALIZED);
	}

	// Getter and Setter methods
	public String getFurniture_specialized() {
		return furniture_specialized;
	}

	public void setFurniture_specialized(String furniture_specialized) {
		this.furniture_specialized = furniture_specialized;
	}

	// Other methods
	@Override // toString()
	public String toString() {
		return "Category: " + CATEGORY_NAME + " " + super.toString() + "\tChuyen dung: " + furniture_specialized;
	}

	@Override // equals()
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furniture other = (Furniture) obj;
		return Object.equals(furniture_specialized, other.furniture_specialized);
	}

	// Sinh ngẫu nhiên đồ nội thất
	public static Furniture[] generateFuniture(int n) {
		// Khai báo danh sách đồ nội thất
		Furniture[] listFurniture = new Furniture[n];
		// Danh sách tên sản phẩm
		String[] product_name = { "Ban an", "Ban hoc", "Ghe dai", "Tu", "Ghe don", "Ban hop", "Giuong", "Ban tho",
				"Tu chen" };
		// Danh sách giá
		short[] product_price = { 1000, 1500, 2000, 3000, 5000, 7500 };
		// Danh sách nhà sản xuất
		String[] product_manufacturer = { "Kangaroo", "Supor", "FBC", "Viet Nhat", "Sunhouse", "Lock&Lock" };
		// Danh sách mô tả
		String[] product_description = { "Hot sale", "Hang moi", "Noi bat" };
		// Danh sách chuyên dụng
		String[] furniture_specialized = { "Nha bep", "Phong khach", "Phong ngu" };
		// Sinh giá trị
		int index;
		for (int i = 0; i < listFurniture.length; i++) {
			listFurniture[i] = new Furniture();
			listFurniture[i].setCategoryName(Furniture.CATEGORY_NAME);
			// sinh ngẫu nhiên mã sản phẩm
			index = (int) (Math.random() * 1001);
			listFurniture[i].setProduct_id((short) index);
			// sinh ngẫu nhiên tên sản phẩm
			index = (int) (Math.random() * product_name.length);
			listFurniture[i].setProduct_name(product_name[index]);
			// sinh ngẫu nhiên giá
			index = (int) (Math.random() * product_price.length);
			listFurniture[i].setProduct_price(product_price[index]);
			// sinh ngẫu nhiên nhà sản xuất
			index = (int) (Math.random() * product_manufacturer.length);
			listFurniture[i].setProduct_manufacturer(product_manufacturer[index]);
			// sinh ngẫu nhiên mô tả
			index = (int) (Math.random() * product_description.length);
			listFurniture[i].setProduct_description(product_description[index]);
			// sinh ngẫu nhiên chuyên dụng
			index = (int) (Math.random() * furniture_specialized.length);
			listFurniture[i].setFurniture_specialized(furniture_specialized[index]);
		}
		return listFurniture;

	}

	// Print
	public static void printFurniture(Furniture[] listFurniture) {
		for (Furniture f : listFurniture) {
			System.out.println(f);
		}
	}

	// Sorted by name
	public static void sortByFurnitureName(Furniture[] listFurniture) {
		Furniture[] temp = new Furniture[listFurniture.length];
		for (int i = 0; i < listFurniture.length - 1; i++) {
			for (int j = i + 1; j < listFurniture.length; j++) {
				if (listFurniture[i].getProduct_name().compareTo(listFurniture[j].getProduct_name()) > 0) {
					temp[i] = listFurniture[i];
					listFurniture[i] = listFurniture[j];
					listFurniture[j] = temp[i];

				}
			}
		}
		printFurniture(listFurniture);
	}

	// Sorted by Manufacturer
	public static void sortByFurnitureManufacturer(Furniture[] listFurniture) {
		Furniture[] temp = new Furniture[listFurniture.length];
		for (int i = 0; i < listFurniture.length - 1; i++) {
			for (int j = i + 1; j < listFurniture.length; j++) {
				if (listFurniture[i].getProduct_manufacturer()
						.compareTo(listFurniture[j].getProduct_manufacturer()) > 0) {
					temp[i] = listFurniture[i];
					listFurniture[i] = listFurniture[j];
					listFurniture[j] = temp[i];

				}
			}
		}
		printFurniture(listFurniture);
	}

	// Sorted by Price
	public static void sortByFurniturePrice(Furniture[] listFurniture) {
		Furniture[] temp = new Furniture[listFurniture.length];
		for (int i = 0; i < listFurniture.length - 1; i++) {
			for (int j = i + 1; j < listFurniture.length; j++) {
				if (listFurniture[i].getProduct_price() > listFurniture[j].getProduct_price()) {
					temp[i] = listFurniture[i];
					listFurniture[i] = listFurniture[j];
					listFurniture[j] = temp[i];

				}
			}
		}
		printFurniture(listFurniture);
	}

	// Search by Name
	public static void searchByFurnitureName(Furniture[] listFurniture) {
		// Input name
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten san pham can tim kiem");
		String name = sc.nextLine();
		// Print fit results
		System.out.println("Cac ket qua: ");
		for (int i = 0; i < listFurniture.length; i++) {
			if (name.equals(listFurniture[i].getProduct_name()))
				System.out.println(listFurniture[i]);
		}
		System.out.println("=====================================================================================");
	}

	// Update a Product
	public static void updateFurniture(Furniture[] listFurniture) {
		// Chọn số thứ tự
		Scanner sc = new Scanner(System.in);
		System.out.print("Cap nhat san pham so: ");
		int n = sc.nextInt();
		// Cập nhật chi tiết
		System.out.print("Nhap ma san pham so " + n + " : ");
		
	
		listFurniture[n - 1].setProduct_id(sc.nextShort());

		sc.nextLine();
		System.out.print("Nhap ten san pham so " + n + " : ");
		listFurniture[n - 1].setProduct_name(sc.nextLine());

		System.out.print("Nhap gia san pham so " + n + " : ");
		listFurniture[n - 1].setProduct_price(sc.nextShort());

		sc.nextLine();
		System.out.print("Nhap hang san xuat san pham so " + n + " : ");
		listFurniture[n - 1].setProduct_manufacturer(sc.nextLine());

		System.out.print("Nhap mo ta san pham so " + n + " : ");
		listFurniture[n - 1].setProduct_description(sc.nextLine());

		System.out.print("Nhap mo ta chuyen dung san pham so " + n + " : ");
		listFurniture[n - 1].setFurniture_specialized(sc.nextLine());

		// Danh sách sau khi cập nhật
		System.out.println("Danh sach sau khi cap nhat la:");
		printFurniture(listFurniture);
	}

	// Delete Furniture
	public static void deleteFurniture(Furniture[] listFurniture) {
		// Chọn số thứ tự
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so thu tu san pham can xoa: ");
		int n = sc.nextInt();
		// Xóa 1 sản phẩm
		Furniture[] temp = new Furniture[listFurniture.length-1];
		// Số chỉ mảng temp
		int tempIndex=0;
		for(int i=0; i<listFurniture.length; i++) {
			//Bỏ qua sản phẩm cần xóa
			if(i==n-1) 
				continue;
			temp[tempIndex] = new Furniture();
			temp[tempIndex]=listFurniture[i];
			tempIndex++;
		}System.out.println("Danh sach sau khi xoa san pham so "+n+" la:");
		printFurniture(temp);
		
//		for (int i = n-1; i < listFurniture.length-1; i++) {
//			listFurniture[i].setProduct_id(listFurniture[i+1].getProduct_id());
//			listFurniture[i].setProduct_name(listFurniture[i+1].getProduct_name());
//			listFurniture[i].setProduct_price(listFurniture[i+1].getProduct_price());
//			listFurniture[i].setProduct_manufacturer(listFurniture[i+1].getProduct_manufacturer());
//			listFurniture[i].setProduct_description(listFurniture[i+1].getProduct_description());
//			listFurniture[i].setFurniture_specialized(listFurniture[i+1].getFurniture_specialized());
//		}
//		listFurniture[listFurniture.length-1] = null;
//		printFurniture(listFurniture);
	}

	@Override
//	"Hot sale", "Hang moi", "Noi bat"
		public void calculatePrice() {
			if(getProduct_description() == "Hot sale") 
				System.out.println("Gia tien cua "+this.getProduct_name() + " la: " + getProduct_price() * (short)20);
			else if (getProduct_description() == "Hang moi")
				System.out.println("Gia tien cua "+this.getProduct_name() + " la: " + getProduct_price() * (short)30);
			else if (getProduct_description() == "Noi bat")
				System.out.println("Gia tien cua "+this.getProduct_name() + " la: " + getProduct_price() * (short)50);
			
	}
	
	public static void main(String[] args) {
		Furniture[] listFurniture = Furniture.generateFuniture(10);
		System.out.println(listFurniture[0].toString());
//		Furniture.sortByFurnitureName(listFurniture);
//		Furniture.sortByFurnitureManufacturer(listFurniture);
//		Furniture.sortByFurniturePrice(listFurniture);
		// Furniture.printFurniture(listFurniture);

	}

	
}
