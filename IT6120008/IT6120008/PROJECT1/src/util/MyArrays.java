package util;

import objects.*;
import java.util.ArrayList;//Sử dụng mảng để biểu diễn các thành phần danh sách
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;

/**
 * Phương thức sinh ngẫu nhiên giá trị phần tử mảng cho mảng 1 chiều<br>
 * 
 * @author MSI GAMING
 * 
 * @param n - Số phần tử mảng
 *
 * @return - Mảng 1 chiều có giá trị < 100
 */
public class MyArrays {
	public static int[] generateArray(int n) {
		// Khai báo mảng trung gian
		int[] arrInt = new int[n];

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (Math.random() * 100);

		}

		return arrInt;

	}

	public static int[] sortedArray(int[] arrInt, boolean isINC) {
		// Xác định hướng xắp xếp
		byte ori = (byte) (isINC ? 1 : -1);
		int tmp;
		for (int i = 0; i < arrInt.length - 1; i++) {
			// về làm kĩ thuật swap
			for (int j = i + 1; j < arrInt.length; j++) {
				if (arrInt[i] > arrInt[j]) {
					tmp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = tmp;
				}

			}
		}
		return arrInt;

	}

	public static Fashion[] generateFashion(int n) {
		// Khai báo mảng trung gian
		Fashion[] listFashion = new Fashion[n];

		// Khai Báo mảng Mã quản lí
		String[] fashion_manage_id = { "QL1", "QL2", "QL3", "QL4", "QL5", "QL6", "QL7", "QL8", "QL9" };
		// Khai báo mảng tên sản phẩm
		String[] fashion_name = { "Quần bò", "Quần đùi", "Áo ba lỗ", "Váy dài", "Áo hoa cúc", "Chân váy", "Vòng cổ",
				"Đồng hồ", "Khuyên tai", "Thắt lưng", "Áo cadigan", "Áo hoodie", "Áo phao", "Quần âu", "Quần tây",
				"Quần baggy", "Áo Sweet", "Quần Joger" };
		// Khai báo thương hiệu sản phẩm
		String[] fashion_grand = { "Fila", "Mando", "Jbagy", "Vascara", "Juno", "Gumac", "Sixdo", "FM Style", "Canifa",
				"YODY", "Yame", "Adam Store", "BILUXURY", "OWEN", "Việt Tiến", "Routine", "Elise", "Hnoss" };

		// Khai báo mảng kích thước
		byte[] fashion_size = { 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 };
		// Sinh dữ liệu
		int index;
		for (int i = 0; i < listFashion.length; i++) {
			// Cấp phát bộ nhớ cho phần tử mảng
			listFashion[i] = new Fashion();

			// Sinh ngẫu nhiên tên
			index = (int) (Math.random() * fashion_manage_id.length);
			listFashion[i].setFashionManageId(fashion_manage_id[index]);
			// Sinh ngẫu nhiên họ
			index = (int) (Math.random() * fashion_name.length);
			listFashion[i].setFashionName(fashion_name[index]);

			// Sinh ngẫu nhiên thương hiệu
			index = (int) (Math.random() * fashion_grand.length);
			listFashion[i].setFashionGrand(fashion_grand[index]);

			// Sinh ngẫu nhiên kích thước
			index = (int) (Math.random() * fashion_size.length);
			listFashion[i].setFashionSize((byte) fashion_size[index]);

		}

		return listFashion;
	}

