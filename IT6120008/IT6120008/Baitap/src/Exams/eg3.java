package Exams;

public class eg3 {

	public static void main(String[] args) {
		// Chọn số ngẫu nhiên n từ 1 - 100
		int n = (int) (Math.random() * 100);

		// Tính n!
		long gt = 1;
		for (int i = n; i > 0; i--) {
			gt = gt * i;
		}

		// In ra kết quả
		System.out.println("Giai thừa của " + n + "! = " + gt);
	}

}
