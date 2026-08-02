package ontap;

public class Ceramic_tiles extends Product {

	// objects
	private int ceramic_number;
	private double ceramic_price_notes;
	private TILES_SIZE ceramic_size;

	public Ceramic_tiles() {

	}

	public Ceramic_tiles(short product_id, String product_name, double product_price, String product_total,
			int ceramic_number, double ceramic_price_notes, TILES_SIZE ceramic_size) {
		super(product_id, product_name, product_price, product_total);
		this.ceramic_number = ceramic_number;
		this.ceramic_price_notes = ceramic_price_notes;
		this.ceramic_size = ceramic_size;
	}

	public int getCeramic_number() {
		return ceramic_number;
	}

	public double getCeramic_price_notes() {
		return ceramic_price_notes;
	}

	public TILES_SIZE getCeramic_size() {
		return ceramic_size;
	}

	public void setCeramic_number(int ceramic_number) {
		this.ceramic_number = ceramic_number;
	}

	public void setCeramic_price_notes(double ceramic_price_notes) {
		this.ceramic_price_notes = ceramic_price_notes;
	}

	public void setCeramic_size(TILES_SIZE ceramic_size) {
		this.ceramic_size = ceramic_size;
	}

	@Override
	public String toString() {
		return super.toString() + "[ceramic_number=" + ceramic_number + ", ceramic_price_notes=" + ceramic_price_notes
				+ ", ceramic_size=" + ceramic_size + "]";
	}

	@Override
	public double findPrice() {
		// TODO Auto-generated method stub
		int index_size = (int) (Math.random() * TILES_SIZE.values().length);
		this.ceramic_size = TILES_SIZE.values()[index_size];

		double price = 0;
		switch (ceramic_size) {

		case S300x300:
			price = this.ceramic_number * ((this.getProduct_price() * 1.5) * this.ceramic_price_notes);
			break;
		case S400x400:
			price = this.ceramic_number * ((this.getProduct_price() * 1.5) * this.ceramic_price_notes);
			break;
		case S500x500:
			price = this.ceramic_number * ((this.getProduct_price() * 1.5) * this.ceramic_price_notes);
			break;
		case S600x600:
			price = this.ceramic_number * ((this.getProduct_price() * 1.5) * this.ceramic_price_notes);
			break;
		case S700x700:
			price = this.ceramic_number * ((this.getProduct_price() * 1.5) * this.ceramic_price_notes);
			break;
		case S800x800:
			price = this.ceramic_number * ((this.getProduct_price() * 1.5) * this.ceramic_price_notes);
			break;
		default:
			break;
		}
		return price;
	}

}

enum TILES_SIZE {
	S300x300, S400x400, S500x500, S600x600, S700x700, S800x800
}
