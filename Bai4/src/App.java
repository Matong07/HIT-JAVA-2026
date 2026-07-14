
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        int tam = n ;
        int so ;
        int dao = 0;
        while( tam != 0){
            so = tam%10;
            dao = dao * 10 + so ;
            tam /=10;
        }
        System.out.println("so dao: "+ dao);
        if( n == dao){
            System.out.println("La so doi xung!");
        }else{
            System.out.println("Khong phai so doi xung!");
        }
    }
}
