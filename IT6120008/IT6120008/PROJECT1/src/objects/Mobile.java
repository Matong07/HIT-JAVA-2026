package objects;

public class Mobile {

	// object's properties - 1

	private short mobile_id;
	private byte mobile_tech_id;// Công nghệ màn hình
	private byte mobile_resolution_id;// Độ phân giải
	private byte mobile_wide_id; // Màn hình rộng
	private String mobile_max_light;// Độ sáng màn hình
	private String mobile_screen;// Mặt kính cảm ứng

//	public Mobile() {
//		this(Mobile.mobile_id, Mobile.mobile_tech_id, Mobile.mobile_resolution_id, Mobile.mobile_wide_id, Mobile.mobile_max_light, Mobile.mobile_screen);
	//}
	public Mobile(short mobile_id, byte mobile_tech_id, byte mobile_resolution_id, byte mobile_wide_id,
			String mobile_max_light, String mobile_screen) {
		this.mobile_id = mobile_id;
		this.mobile_tech_id = mobile_tech_id;
		this.mobile_resolution_id = mobile_resolution_id;
		this.mobile_wide_id = mobile_wide_id;
		this.mobile_max_light = mobile_max_light;
		this.mobile_screen = mobile_screen;
	}
	public short getMobile_id() {
		return mobile_id;
	}
	public byte getMobile_tech_id() {
		return mobile_tech_id;
	}
	public byte getMobile_resolution_id() {
		return mobile_resolution_id;
	}
	public byte getMobile_wide_id() {
		return mobile_wide_id;
	}
	public String getMobile_max_light() {
		return mobile_max_light;
	}
	public String getMobile_screen() {
		return mobile_screen;
	}
	public void setMobile_id(short mobile_id) {
		this.mobile_id = mobile_id;
	}
	public void setMobile_tech_id(byte mobile_tech_id) {
		this.mobile_tech_id = mobile_tech_id;
	}
	public void setMobile_resolution_id(byte mobile_resolution_id) {
		this.mobile_resolution_id = mobile_resolution_id;
	}
	public void setMobile_wide_id(byte mobile_wide_id) {
		this.mobile_wide_id = mobile_wide_id;
	}
	public void setMobile_max_light(String mobile_max_light) {
		this.mobile_max_light = mobile_max_light;
	}
	public void setMobile_screen(String mobile_screen) {
		this.mobile_screen = mobile_screen;
	}
	// ...........

	public String toString() {
		return "Mobile [mobile_id=" + mobile_id + ", mobile_tech_id=" + mobile_tech_id + ", mobile_resolution_id="
				+ mobile_resolution_id + ", mobile_wide_id=" + mobile_wide_id + ", mobile_max_light=" + mobile_max_light
				+ ", mobile_screen=" + mobile_screen + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo
		Mobile b;
//		Mobile b1 = new Mobile();
		Mobile b2 = new Mobile((short) 321423, (byte) 123, (byte)321, (byte)645,"ASD", "Có");
		//In
		System.out.println(b2);
	}

}

enum SCREEN {

}
