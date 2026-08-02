package test2;

public abstract class Product extends Category {
	// Constants
	public static final short PRODUCT_ID = 0;
	public static final String PRODUCT_NAME = "No product name";
	public static final short PRODUCT_PRICE = 0;
	public static final String PRODUCT_MANUFACTURER = "No product manufacturer";
	public static final String PRODUCT_DESCRIPTION = "No description";

	// Object's properties
	private short product_id;
	private String product_name;
	private short product_price;
	private String product_manufacturer;
	private String product_description;

	// Constructor methods
	// Without parameter
	public Product() {
		this(Product.CATEGORY_NAME, Product.PRODUCT_ID, Product.PRODUCT_NAME, Product.PRODUCT_PRICE,
				Product.PRODUCT_MANUFACTURER, Product.PRODUCT_DESCRIPTION);
	}

	// Any parameters
	public Product(short product_id) {
		this(Product.CATEGORY_NAME, product_id, Product.PRODUCT_NAME, Product.PRODUCT_PRICE,
				Product.PRODUCT_MANUFACTURER, Product.PRODUCT_DESCRIPTION);
	}

	public Product(String product_name) {
		this(Product.CATEGORY_NAME, Product.PRODUCT_ID, product_name, Product.PRODUCT_PRICE,
				Product.PRODUCT_MANUFACTURER, Product.PRODUCT_DESCRIPTION);
	}

	// All parameters
	public Product(String category_name, short product_id, String product_name, short product_Price,
			String product_manufacturer, String product_description) {
		super(category_name);
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_Price;
		this.product_manufacturer = product_manufacturer;
		this.product_description = product_description;
	}

	public Product(Product Produce) {
		this(Produce.getCategoryName(), Produce.getProduct_id(), Produce.getProduct_name(), Produce.getProduct_price(),
				Produce.getProduct_manufacturer(), Produce.getProduct_description());
	}
	// Getter and setter method

	public short getProduct_id() {
		return product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public short getProduct_price() {
		return product_price;
	}

	public String getProduct_manufacturer() {
		return product_manufacturer;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_id(short product_id) {
		this.product_id = product_id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_price(short product_price) {
		this.product_price = product_price;
	}

	public void setProduct_manufacturer(String product_manufacturer) {
		this.product_manufacturer = product_manufacturer;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	// Other methods
	@Override
	public String toString() {
		return "Product_id=" + product_id + "\t Product_name=" + product_name + "\t Product_price=" + product_price
				+ "\t Product_manufacturer=" + product_manufacturer + "\t Product_description=" + product_description;
	}

}
