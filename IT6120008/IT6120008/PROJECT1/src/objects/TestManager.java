package objects;

public class TestManager {
	// Tham số đầu vào ABC
	public static void prinDetail(ABC a) {

	}

	public static void main(String[] args) {
		Address addr = new Address();

		/*
		 * up catting kỹ thuật khởi tạo đa hình A a = new B(); B là lớp con của A
		 * toString() cài đặt lại trồng phương thức overloading đè phương thức Over
		 * riding
		 *
		 */
		Person s = new Student("Đạt", "Dương Tất", (byte) 19, new Address(), (int) 603134, "(2021)603212",
				"Công Nghệ Thông Tin", (byte) 2021);
		Person e = new Employee("Quyền", "Ma Thế", (byte) 19, addr, (int) 12, "Vị trí 21", (short) 2);
		Employee e1 = new Employee("Quyền", "Ma Thế", (byte) 19, addr, (int) 12, "Vị trí 21", (short) 2);
		// -------------------------------------------
//		StudentManager sm = new StudentManager();
//		EmployeeManager em = new EmployeeManager();
		//Khởi tạo bộ nhớ new StudentManager và new EmployeeManager
		Manager sm = new StudentManager();
		Manager em = new EmployeeManager();
		
		//Gọi trực tiếp
		System.out.println(sm.getInfo(s));
		System.out.println(sm.getInfo(e));
		
		//Gọi gián tiếp
		System.out.println(sm.getDetail(s));
		System.out.println(sm.getDetail(e));
		

	}
}
