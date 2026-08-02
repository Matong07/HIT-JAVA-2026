package Exams;

import java.util.Scanner;

public class eg6 {
	public static void main(String[] args) {
		// Nhập độ dài các cạnh của tam giác

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập độ dài cạnh a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập độ dài cạnh b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập độ dài cạnh c: ");
		int c = scanner.nextInt();

		float p = (a + b + c) / 2;
		float s1;
		// Diện tích tam giác
		if (a + b > c && a + c > b && b + c > a) {
			s1 = (float) (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
			System.out.println("Diện tích tam giác ABC là: " + s1);
		} else {
			System.out.println("3 cạnh không phải là cạnh của tam giác");
		}
		//Nhập độ dài các cạnh của hình thang
		System.out.print("Nhập độ dài đáy lớn dl = ");
		int dl = scanner.nextInt();
		System.out.print("Nhập độ dài đáy nhỏ dn = ");
		int dn = scanner.nextInt();
		System.out.print("Nhập độ dài chiều cao của hình thang h = ");
		int h = scanner.nextInt();
		
		//Diện tích hình thang
		float s2;
		s2 = (float)((a+b)/2)*h;
		System.out.println("Diện tích hình thang = "+s2);
		
		//Nhập bán kính r
		System.out.print("Nhập bán kính r = ");
		int r = scanner.nextInt();
		float s3;
		s3 = (float)(r*r*3.14);
		
		System.out.println("Diện tích hình tròn = " +s3);
	}
}
