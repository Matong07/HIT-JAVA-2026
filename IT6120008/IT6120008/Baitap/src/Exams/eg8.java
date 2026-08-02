package Exams;

import java.util.Scanner;

public class eg8 {

	public static void main(String[] args) {
		// Giải hệ phương trình 2 ẩn
		Scanner scanner = new Scanner(System.in);
		// Nhập biểu thức 1
		System.out.print("Nhập biểu thức thứ nhất a1 = ");
		int a1 = scanner.nextInt();
		System.out.print("Nhập biểu thức thứ nhất b1 = ");
		int b1 = scanner.nextInt();
		System.out.print("Nhập biểu thức thứ nhất c1 = ");
		int c1 = scanner.nextInt();

		// Nhập biểu thức 2
		System.out.print("Nhập biểu thức thứ nhất a2 = ");
		int a2 = scanner.nextInt();
		System.out.print("Nhập biểu thức thứ nhất b2 = ");
		int b2 = scanner.nextInt();
		System.out.print("Nhập biểu thức thứ nhất c2 = ");
		int c2 = scanner.nextInt();

		// gọi k là điều kiện để kiểm tra có nghiệm hay không
		int k, kx, ky;
		int x, y;
		if (a1 == 0 && a2 == 0) {
			System.out.println("Không phải hệ phương trình 2 ẩn !");
		} else {
			System.out.println("Hệ phương trình 2 ẩn");
			k = (a1 * b2) - (b1 * a2);
			kx = (c1 * b2) - (b1 * c2);
			ky = (a1 * c2) - (c1 * a2);
			if (k == kx && kx == ky && ky == 0) {
				System.out.println("Hệ phương trình vô số nghiệm");
			} else if (k != 0) {
				x = kx / k;
				y = ky / k;
				System.out.println("Hệ phương trình có 1 nghiệm: x = " + x + ", y = " + y);
			} else {
				System.out.println("Hệ vô nghiệm !");
			}
		}
	}
}