package Exam;

public class Eg4 {
	public static void main(String[] args) {
		//Sinh ra n ngẫu nhiên

		int n = (int) (Math.random() * 100);

		// Cần kiểm tra n có phải là nguyên tố ?

		// Biến ghi nhận kết quả
		boolean flag = true;
		if (n < 2) {
			flag = false;
		} else {
			for (int v = 2; v <= (int) (Math.sqrt(n)); v++) {
				if (n % v == 0) {
					flag = false;
					break;
				}
			}
		}
		// Thông báo
		if (flag) {
			System.out.println("n = " + n + " là nguyên tố");
		} else {
			System.out.println("n = " + n + " không là số nguyên tố");
		}
	}
}