package inter;

//Lớp trừu tượng có thể cài đặt interface nhưng interface k thể cài lớp trừu tượng
public class Mobile implements Product {

	private short mobile_id;
	private String mobile_name;
	private String mobile_summary;
	private String mobile_detail;
	private double mobile_price;

	@Override
	public double getPrice(int id) {
		// TODO Auto-generated method stub
		if (this.mobile_id == id) {
			return this.mobile_price;
		} else {
			return 0;
		}
	}

	@Override
	public String getIntro(int id) {
		// TODO Auto-generated method stub
		if (this.mobile_id == id) {
			return this.mobile_name + " " + this.mobile_summary;
		} else {
			return "---";
		}
	}

	@Override
	public String getDetail(int id) {
		// TODO Auto-generated method stub
		if(this.mobile_id == id) {
			String detail = "ID: "+this.mobile_id;
			detail +="\nName: "+this.mobile_name;
			detail +="\nSummary: "+this.mobile_summary;
			detail +="\nDetail: "+this.mobile_detail;
			detail +="\nPrice: "+this.mobile_price;
			
			return detail; 
		}
		return "---";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
