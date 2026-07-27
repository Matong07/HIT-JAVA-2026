package Bai4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Toanhoc baiToan = new Toanhoc(a, b, c);
        
        baiToan.timVaInTrungVi();
        sc.close();
    }
}