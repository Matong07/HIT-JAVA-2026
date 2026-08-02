package inter;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lớp khởi tạo không thay đổi
		Product m = new Mobile();
		
		//Môi trường khác nhau, Kết quả khác nhau
		Product c = new Computer();
		PersonManager c1 = new Computer();
		Statistic c2 = new Computer();
		Search c3 = new Computer();
		
		System.out.println(m);
		
	}

}
