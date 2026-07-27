 package Bai1;
 
public class Circle {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double Perimeter(){
        double P = r * 2 * 3.14;
        return P; 
    }

    public double Acreage(){
        double A = Math.pow(r, 2) * 3.14;
        return A;
    }
}
