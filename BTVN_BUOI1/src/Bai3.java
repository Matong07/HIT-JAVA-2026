
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        String mk;
        System.err.printf("Nhap mat khau: ");
        mk = sc.nextLine();
        mk = mk.trim();
        int dem = mk.length();
        if(dem < 8){
            System.err.printf("Mat khau khong hop le%n");
            System.out.print("mat khau phai co tu 8 ki tu tro len!!");
            return;
        }
        boolean so = false;
        boolean cvh =false;
        for(int i = 0;  i < dem; i++){
            char tam = mk.charAt(i);
            int ascii = (int)tam;
            if (ascii >= 48 && ascii <= 57 ) {
                so =true;
            }
            if(ascii >= 65 && ascii <= 90){
                    cvh =true;
                }
        }
        if(so == false){
            System.out.println("Mat khau khong hop le!");
            System.out.println("Khau khau phai chua it nhat 1 chu so");
            return;
        }
        if (cvh == false) {
            System.out.println("Mat khau khong hop le!");
            System.out.println("Mat khau phai chua it nhat mot chu cai in hoa");
            return; 
        }
        System.out.println("Mat khau hop le!");
    }
}
