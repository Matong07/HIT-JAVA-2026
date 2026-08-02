package test2;

import java.util.ArrayList;
import baiktratx1.Category;
import java.util.*;

public class Ceramic_Tile extends Product {
	// Constants
	public static final String CERAMIC_TILE_SPECIALIZED = "No specialized";
	public static final String CATEGORY_NAME = "CERAMIC TILE";
	// Ceramic_Tile properties
	private String ceramicTile_specialized;
	private double ceramicTile_width;
	private double ceramicTile_length;

	// Constructor methods

	// All parameters
	public Ceramic_Tile(String category_name, short product_id, String product_name, short product_price,
			String product_manufacturer, String product_description, String ceramicTile_specialized,
			double ceramicTile_length, double ceramicTile_width) {
		super(Ceramic_Tile.CATEGORY_NAME, product_id, product_name, product_price, product_manufacturer,
				product_description);
		this.ceramicTile_specialized = ceramicTile_specialized;
		this.ceramicTile_length = ceramicTile_length;
		this.ceramicTile_width = ceramicTile_width;
	}

//	// Any parameters
//	public Ceramic_Tile(short product_id) {
//		this(Ceramic_Tile.CATEGORY_NAME, product_id, Ceramic_Tile.PRODUCT_NAME, Ceramic_Tile.PRODUCT_PRICE,
//				Ceramic_Tile.PRODUCT_MANUFACTURER, Ceramic_Tile.PRODUCT_DESCRIPTION,
//				Ceramic_Tile.CERAMIC_TILE_SPECIALIZED);
//	}
//
	public Ceramic_Tile(String product_name) {
		this(Ceramic_Tile.CATEGORY_NAME, Product.PRODUCT_ID, product_name, Ceramic_Tile.PRODUCT_PRICE,
				Ceramic_Tile.PRODUCT_MANUFACTURER, Ceramic_Tile.PRODUCT_DESCRIPTION,
				Ceramic_Tile.CERAMIC_TILE_SPECIALIZED, (double) 0, (double) 0);
	}

//	// Without parameter

	public Ceramic_Tile() {
		this(Ceramic_Tile.CATEGORY_NAME, Ceramic_Tile.PRODUCT_ID, Ceramic_Tile.PRODUCT_NAME, Ceramic_Tile.PRODUCT_PRICE,
				Ceramic_Tile.PRODUCT_MANUFACTURER, Ceramic_Tile.PRODUCT_DESCRIPTION,
				Ceramic_Tile.CERAMIC_TILE_SPECIALIZED, (double) 0, (double) 0);
	}

	// Getter and Setter methods
	public String getCeramicTile_specialized() {
		return ceramicTile_specialized;
	}

	public void setCeramicTile_specialized(String ceramicTile_specialized) {
		this.ceramicTile_specialized = ceramicTile_specialized;
	}

	public double getCeramicTile_width() {
		return ceramicTile_width;
	}

	public double getCeramicTile_length() {
		return ceramicTile_length;
	}

	public void setCeramicTile_width(double ceramicTile_width) {
		this.ceramicTile_width = ceramicTile_width;
	}

	public void setCeramicTile_length(double ceramicTile_length) {
		this.ceramicTile_length = ceramicTile_length;
	}

	@Override
	public String toString() {
		return "Ceramic_Tile [" + super.toString() + "ceramicTile_specialized=" + ceramicTile_specialized
				+ ", ceramicTile_width=" + ceramicTile_width + ", ceramicTile_length=" + ceramicTile_length + "]";
	}

