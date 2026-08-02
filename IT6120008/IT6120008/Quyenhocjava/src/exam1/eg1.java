package exam1;
import java.util.Scanner;
public class eg1 {
	public static void main(String[] args) {
		//In ra màn hình
		byte i = 10;
		System.out.println("i =" +i);
		Scanner scanner = new Scanner(System.in);
		int a;
		float b;
		//Nhập số nguyên a và số thực b vào bàn phím
		a = scanner.nextInt();
		b = scanner.nextFloat();
		//In ra số nguyên a và số thực b vừa nhập ra màn hình
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
