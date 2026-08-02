package Exams;

import java.util.Scanner;

import java.lang.Math;

public class eg7 {

	public static void main(String[] args) {
		// Giải phương trình bậc 3 hoặc 2
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập 4 số a, b, c, d: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		float x1, x2, x3;
		// Giải phương trình bậc 2
		if (a == 0 && b != 0) {
			float delta;
			delta = c * c - 4 * b * d;
			if (delta > 0) {
				x1 = (-c + (float) (Math.sqrt(delta))) / (2 * b);
				x2 = (-c - (float) (Math.sqrt(delta))) / (2 * b);
				System.out.println("Phương trình có hai nghiệm phân biệt:x1 = " + x1 + ", x2= " + x2);
			} else if (delta == 0) {
				x1 = x2 = -c / 2 * b;
				System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x1);
			} else {
				x1 = (-c + (float) (Math.sqrt(Math.abs(delta)))) / (2 * b);
				x2 = (-c - (float) (Math.sqrt(Math.abs(delta)))) / (2 * b);
				System.out.println("Phương trình có 2 nghiệm phức: x1 = " + x1 + "i" + ", x2 = " + x2 + "i");
			}
		} else if (a == 0 && b == 0) {
			System.out.println("Không phải phương trình bậc 2 hoặc bậc 3 !");
			// Giải phương trình bậc 3
		} else {
			float delta, k;
//			k = Math.toRadians(k);
			delta = b * b - 3 * a * c;
			k = (9 * a * b * c - 2 * b * b * b - 27 * a * a * d)
					/ (float) (Math.sqrt((float) (Math.abs(delta * delta * delta))));
			// Kiểm tra delta
			if (delta > 0) {
				System.out.println("Delta > 0");
				if (Math.abs(k) <= 1) {
					System.out.println("Phương trình có 3 nghiệm phân biệt: ");
					x1 = (2 * (float) (Math.sqrt(delta)) * (float) (Math.cos((Math.acos(k)) / 3) - b)) / 3 * a;
					x2 = (2 * (float) (Math.sqrt(delta)) * (float) (Math.cos((Math.acos(k) / 3)) - ((2 * Math.PI) / 3))
							- b) / 3 * a;
					x3 = (2 * (float) (Math.sqrt(delta)) * (float) (Math.cos((Math.acos(k) / 3)) + ((2 * Math.PI) / 3))
							- b) / 3 * a;
					System.out.println("x1 = " + x1 + ", x2 = " + x2 + ", x3 = " + x3);
				}
				if (Math.abs(k) > 1) {

					System.out.print("Phương trình có 1 nghiệm duy nhất: ");
					x1 = x2 = x3 = (float) (Math.sqrt(Math.abs(delta)) / 3 * a)
							* ((float) (Math.cbrt(Math.abs(k) + Math.sqrt(k * k - 1)))
									+ (float) (Math.cbrt(Math.abs(k) - Math.sqrt(k * k - 1))))
							- b / (3 * a);
					System.out.println("x = " + x1);
				}

			} else if (delta == 0) {
				System.out.println("Delta = 0");
				if (Math.pow(b, 3) - 27 * a * a * d != 0) {
					System.out.println("Phương trình có 1 nghiệm duy nhất : ");
					x1 = x2 = x3 = (-b + (float) Math.cbrt(Math.pow(b, 3) - 27 * a * a * d)) / 3 * a;
					System.out.println("x = " + x1);
				} else {
					System.out.print("Phương trình có một nghiệm bội: ");
					x1 = x2 = x3 = -b / (3 * a);
					System.out.println("x = " + x1);

				}
				//delta <0
			}else {
				System.out.println("delta < 0");
				System.out.print("Phương trình có 1 nghiệm duy nhất: ");
				x1 = x2 = x3 = (float) (Math.sqrt(Math.abs(delta)) / 3 * a) * ((float) (Math.cbrt(k + Math.sqrt(k * k - 1))) + (float)(Math.cbrt(k - Math.sqrt(k*k + 1)))) - b / (3 * a);
				System.out.println("x = " + x1);
				
			}
		}

	}

}
