package Exam;

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		System.out.print("UCLN của a = " + a + " và b = " + b + " là: ");

		// Biến ghi nhận kết quả
		int ucln = -1;
		// Thuật toán tìm UCLN cách 1
		if (a * b != 0) {
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}

			ucln = a;// b
		}
		System.out.println(ucln);

	}
}
