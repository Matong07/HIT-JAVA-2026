package ktratx2;

import java.util.*;

/**
 * 
 * @author Ma Thế Quyền - MSV 2021603162
 *
 */

public class Function implements CarManager {

	private List<Car> results = new ArrayList<>();

	// Thêm sản phẩm ô tô trong kho
	@Override
	public boolean addCar(Car c) {
		// TODO Auto-generated method stub

		if (results.contains(c)) {
			c.setProduct_total(c.getProduct_total() + c.getProduct_total());
			return true;
		} else {
			results.add(c);
			return true;
		}
	}

	// Sửa sản phẩm
	@Override
	public boolean editCar(Car c) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		if (results.contains(c)) {
			// Sửa mã sp
			System.out.println("Enter id: \n");
			short edit_id = sc.nextShort();
			c.setProduct_id(edit_id);
			// Sửa tên sp
			System.out.println("Enter name: \n");
			String edit_name = sc.next();
			c.setProduct_name(edit_name);
			// Sửa giá sản phẩm
			System.out.println("Enter price: \n");
			double edit_price = sc.nextDouble();
			c.setProduct_price(edit_price);
			// Sửa số lượng
			System.out.println("Enter total: \n");
			short edit_total = sc.nextShort();
			c.setProduct_total(edit_total);
			// Sửa Tốc độ xe
			System.out.println("Enter speed: \n");
			short edit_speed = sc.nextShort();
			c.setCar_maxspeed(edit_speed);
			// Sửa loại xe
			System.out.println("Enter type: \n");
			String edit_type = sc.next();
			c.setCar_type(edit_type);
			// Sửa Thương hiệu
			System.out.println("Enter brand: \n");
			String edit_brand = sc.nextLine();
			c.setCar_brand(edit_brand);
			return true;
		}
		return false;
	}

	// Xóa sản phẩm
	@Override
	public boolean delCar(Car c) {
		// TODO Auto-generated method stub
		if (results.contains(c)) {
			if (c.getProduct_total() == 1) {
				results.remove(c);
			} else {
				c.setProduct_total(c.getProduct_total() - 1);
			}
			return true;
		} else {
			return false;
		}
	}

	// Tìm kiếm sản phẩm theo tên
	@Override
	public List<Car> searchCar(String name) {
		// TODO Auto-generated method stub

		List<Car> list = new ArrayList<>();
		for (Car c : results) {
			if (c.getProduct_name().toLowerCase().contains(name.toLowerCase())) {
				list.add(c);
			}
		}

		return list;
	}

	// Xắp xếp sản phẩm theo giá
	@Override
	public List<Car> sortedCarByPrice(boolean isINC) {
		// TODO Auto-generated method stub
		if (isINC) {
			Collections.sort(results);
		} else {
			Collections.sort(results, Collections.reverseOrder());
		}
		return results;
	}

	public void printCar() {
		results.forEach(p -> System.out.println(p));
	}

	public void printCar2(List<Car> list) {
		list.forEach(p -> System.out.println(p));
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		Function f = new Function();

		// Khởi tạo đối tượng
		Car c = new Car((short) 1122, "Vinfast Fadil", (double) 12000, (int) 1, (short) 120, "Sendan", "VINFAST");
		Car c1 = new Car((short) 1133, "Toyota Vios", (double) 10000, (int) 2, (short) 125, "Sedan", "TOYOTA");
		Car c2 = new Car((short) 1144, "Mazda CX5", (double) 30000, (int) 1, (short) 115, "Sedan", "Mazda");
		Car c3 = new Car((short) 1155, "Honda City", (double) 15000, (int)4, (short) 100, "Coupe", "Honda");
		Car c4 = new Car((short) 1166, "Kia K3", (double) 19000, (int) 5, (short) 1105, "Pickup", "Kia");
		Car c5 = new Car((short) 1177, "Ford Ranger", (double) 25000, (int) 2, (short) 130, "Limousine", "FERARI");

		do {
			System.out.println("<1> Hiển thị danh sách.");
			System.out.println("<2> Thêm sản phẩm.");
			System.out.println("<3> Sửa sản phẩm.");
			System.out.println("<4> Xóa số lượng sản phẩm.");
			System.out.println("<5> Tìm sản phẩm theo tên.");
			System.out.println("<6> Xắp xếp sản phẩm.");
			System.out.println("<!> Nhập lựa chọn của bạn: ");
			num = sc.nextInt();
			switch (num) {

			case 1:
				f.addCar(c);
				f.addCar(c1);
				f.addCar(c2);
				f.addCar(c3);
				f.addCar(c4);
				System.out.println("Product list: ");
				f.printCar();
				break;
			case 2:
				f.addCar(c);
				f.addCar(c1);
				f.addCar(c2);
				f.addCar(c3);
				f.addCar(c4);
				f.addCar(c5);
				System.out.println("Product list new update: ");
				f.printCar();
				break;
			case 3:
				f.addCar(c);
				f.addCar(c1);
				f.addCar(c2);
				f.addCar(c3);
				f.addCar(c4);
				f.printCar();
				do {
					System.out.println("<!>Sản phẩm muốn cập nhật ? ");
					System.out.println("<1>Sản phẩm 1 : ");
					System.out.println("<2>Sản phẩm 2 :");
					System.out.println("<3>Sản phẩm 3 :");
					System.out.println("<4>Sản phẩm 4 :");
					System.out.println("<5>Sản phẩm 5 :");
					System.out.println("<!>Nhập lệnh: ");
					num = sc.nextInt();
					switch (num) {
					case 1:
						f.editCar(c);
						System.out.println("New Update :");
						f.printCar();
						break;
					case 2:
						f.editCar(c1);
						System.out.println("New Update :");
						f.printCar();
						break;
					case 3:
						f.editCar(c2);
						System.out.println("New Update :");
						f.printCar();
						break;
					case 4:

						f.editCar(c3);
						System.out.println("New Update :");
						f.printCar();
						break;
					case 5:
						f.editCar(c4);
						System.out.println("New Update :");
						f.printCar();
						break;
					}
				} while (num <= 0 || num > 5);
				break;
			case 4:
				f.addCar(c);
				f.addCar(c1);
				f.addCar(c2);
				f.addCar(c3);
				f.addCar(c4);
				f.printCar();
				do {
					System.out.println("<!>Sản phẩm bạn muốn xóa ? ");
					System.out.println("<1>Sản phẩm 1 : ");
					System.out.println("<2>Sản phẩm 2 :");
					System.out.println("<3>Sản phẩm 3 :");
					System.out.println("<4>Sản phẩm 4 :");
					System.out.println("<5>Sản phẩm 5 :");
					System.out.println("<!>Nhập lệnh: ");
					num = sc.nextInt();
					switch (num) {
					case 1:

						f.delCar(c);
						System.out.println("New Delete");
						f.printCar();
						break;
					case 2:
						f.delCar(c1);
						System.out.println("New Delete :");
						f.printCar();
						break;
					case 3:

						f.delCar(c2);
						System.out.println("New Delete :");
						f.printCar();
						break;
					case 4:
						f.delCar(c3);
						System.out.println("New Delete :");
						f.printCar();
						break;
					case 5:
						f.delCar(c4);
						System.out.println("New Delete :");
						f.printCar();
						break;
					}
				} while (num <= 0 || num > 5);
				break;
			case 5:
				f.addCar(c);
				f.addCar(c1);
				f.addCar(c2);
				f.addCar(c3);
				f.addCar(c4);
				f.printCar();
				List<Car> s = f.searchCar("Vinfast Fadil");
				System.out.println("Sreach Product: ");
				f.printCar2(s);
				break;
			case 6:
				f.addCar(c);
				f.addCar(c1);
				f.addCar(c2);
				f.addCar(c3);
				f.addCar(c4);
				f.printCar();
				// Xắp xếp theo giá tăng
				System.out.println("Sorted By Price");
				do {
					System.out.println("<!>Xắp xếp: ");
					System.out.println("<1>Xắp xếp theo thứ tự tăng dần: ");
					System.out.println("<2>Xắp xếp theo thứ tự giảm dần: ");
					System.out.println("<!> Lựa chọn của bạn : ");
					num = sc.nextInt();
					switch (num) {
					case 1:
						f.sortedCarByPrice(true);
						f.printCar();
						break;
					case 2:
						f.sortedCarByPrice(false);
						f.printCar();
					}
				} while (num <= 0 || num > 2);
				break;
			}
		} while (num <= 0 || num > 6);
	}
}