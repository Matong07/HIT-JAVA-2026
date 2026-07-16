
import java.util.Scanner;

public class Bai4 {
    public static void nhapDiem(double[] diem ){
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < diem.length;i++ ){
            do{System.out.print("Nhap diem cua hoc sinh "+(i+1)+": ");
            diem[i] = Double.parseDouble(sc.nextLine());
        }while(diem[i]<0 || diem[i]>10);
    }
    }
    public static double findMax(double[] diem) {
        double max = 0;
        for(double x : diem){
            if(x > max){
                max = x;
            }
        }
        return max;
    }
    public static double calculateAverage(double[] diem){
        double tb = 0;
        double tong = 0;
        int soLuong = 0;
        for(double x : diem){
            tong +=x;
            soLuong +=1;
        }
        tb = tong / soLuong;
        return tb;
    }
    public static int countFailedStudents(double[] diem){
        int dem = 0; 
        for(double x : diem){
            if(x < 5.0){
                dem+=1;
            }
        }
        return dem;
    }
    public static void main(String[] args)  throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = Integer.parseInt(sc.nextLine());
        double[] diem = new double[n];
        nhapDiem(diem);
        System.out.print("Diem cao nhat: ");
        System.out.println(findMax(diem));
        System.out.print("Trung binh diem cua ca lop: ");
        System.out.printf("%.2f",calculateAverage(diem));
        System.out.println();
        System.out.print("So hoc sinh co diem duoi trung binh: ");
        System.out.println(countFailedStudents(diem));
    }
}