	// Sinh ngẫu nhiên đồ nội thất
	public static Ceramic_Tile[] generateCeramicTile(int n) {
		// Khai báo danh sách đồ nội thất
		Ceramic_Tile[] listCeramicTile = new Ceramic_Tile[n];
		// Danh sách mã sản phẩm
		short[] product_id = { 2001, 2002, 2003, 2004, 2005, 2006 };
		// Danh sách tên sản phẩm
		String[] product_name = { "Gach lat nen", "Gach gia go", "Gach san vuon", "Gach tranh 3D", "Gach trang tri",
				"Gach tham", "Gach mat kinh" };
		// Danh sách giá
		short[] product_price = { 1000, 1500, 2000, 3000, 5000, 7500 };
		// Danh sách nhà sản xuất
		String[] product_manufacturer = { "Dong Tam", "Viglacera", "Bach Ma", "Hoang Ha", "TASA", "Prime", "Inax" };
		// Danh sách mô tả
		String[] product_description = { "Hot sale", "Hang moi", "Noi bat" };
		// Danh sách chuyên dụng
		String[] ceramicTile_specialized = { "Chong bui ban", "Chiu luc", "Premium" };
		// Danh sách chiều rộng
		double[] ceramicTile_width = { 20, 30, 15, 50, 75 };
		// Danh sách chiều dài
		double[] ceramicTile_length = { 20, 30, 15, 50, 75 };
		// Sinh giá trị
		int index;
		for (int i = 0; i < listCeramicTile.length; i++) {
			listCeramicTile[i] = new Ceramic_Tile();
			listCeramicTile[i].setCategoryName(Ceramic_Tile.CATEGORY_NAME);
			// sinh ngẫu nhiên mã sản phẩm
			index = (int) (Math.random() * product_id.length);
			listCeramicTile[i].setProduct_id(product_id[index]);
			// sinh ngẫu nhiên tên sản phẩm
			index = (int) (Math.random() * product_name.length);
			listCeramicTile[i].setProduct_name(product_name[index]);
			// sinh ngẫu nhiên giá
			index = (int) (Math.random() * product_price.length);
			listCeramicTile[i].setProduct_price(product_price[index]);
			// sinh ngẫu nhiên nhà sản xuất
			index = (int) (Math.random() * product_manufacturer.length);
			listCeramicTile[i].setProduct_manufacturer(product_manufacturer[index]);
			// sinh ngẫu nhiên mô tả
			index = (int) (Math.random() * product_description.length);
			listCeramicTile[i].setProduct_description(product_description[index]);
			// sinh ngẫu nhiên chuyên dụng
			index = (int) (Math.random() * ceramicTile_specialized.length);
			listCeramicTile[i].setCeramicTile_specialized(ceramicTile_specialized[index]);
			// sinh ngẫu nhiên chiều rộng
			index = (int) (Math.random() * ceramicTile_width.length);
			listCeramicTile[i].setCeramicTile_width(ceramicTile_width[index]);
			// sinh ngẫu nhiên chiều dài
			index = (int) (Math.random() * ceramicTile_length.length);
			listCeramicTile[i].setCeramicTile_length(ceramicTile_length[index]);
		}
		return listCeramicTile;

	}

	// Print
	public static void printCeramicTile(Ceramic_Tile[] listCeramicTile) {
		for (Ceramic_Tile f : listCeramicTile) {
			System.out.println(f);
		}
	}
	// Sorted by name
		public static void sortByCeramicTileName(Ceramic_Tile[] listCeramicTile) {
			Ceramic_Tile[] temp = new Ceramic_Tile[listCeramicTile.length];
			for (int i = 0; i < listCeramicTile.length - 1; i++) {
				for (int j = i + 1; j < listCeramicTile.length; j++) {
					if (listCeramicTile[i].getProduct_name().compareTo(listCeramicTile[j].getProduct_name()) > 0) {
						temp[i] = listCeramicTile[i];
						listCeramicTile[i] = listCeramicTile[j];
						listCeramicTile[j] = temp[i];

					}
				}
			}
		}

		// Sorted by Manufacturer
		public static void sortByCeramicTileManufacturer(Ceramic_Tile[] listCeramicTile) {
			Ceramic_Tile[] temp = new Ceramic_Tile[listCeramicTile.length];
			for (int i = 0; i < listCeramicTile.length - 1; i++) {
				for (int j = i + 1; j < listCeramicTile.length; j++) {
					if (listCeramicTile[i].getProduct_manufacturer()
							.compareTo(listCeramicTile[j].getProduct_manufacturer()) > 0) {
						temp[i] = listCeramicTile[i];
						listCeramicTile[i] = listCeramicTile[j];
						listCeramicTile[j] = temp[i];

					}
				}
			}
		}

		// Sorted by Price
		public static void sortByCeramicTilePrice(Ceramic_Tile[] listCeramicTile) {
			Ceramic_Tile[] temp = new Ceramic_Tile[listCeramicTile.length];
			for (int i = 0; i < listCeramicTile.length - 1; i++) {
				for (int j = i + 1; j < listCeramicTile.length; j++) {
					if (listCeramicTile[i].getProduct_price() > listCeramicTile[j].getProduct_price()) {
						temp[i] = listCeramicTile[i];
						listCeramicTile[i] = listCeramicTile[j];
						listCeramicTile[j] = temp[i];

					}
				}
			}
		}

		// Search by Name
		public static void searchByCeremicTileName(Ceramic_Tile[] listCeramicTile) {
			// Input name
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ten san pham can tim kiem");
			String name = sc.nextLine();
			// Print fit results
			System.out.println("Cac ket qua: ");
			for (int i = 0; i < listCeramicTile.length; i++) {
				if (name.equals(listCeramicTile[i].getProduct_name()))
					System.out.println(listCeramicTile[i]);
			}
			System.out.println("=====================================================================================");
		}

