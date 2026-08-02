package ktratx2;

/**
 * 
 * @author Ma Thế Quyền - MSV: 2021603162
 *
 */
public class Product {

	// contant's
	public static final short PRODUCT_ID = (short) 0;
	public static final String PRODUCT_NAME = "No product name";
	public static final double PRODUCT_PRICE = (double) 0;
	public static final int PRODUCT_TOTAL = (int) 0;

	// object's

	public short product_id;// Mã sản phẩm.
	public String product_name;// Tên sản phẩm.
	public double product_price;// Giá sản phẩm.
	public int product_total;// Số lượng sản phẩm.

	// Constructor: không tham số.
	public Product() {

	}

	// Constructor: Đầy đủ tham số
	public Product(short product_id, String product_name, double product_price, int product_total) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	// Getter

	public short getProduct_id() {
		return product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public int getProduct_total() {
		return product_total;
	}

	// Setter

	public void setProduct_id(short product_id) {
		this.product_id = product_id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public void setProduct_total(int product_total) {
		this.product_total = product_total;
	}

	// Other method

	@Override
	public String toString() {
		return "Product [ pro_id = " + product_id + ", pro_name = " + product_name + ", pro_price = " + product_price
				+ "$" + ", pro_total = " + product_total + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
