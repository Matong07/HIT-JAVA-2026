
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int S = 0;
        int C = 1;
        for(int i = 1; i <= n; i++){
            C *= i;
            if(i % 2 ==0){
                S +=i;
            }
        }
        System.out.println("n! = "+ C );
        System.out.println("Tong : "+S);

    }
}
