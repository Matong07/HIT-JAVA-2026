package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.print("Nhap chuoi : ");
        chuoi = sc.nextLine();
        Palindrome a = new Palindrome(chuoi);
        a.Conversion(chuoi);
    }
}
