package Exams;

import java.util.Scanner;

public class eg2 {
	public static void main(String[] args) {
		// nhập 3 số nguyên a, b, c
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào 3 số a, b, c: ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int delta;
		float x1, x2;
		delta = b * b - 4 * a * c;
		if (a != 0) {
			if (delta > 0) {
				x1 = (-b + (float) (Math.sqrt(delta))) / (2 * a);
				x2 = (-b - (float) (Math.sqrt(delta))) / (2 * a);
				System.out.println("Phương trình có hai nghiệm phân biệt:x1 = " + x1 + ", x2= " + x2);
			} else if (delta == 0) {
				x1 = x2 = -b / 2 * a;
				System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x1);
			} else {
				x1 = (-b + (float) (Math.sqrt(Math.abs(delta)))) / (2 * a);
				x2 = (-b - (float) (Math.sqrt(Math.abs(delta)))) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm phức: x1 = " + x1 + "i" + ", x2 = " + x2 + "i");
			}
		}else {
			System.out.println("Phương trình không phải phương trình bậc 2");
		}
	}
}
