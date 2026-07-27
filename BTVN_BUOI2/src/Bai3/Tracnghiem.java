package Bai3;
import java.util.Random;
import java.util.Scanner;

public class Tracnghiem {
    private int a;
    private int b;
    private int c;

    public Tracnghiem(int a, int b,int c){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    public void Questions(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Phep tinh duoi day dung hay sai!");
        a = rand.nextInt(101);
        b = rand.nextInt(101);
        c = rand.nextInt(201);
        System.out.println(a + "+"+b+ "="+ c);
        System.out.println("Dung / Sai");
        String D = sc.nextLine();
        if((a+b) == c && D.equals("Dung")){
            System.out.println("Ban da tra loi dung");
        }else{
            if ((a+b) == c &&  D.equals("Sai")) {
                System.out.println("Ban chua tot nghiep cap 1 ==> ve hoc lai tu lop 1");
            } else {
                if((a+b) != c &&  D.equals("Dung")){
                    System.out.println("Ban chua tot nghiep cap 1 ==> ve hoc lai tu lop 1");
                }else{
                    System.out.println("Ban da tra loi dung");
                }
            }
        }
        sc.close();
    }
}
    