package Exams;

import java.util.Scanner;

public class eg4 {

	public static void main(String[] args) {
//		// Lấy ngẫu nhiên số nguyên n và m từ 1 - 100
//		int n = (int) (Math.random()* 100);
//		int m = (int) (Math.random()* 100);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên n: ");
		int n = scanner.nextInt();
		System.out.print("Nhập số nguyên m: ");
		int m = scanner.nextInt();
		// Chương trình tính C(m,n)

		long gtm = 1;
		long gtn = 1;
		long gtmn = 1;
		double c;
		if (m != n) {
			// giai thừa của m
			for (int i = m; i > 0; i--) {
				gtm = gtm * i;
			}
			// giai thừa của n
			for (int v = n; v > 0; v--) {
				gtn *= v;
			}
			// giai thừa của m - n
			if (m - n < 0) {
				for (int j = (m - n); j < 0; j++) {
					gtmn *= j;
				}
			} else {
				for (int k = (m - n); k > 0; k--) {
					gtmn *= k;
				}
			}
			// Tính C(m,n)

			c = gtm / (double)(gtmn * gtn);
			// In ra giá trị
			System.out.println(+m + "! = " + gtm);
			System.out.println(+n + "! = " + gtn);
			System.out.println(+m - n + "! = " + gtmn);
			System.out.println("C(m,n) = " + c);
		} else {
			System.out.println("Không thể thực hiện chương trình !");
		}
	}
	}

