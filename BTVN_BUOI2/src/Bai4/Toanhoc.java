package Bai4;

public class Toanhoc {
    
    private int a;
    private int b;
    private int c;

    public Toanhoc(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void timVaInTrungVi() {
        int trungVi = (a > b) ? ((a < c) ? a : ((b > c) ? b : c)) : ((a > c) ? a : ((b < c) ? b : c));

        System.out.println(trungVi);
    }
}