//	public static Housing[] generateHousing(int n) {
//		//Khai báo 1 mảng trung gian
//		Housing[] listHousing = new Housing[n];
//		
//		//Khai báo mã nhà
////		 = 1000 +(int)(Math.random()*1020);
//		
//		
//		index = 18 + (int) (Math.random() * 5);
//		list[i].setAge((byte) index);
//		//Khai báo chiều dài
//		
//		//khai báo chiều rộng
//		
//		//Khai báo phương hướng
//		
//		return listHousing;
//	}

	public static Tour[] generateTour(int n) {
		return null;
	}

	// Sinh ngẫu nhiên 1 danh sách
	public static Person[] generatePerson(int n) {
		// Khai báo 1 mảng trung gian
		Person[] list = new Person[n];

		// Khai báo mảng danh sách tên
		String[] firstNames = { "Quyền", "Đạt", "Công Hậu", "Độ", "Trung", "Hiếu", "Vinh", "Việt", "Từ", "Đông",
				"Dương", "Phương", "Thiên Phong", "Phú Quý", "Quý", "Hương", "Hiền", "Hạnh", "Thủy", "Thu", "Tiến",
				"Thảo", "Mùi", "Vĩnh", "Mai", "Quang Mạnh", "Linh", "Yến", " Thảo" };
		// Danh sách họ
		String[] lastNames = { "Nguyễn", "Hoàng Văn", "Lê Thánh", "Trần Thị", "Nông Văn", "Bùi Văn", "Đoàn Nhân", "Đào",
				"Dương", "Quách", "Phạm Tuấn", "Phan", "Ngô", "An", "Ma Thế", "Đàm", "Tôn Nhất", "Hồ Hữu", "Lương Văn",
				"Đỗ Thị", "Vũ Tuấn", "Giáng", "Chẩu Thị", "Đặng" };

		// Sinh dữ liệu
		int index;
		for (int i = 0; i < list.length; i++) {
			// Cấp phát bộ nhớ cho phần tử mảng
			list[i] = new Person();

			// Sinh ngẫu nhiên tên
			index = (int) (Math.random() * firstNames.length);
			list[i].setFirstName(firstNames[index]);
			// Sinh ngẫu nhiên họ
			index = (int) (Math.random() * lastNames.length);
			list[i].setLastName(lastNames[index]);

			// Sinh Tuổi
			index = 18 + (int) (Math.random() * 5);
			list[i].setAge((byte) index);

		}
		return list;
	}

	// Tìm kiếm tên
	public static Person[] searchPerson(Person[] list, String name) {
		// Khai báo mảng lưu trữ kết quả
		Person[] results = null;
		// Person[] results = new Person[list.lenght]; ==> k nên dùng

		// Đếm số kết quả
		int count = 0;

		for (Person p : list) {
			// equals là phép so sánh đia chỉ của 2 đối tượng trong bộ nhớ
			// equalsIgnoreCase không quan tâm in hoa hay thường
//			if (p.getFirstName().equalsIgnoreCase(name)) { equalsIgnoreCase là tìm kiếm tuyệt đối
//				count++;
//			}
			if (p.getFirstName().toLowerCase().contains(name.toLowerCase())) {
				count++;
			}
		}
		// Khởi tạo bộ nhớ
		results = new Person[count];

		// Ghi nhận kết quả
		// p.getFirstName().contains(name) chứa các giá trị gần đúng , phân biệt chữ hoa
		// chữ thường
		count = 0;
		// tìm giá trị gần đúng, không phân biệt chữ hoa
		for (Person p : list) {
			if (p.getFirstName().toLowerCase().contains(name.toLowerCase())) {
				results[count++] = p;
//				count++;

			}
		}

		return results;
	}

	// Cách viết sd mảng động, Tìm kiếm tên
	// ArrayList<Đối tượng lưu trữ>
	public static ArrayList<Person> searchPersonV2(Person[] list, String name) {

		// Khai báo và khởi tạo mảng lưu trữ kết quả
		ArrayList<Person> results = new ArrayList<>();// () Không tham số, có thể cho tham số

		// ghi nhận kết quả
		for (Person p : list) {
			if (p.getFirstName().toLowerCase().contains(name.toLowerCase())) {
				results.add(p);
			}
		}
		return results;

	}

	// Xắp xếp theo tuổi
	// gọi vào là mảng tĩnh trả kq mảng động nên cần khai báo mảng trung gian
	public static ArrayList<Person> sortedByAge(Person[] list, boolean isINC) {
		// Khai báo mảng trung gian
		ArrayList<Person> tmp = new ArrayList<>();

		// Sao chép list sang tmp

		Collections.addAll(tmp, list);
		// Xắp xếp
		if (isINC) {
			Collections.sort(tmp);
		} else {
			Collections.sort(tmp, Collections.reverseOrder());// Collections.reverseOrder() đảo ngược
		}
		return tmp;
	}

	// Xắp xếp theo firstName
	public static ArrayList<Person> sortedByName(Person[] list, boolean isINC) {
		// Khai báo mảng trung gian
		ArrayList<Person> sbn = new ArrayList<>();

		// Sao chép list sang sbn
		Collections.addAll(sbn, list);
		// Xắp xếp
		if (isINC) {
			Collections.sort(sbn, new sortedByName());
		} else {
			Collections.sort(sbn, new sortedByName().reversed());// .reversed() đảo ngược
		}

		return sbn;
	}

	public static void printArray(int[] arrInt) {
		// Cách 1:
//		for (int i = 0; i < arrInt.length; i++) {
//			System.out.print(arrInt[i] + " ");
//		}
		// Cách 2:
		for (int value : arrInt) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	// PHP, Pythond, Java,
	public static void printPerson(Person[] list) {

		for (Person p : list) {
			System.out.println(p);
		}
	}

	public static void printFashion(Fashion[] listFashion) {
		for (Fashion f : listFashion) {
			System.out.println(f);
		}
	}

	public static void printPerson(ArrayList<Person> list) {
		// Cách viết số 2
//		for (Person p : list) {
//			System.out.println(p);
//		}
		// Cách viết 3
		list.forEach(p -> System.out.println(p));

	}

	public static void main(String[] args) {
		// Mảng nguyên thủy chứa trực tiếp giá trị
		// Sinh mảng
		int[] arrInt = MyArrays.generateArray(20);
		Person[] list = MyArrays.generatePerson(20);
		Fashion[] listFashion = MyArrays.generateFashion(20);
		// in mảng
//		MyArrays.printArray(arrInt);
		MyArrays.printPerson(list);
//		MyArrays.printFashion(listFashion);
		// Xắp xếp
//		arrInt = MyArrays.sortedArray(arrInt, true);
//
//		MyArrays.printArray(arrInt);

//		arrInt = MyArrays.sortedArray(arrInt, false);
//
//		MyArrays.printArray(arrInt);

		// Tìm kiếm 1
//		Person[] results = MyArrays.searchPerson(list, "QuyềN");
//		MyArrays.printPerson(results);

//		Tìm kiếm 2
//		ArrayList<Person> results = MyArrays.searchPersonV2(list, "ThẢo");
//		MyArrays.printPerson(results);

//		 Xắp xếp 
//		 True là xắp xếp tăng - false là xắp xếp giảm
		// Sắp xếp theo tuổi tăng
		System.out.println("Sắp xếp theo tuổi: ++++++++++++++++++++++++++++++++++++++");
		ArrayList<Person> results1 = MyArrays.sortedByAge(list, true);
		MyArrays.printPerson(results1);

		// Xắp xếp theo tên
		System.out.println("Sắp xếp tên: -----------------------------------------");
		ArrayList<Person> results2 = MyArrays.sortedByName(list, true);
		MyArrays.printPerson(results2);

	}

}

//Comparator
class sortedByName implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub

		String name1 = p1.getFirstName();
		String name2 = p2.getFirstName();
		// Xác định vị trí để chỉ lấy tên
		int at = name1.trim().lastIndexOf(" ");
		if (at != -1) {
			name1 = name1.substring(at + 1);
		}
		at = name2.trim().lastIndexOf(" ");
		if (at != -1) {
			name2 = name2.substring(at + 1);
		}

		return name1.compareTo(name2);// So sánh ký tự trong bảng mã ASCII
	}

}