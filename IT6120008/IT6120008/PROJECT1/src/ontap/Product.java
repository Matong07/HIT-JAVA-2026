package ontap;

public abstract class Product {

	// objects
	private short product_id;
	private String product_name;
	private double product_price;
	private String product_total;//Số lượng

	// constructor không tham số
	public Product() {

	}

	// constructor đầy đủ tham số
	public Product(short product_id, String product_name, double product_price, String product_total) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	// getter
	public short getProduct_id() {
		return product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public String getProduct_total() {
		return product_total;
	}

	// setter
	public void setProduct_id(short product_id) {
		this.product_id = product_id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public void setProduct_total(String product_total) {
		this.product_total = product_total;
	}

	@Override
	public String toString() {
		return "Product [pro_id = " + product_id + ", pro_name=" + product_name + ", pro_price= " + product_price
				+ ", pro_total=" + product_total + "]";
	}

	public abstract double findPrice();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