		// Update a Product
		public static void updateCeramicTile(Ceramic_Tile[] listCeramicTile) {
			// Chọn số thứ tự
			Scanner sc = new Scanner(System.in);

			System.out.print("Cap nhat san pham so: ");
			int n = sc.nextInt();

			// Cập nhật chi tiết
			System.out.println("Nhap ma san pham so " + n + " : ");

			listCeramicTile[n - 1].setProduct_id(sc.nextShort());

			sc.nextLine();
			System.out.println("Nhap ten san pham so " + n + " : ");
			listCeramicTile[n - 1].setProduct_name(sc.nextLine());

			System.out.println("Nhap gia san pham so " + n + " : ");
			listCeramicTile[n - 1].setProduct_price(sc.nextShort());

			sc.nextLine();
			System.out.println("Nhap hang san xuat san pham so " + n + " : ");
			listCeramicTile[n - 1].setProduct_manufacturer(sc.nextLine());

			System.out.println("Nhap mo ta san pham so " + n + " : ");
			listCeramicTile[n - 1].setProduct_description(sc.nextLine());

			System.out.println("Nhap mo ta chuyen dung san pham so " + n + " : ");
			listCeramicTile[n - 1].setCeramicTile_specialized(sc.nextLine());

			System.out.println("Nhap chieu rong san pham so " + n + " : ");
			listCeramicTile[n - 1].setCeramicTile_width(sc.nextDouble());

			System.out.println("Nhap chieu dai san pham so " + n + " : ");
			listCeramicTile[n - 1].setCeramicTile_length(sc.nextDouble());
			// Danh sách sau khi cập nhật
			System.out.println("Danh sach sau khi cap nhat la:");
			printCeramicTile(listCeramicTile);
		}

		// Delete CeramicTile
		public static void deleteCeramicTile(Ceramic_Tile[] listCeramicTile) {
			// Chọn số thứ tự
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap so thu tu san pham can xoa: ");
			int n = sc.nextInt();
			// Xóa 1 sản phẩm
			Ceramic_Tile[] temp = new Ceramic_Tile[listCeramicTile.length - 1];
			// Số chỉ mảng temp
			int tempIndex = 0;
			for (int i = 0; i < listCeramicTile.length; i++) {
				// Bỏ qua sản phẩm cần xóa
				if (i == n - 1)
					continue;
				temp[tempIndex] = new Ceramic_Tile();
				temp[tempIndex] = listCeramicTile[i];
				tempIndex++;
			}
			System.out.println("Danh sach sau khi xoa san pham so " + n + " la:");
			printCeramicTile(temp);
		}

		@Override
		public void calculatePrice() {
			if (getProduct_name() == "Gach lat nen")
				System.out.println("Gia tien " + getProduct_name() + " la: "
						+ this.ceramicTile_width * this.ceramicTile_length * this.getProduct_price() * (double) 2);
			else if (getProduct_name() == "Gach gia go")
				System.out.println("Gia tien " + getProduct_name() + " la: "
						+ this.ceramicTile_width * this.ceramicTile_length * this.getProduct_price() * (double) 3);
			else if (getProduct_name() == "Gach trang tri")
				System.out.println("Gia tien " + getProduct_name() + " la: "
						+ this.ceramicTile_width * this.ceramicTile_length * this.getProduct_price() * (double) 4);
			else if (getProduct_name() == "Gach san vuon")
				System.out.println("Gia tien " + getProduct_name() + " la: "
						+ this.ceramicTile_width * this.ceramicTile_length * this.getProduct_price() * (double) 2);
			else if (getProduct_name() == "Gach tranh 3D")
				System.out.println("Gia tien " + getProduct_name() + " la: "
						+ this.ceramicTile_width * this.ceramicTile_length * this.getProduct_price() * (double) 3);
			else if (getProduct_name() == "Gach tham")
				System.out.println("Gia tien " + getProduct_name() + " la: "
						+ this.ceramicTile_width * this.ceramicTile_length * this.getProduct_price() * (double) 4);
			else if (getProduct_name() == "Gach mat kinh")
				System.out.println("Gia tien " + getProduct_name() + " la: "
						+ this.ceramicTile_width * this.ceramicTile_length * this.getProduct_price() * (double) 2);
		}

		public static void main(String[] args) {
			Ceramic_Tile[] listCeramicTile = Ceramic_Tile.generateCeramicTile(10);
			// System.out.println(listCeramicTile[0].toString());
//			Ceramic_Tile.sortByCeramicTileName(listCeramicTile);
			Ceramic_Tile.sortByCeramicTileManufacturer(listCeramicTile);
//			Ceramic_Tile.sortByCeramicTilePrice(listCeramicTile);
			Ceramic_Tile.printCeramicTile(listCeramicTile);

		}

	}
