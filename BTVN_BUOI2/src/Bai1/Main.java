package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       double r;
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap ban kinh cua hinh tron: ");
       r = sc.nextDouble();
        Circle  a =  new Circle(r);
        System.out.print("Perimeter = ");
        System.err.printf("%.3f",a.Perimeter());
        System.out.print(" ");
        System.out.print("Acreage = ");
        System.err.printf("%.3f",a.Acreage());
        sc.close();
    }
}
