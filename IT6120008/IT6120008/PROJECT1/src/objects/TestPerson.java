package objects;

public class TestPerson {
	//Tham số đầu vào ABC
	public static void prinDetail(ABC a) {
		
	}
	
	public static void main(String[] args) {
		Address addr = new Address();

		/*up catting
		kỹ thuật khởi tạo đa hình
		A a = new B(); B là lớp con của A
		toString() cài đặt lại
		trồng phương thức overloading
		đè phương thức Over riding
		*
		*/ 
 		Person s = new Student("Đạt", "Dương Tất", (byte) 19, new Address(), (int) 603134, "(2021)603212",
				"Công Nghệ Thông Tin", (byte) 2021);

		Person e = new Employee("Quyền", "Ma Thế", (byte) 19, addr, (int) 12, "Vị trí 21", (short)2);
		
		Employee e1 = new Employee("Quyền", "Ma Thế", (byte) 19, addr, (int) 12, "Vị trí 21", (short)2);

		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(e1);
		
		ABC a = new ABC();
		ABC a1 = new Person();
//		ABC a2 = new Job();
		ABC a3 = new Student();
		ABC a4 = new Employee();
		
		TestPerson.prinDetail(a4);
	}
}
