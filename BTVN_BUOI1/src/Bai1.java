
import java.util.Scanner;

  public class Bai1 {
      public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x1,x2,y1,y2;
          System.out.print("Nhap toa do x1: ");
          x1=Integer.parseInt(sc.nextLine());
          System.out.print("Nhap toa do y1: ");
          y1=Integer.parseInt(sc.nextLine());
          System.out.print("Nhap toa do x2: ");
          x2=Integer.parseInt(sc.nextLine());
          System.out.print("Nhap toa do y2: ");
          y2=Integer.parseInt(sc.nextLine());
          double d= 0;
          d = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
          System.out.print("Khoang cach giua hai diem A va B : ");
          System.out.printf("%.2f",d);

      }
  }
