package test2;

public abstract class Category {
	public static final String CATEGORY_NAME = "No Category's Name";
	private  String category_name;

	// Constructor methods
	// Without parameter
	public Category() {
		this(CATEGORY_NAME);
	}

	// With parameters
	public Category(String category_name) {
		this.category_name = category_name;
	}

	public Category(Category Ca) {
		this(Ca.getCategoryName());
	}

	// Getter and Setter methods
	public String getCategoryName() {
		return category_name;
	}

	public void setCategoryName(String category_name) {
		this.category_name = category_name; 
	}

	// Other methods
	public String toString() {
		return "[danh mục sản phẩm=" + category_name + "]";
	}
	public abstract void calculatePrice();
}
