package test1;

public class Interior extends Product1 {

	private Furniture inter_fur;
	private short inter_number;
	private String inter_price_notes;

	public Interior() {

	}

	public Interior(Integer pro_id, String pro_name, String pro_cost_structure, float pro_import_price, float pro_price,
			String pro_producer, String pro_detail, String pro_date_manufacture, Furniture inter_fur,
			short inter_number, String inter_price_notes) {
		super(pro_id, pro_name, pro_cost_structure, pro_import_price, pro_price, pro_producer, pro_detail,
				pro_date_manufacture);
		this.inter_fur = inter_fur;
		this.inter_number = inter_number;
		this.inter_price_notes = inter_price_notes;
	}

	public Furniture getInter_fur() {
		return inter_fur;
	}

	public short getInter_number() {
		return inter_number;
	}

	public String getInter_price_notes() {
		return inter_price_notes;
	}

	public void setInter_fur(Furniture inter_fur) {
		this.inter_fur = inter_fur;
	}

	public void setInter_number(short inter_number) {
		this.inter_number = inter_number;
	}

	public void setInter_price_notes(String inter_price_notes) {
		this.inter_price_notes = inter_price_notes;
	}

	@Override
	public String toString() {
		return "Interior [" + super.toString() + "- IF = " + inter_fur + ", IN = " + inter_number + ", IP = "
				+ inter_price_notes + "]";
	}

	@Override
	public double findPrice() {
		// TODO Auto-generated method stub

		double price = 0;
		int index_fur = (int) (Math.random() * Furniture.values().length);
		this.inter_fur = Furniture.values()[index_fur];

		switch (this.inter_fur) {
		case TABLE_EAT_4:
			price = this.inter_number * getPro_price();
			break;
		case TABLE_EAT_6:
			price = this.inter_number * getPro_price() * 1.2;
			break;
		case TABLE_EAT_8:
			price = this.inter_number * getPro_price() * 1.5;
			break;
		case SOFA_L_4:
			price = this.inter_number * getPro_price();
			break;
		case SOFA_L_6:
			price = this.inter_number * getPro_price() * 1.8;
			break;
		case SOFA_L_8:
			price = this.inter_number * getPro_price() * 2;
			break;
		}

		return price;
	}

}
