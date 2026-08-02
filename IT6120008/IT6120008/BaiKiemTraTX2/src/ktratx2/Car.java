package ktratx2;

import java.util.*;

/**
 * 
 * @author Ma Thế Quyền - MSV: 2021603162
 *
 */
public class Car extends Product implements Comparable<Car> {

	// constant's
	public static final short CAR_MAXSPEED = (short) 0;
	public static final String CAR_TYPE = "No Car Type";
	public static final String CAR_BRAND = "No Car Brand";

	// object's
	private short car_maxspeed;// Tốc độ xe
	private String car_type;// Loại xe
	private String car_brand;// Thương hiệu

	// Constructor không tham số
	public Car() {

	}

	// Constructor kế thừa thuộc tính của lớp product
	public Car(short product_id, String product_name, double product_price, int product_total, short car_maxspeed,
			String car_type, String car_brand) {
		super(product_id, product_name, product_price, product_total);
		this.car_maxspeed = car_maxspeed;
		this.car_type = car_type;
		this.car_brand = car_brand;
	}

	// Getter

	public short getCar_maxspeed() {
		return car_maxspeed;
	}

	public String getCar_type() {
		return car_type;
	}

	public String getCar_brand() {
		return car_brand;
	}

	// Setter

	public void setCar_maxspeed(short car_maxspeed) {
		this.car_maxspeed = car_maxspeed;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	// Other method
	@Override
	public String toString() {
		return super.toString() + "\nCar " + "[" + "car_maxspeed = " + car_maxspeed + "KM/H" + ", car_name= " + car_type
				+ ", car_brand= " + car_brand + "]";
	}

	public int compareTo(Car c) {
		// TODO Auto-generated method stub
		if (this.getProduct_price() > c.getProduct_price()) {
			return 1;
		} else if (this.getProduct_price() < c.getProduct_price()) {
			return -1;
		} else {
			return 0;
		}
	}
}
