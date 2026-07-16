
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
       System.out.println("Nhap do dai 3 canh cua tam giac");
       int a,b,c;
       do{
        System.out.print("Nhap a = ");
        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap b = ");
        b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap c = ");
        c = Integer.parseInt(sc.nextLine());
       }while (a < 0||b < 0||c <0);
        double P = a+b+c;
        double p= P/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
       if((a+b)<c||(a+c)<b||(b+c)<a){
        System.out.print("Ba canh cua tam giac khong hop le ");
       }else{
        if(a==b&&b==c&&c==a){
            System.out.printf("Tam giac deu!%n");
            System.out.printf("Chu vi: "+P+"%n");
            System.out.printf("Dien tich: ");
            System.out.printf("%.2f",S);
        }else{
        if (a==b||a==c||c==b) {
            System.out.printf("Tam giac can%n");
            System.out.printf("Chu vi: "+P+"%n");
            System.out.printf("Dien tich: ");
            System.out.printf("%.2f",S);
        }else{
            System.out.println("La tam giac thuong");
            System.out.printf("Chu vi: "+P+"%n");
            System.out.printf("Dien tich: ");
            System.out.printf("%.2f",S);
        }
    }
       }

    }
}
