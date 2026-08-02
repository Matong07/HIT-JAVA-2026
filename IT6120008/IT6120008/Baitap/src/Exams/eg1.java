package Exams;

public class eg1 {
	public static void main(String[] args) {
		// Tạo ngẫu nhiên số nguyên n từ 1 - 100
		int n = (int) (Math.random() * 100);

		// Kiểm tra n có phải số nguyên tố

		boolean flag = true;
		if (n < 2) {
			flag = false;
		} else {
			for (int v = 2; v <= (int) (Math.sqrt(n)); v++) {
				if (n % v == 0) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("Số " + n + " là số nguyên tố ");
		} else {
			System.out.println("Số " + n + " không phải là số nguyên tố ");
		}
	}
}
