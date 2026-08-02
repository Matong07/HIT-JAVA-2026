package Exams;

import java.util.Scanner;

public class eg5 {
	public static void main(String[] args) {
		// Nhập số nguyên n và m từ bàn phím

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên n: ");
		int n = scanner.nextInt();
		System.out.println("Nhập số nguyên m: ");
		int m = scanner.nextInt();

		System.out.println("UCLN của " + n + " và " + m + " là: ");

		// Biến ghi nhận kết quả
		int ucln = -1;

		// Thuật toán tìm UCLN
		if (n * m != 0) {
			while (n != m) {
				if (n > m) {
					n = n - m;
				} else {
					m = m - n;
				}
			}
			ucln = n;// m
		}
		System.out.print(+ucln);
	}
}
