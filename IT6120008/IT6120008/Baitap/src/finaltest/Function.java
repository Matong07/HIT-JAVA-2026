package finaltest;

import java.util.*;

public class Function implements TourManager, Search, addFunction {
	private List<Tour> results = new ArrayList<>();

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
		for (Tour t : results) {
			if (t.getProduct_price() == price) {
				list.add(t);
			}else {
				System.out.println("Không tìm thấy !");
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
	
	//Hiển thị
	public void printTour() {
	results.forEach(p -> System.out.println(p));
	}
	public void printTour2(List<Tour> list) {
		list.forEach(p-> System.out.println(p));
	}
	public static void menu() {
	
		Scanner sc = new Scanner(System.in);
		int num = 0;
		Function f  = new Function();
		
		//Khởi tạo đối tượng
		
		Tour t1 = new Tour((short) 111, "Bà Nà Hill", (double)3000000, 3, "3day 2 night","Ô tô");
		Tour t2 = new Tour((short) 112, "Sầm Sơn", (double)4000000, 2, "2day 2 night","Xe Du lịch");
		Tour t3 = new Tour((short) 113, "Vịnh Hạ Long", (double)5000000, 4, "3day 3 night","Thuyền");
		Tour t4 = new Tour((short) 114, "Đảo Cồn Cỏ", (double)2500000, 1, "1day 1 night","Thuyền");
		Tour t5 = new Tour((short) 115, "Rừng Tràm", (double)1000000, 5, "1day","Xe máy");
		Tour t6 = new Tour((short) 116, "Sapa", (double)3000000, 3, "2day 2 night","Xe khách");
		
		//Khởi tạo danh sách ban đầu
		f.addTour(t1);
		f.addTour(t2);
		f.addTour(t3);
		f.addTour(t4);
		f.addTour(t5);
		f.printTour();
		
		do {
			System.out.println("<!> Danh sách các chức năng. ");
			System.out.println("<1> Thêm sản phẩm. ");
			System.out.println("<2> Xóa sản phẩm. ");
			System.out.println("<!> Danh sách các chức năng. ");
			System.out.println("<!> Danh sách các chức năng. ");
			
			num = sc.nextInt();
			
			switch(num) {
			case 1: 
				f.addTour(t6);
				f.printTour();
				break;
			case 2:
				f.delTour(t1);
				f.printTour();
				break;
			case 3:
				f.sortedTour(true);
				f.printTour();
				break;
			case 4: 
				f.searchTour(num);
			}
			
		}while(num<=0 || num >6);
		
		
	}
	
	
	
}

