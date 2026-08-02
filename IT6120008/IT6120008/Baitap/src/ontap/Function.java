package ontap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Function implements TourManager {

	List<Tour> results = new ArrayList<>();

	@Override
	public boolean addTour(Tour t) {
		// TODO Auto-generated method stub
		if (results.contains(t)) {
			t.setProduct_total(t.getProduct_total() + 1);
			return true;
		} else {
			results.add(t);
			return false;
		}
	}

	@Override
	public boolean delTour(Tour t) {
		// TODO Auto-generated method stub
		if (results.contains(t)) {
			if (t.getProduct_total() == 1) {
				results.remove(t);
			} else {
				t.setProduct_total(t.getProduct_total() - 1);
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Tour> searchTour(String name) {
		// TODO Auto-generated method stub
		List<Tour> list = new ArrayList<>();

		for (Tour t : results) {
			if (t.getProduct_name().toLowerCase().contains(name.toLowerCase())) {
				list.add(t);
			}
		}

		return list;
	}

	@Override
	public List<Tour> searchTour(double price) {
		// TODO Auto-generated method stub
		List<Tour> list = new ArrayList<>();
		for (Tour t : results) {
			if (t.getProduct_price() == price) {
				list.add(t);
			}
		}
		return list;
	}

	@Override
	public List<Tour> sortedTour(boolean isINC) {
		// TODO Auto-generated method stub
		if (isINC) {
			Collections.sort(results);
		} else {
			Collections.sort(results, Collections.reverseOrder());
		}
		return results;
	}

	@Override
	public List<Tour> getTotalStorage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printTour() {
		results.forEach(p -> System.out.println(p));
	}

	public void printTour2(List<Tour> list) {
		list.forEach(p -> System.out.println(p));
	}

	public static void menu() {

		Scanner sc = new Scanner(System.in);

		Function f = new Function();

		int num = 0;

		// Tạo danh sách

		Tour t1 = new Tour((short) 111, "Cát Bà", (double) 3000000, (int) 1, "1day 1 night", "Xe ô tô");
		Tour t2 = new Tour((short) 112, "Phú Quốc", (double) 20000000, (int) 4, "3day 3 night", "Xe ô tô");
		Tour t3 = new Tour((short) 113, "Phong Nha Kẻ Bàng", (double) 1000000, (int) 2, "1day 0 night", "Xe Máy");
		Tour t4 = new Tour((short) 114, "Sapa", (double) 3500000, (int) 2, "2day 1 night", "Xe Máy");
		Tour t5 = new Tour((short) 115, "Mộc Châu", (double) 2500000, (int) 2, "3day 2 night", "Xe Máy");
		Tour t6 = new Tour((short) 116, "Vịnh hạ long", (double) 11000000, (int) 6, "4day 3 night", "Thuyền");
		Tour t7 = new Tour((short) 117, "Nha Trang", (double) 5000000, (int) 2, "2day 1 night", "Xe ô tô");
		Tour t8 = new Tour((short) 118, "Phố cổ Hội An", (double) 4500000, (int) 2, "2day 2 night", "Xe Khách");
		Tour t9 = new Tour((short) 119, "Chợ Nổi", (double) 1000000, (int) 3, "1day 1 night", "Tàu, bè");

		// Thêm danh sách mới tạo vào
		f.addTour(t1);
		f.addTour(t2);
		f.addTour(t3);
		f.addTour(t4);
		f.addTour(t5);
		f.addTour(t6);
		f.addTour(t7);
		f.addTour(t8);
		f.addTour(t9);
		// Hiển thị danh sách
		f.printTour();
		System.out.println("-----------------------------------");
		// Cập nhật tour
		Tour t10 = new Tour((short) 120, "Hà Giang", (double) 3000000, (int) 3, "1day 1 night", "Xe Khách");
		f.addTour(t10);
		f.printTour();
		System.out.println("----------------------------------");
		// Xóa bỏ tour
		f.delTour(t1);
		System.out.println("Đã xóa thành công ");
		f.printTour();
		System.out.println("------------------------------------------");
		// Tìm tên gần đúng với tuor
		List<Tour> s = f.searchTour("Mộc châu");
		System.out.println("Kết quả tìm kiếm Mộc châu: ");
		f.printTour2(s);
		System.out.println("------------------------------------------");
		// Tìm kiếm gần đúng với giá
		List<Tour> s1 = f.searchTour((double) 2500000);
		System.out.println("Kết quả của giá 2500000: ");
		f.printTour2(s1);
		System.out.println("------------------------------------------");
		// Xắp xếp theo giá tăng
		f.sortedTour(true);
		System.out.println("Xắp xếp theo thứ tự giá tăng là: ");
		f.printTour();
		System.out.println("------------------------------------------");

	}

}
