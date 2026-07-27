package Bai5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrInput = new int[n];
        for (int i = 0; i < n; i++) {
            arrInput[i] = sc.nextInt();
        }

        DayNui dayNuiCuaToi = new DayNui(arrInput);

        int ketQua = dayNuiCuaToi.demSoDinhNui();
        System.out.println(ketQua);

        sc.close();
    }
}

