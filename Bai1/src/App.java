
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        a = sc.nextInt();   
        System.out.print("Nhap chieu rong: ");
        b = sc.nextInt();
        int C = (a + b ) * 2;
        int S = a * b;
        System.out.println("Chu vi hinh chu nhat do la: " + C);
        System.out.println("Dien tich cua hinh chu nhat do la: " + S);
    }
}
