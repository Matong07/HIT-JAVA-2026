package ontap2;

import java.util.*;

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
		
		for(Tour t : results) {
			if(t.getProduct_name().toLowerCase().contains(name.toLowerCase())) {
				list.add(t);
			}
		}
		
		return list;
	}

	@Override
	public List<Tour> searchTour(double price) {
		// TODO Auto-generated method stub
		List<Tour> list = new ArrayList<>();
		
		for(Tour t: results) {
			if(t.getProduct_price() <= price + 500 && t.getProduct_price() >= price - 500) {
				list.add(t);
			}
		}
		
		return list;
	}

	@Override
	public List<Tour> sortedTour(boolean isINC) {
		// TODO Auto-generated method stub
		if(isINC) {
			Collections.sort(results);
		}else {
			Collections.sort(results, Collections.reverseOrder());
		}
		return results;
	}

	@Override
	public List<Tour> getTotalPrice() {
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
		
		Function f = new Function();
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		//Tạo sản phẩm
		
		Tour t1 = new Tour((short) 112,"Đà Lạt",(double)3000,1,"2 day", "Ô tô");
		Tour t2 = new Tour((short) 113,"Đà Nẵng",(double)2000,3,"3 day", "Xe máy");
		Tour t3 = new Tour((short) 114,"Nha Trang",(double)4000,4,"4 day", "Xe khách");
		Tour t4 = new Tour((short) 115,"Bà Nà HILL",(double)3500,6,"1 day", "Ô tô");
		
		//Khởi tạo danh mục
		f.addTour(t1);
		f.addTour(t2);
		f.addTour(t3);
		f.addTour(t4);
		f.printTour();
		System.out.println("---------------------------------------------");
		//Thêm tour
		Tour t5 = new Tour((short) 123,"Cát Bà",(double)5000,2,"3 day", "Ô tô");
		f.addTour(t5);
		System.out.println("Cập nhật thành công ! ");
		f.printTour();
		System.out.println("---------------------------------------------");
		//Xóa tour
		System.out.println("Xóa Tour Đà Lạt thành công !");
		f.delTour(t1);
		f.printTour();
		System.out.println("---------------------------------------------");
		//Tìm kiếm theo tên
		List<Tour> s = f.searchTour("Đà ");
		System.out.println("Kết quả gần đúng với chữ Đà : ");
		f.printTour2(s);
		System.out.println("---------------------------------------------");
		//Tìm kiếm theo giá
		List<Tour> s1 = f.searchTour(2500);
		System.out.println("Kết quả gần đúng với 2500:  " );
		f.printTour2(s1);
		System.out.println("---------------------------------------------");
		//Xắp xếp
		System.out.println("Theo giá tăng");
		f.sortedTour(true);
		f.printTour();
	}
}
