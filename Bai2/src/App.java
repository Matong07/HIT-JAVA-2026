
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int n;
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam muon kiem tra: ");
        n = sc.nextInt();
        if ( (n % 4 == 0 && n % 100 != 0)|| n % 400 == 0 ) {
            System.out.println(n + " la nam nhuan!");

        }else{
            System.out.println(n+" khong phai nam nhuan");
        }
        sc.close();
    }
}
