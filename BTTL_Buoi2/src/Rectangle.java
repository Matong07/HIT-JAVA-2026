
public class Rectangle {
    private Double Dai;
    private Double Rong;

    public Rectangle(double Dai,double Rong){
        this.Dai = Dai;
        this.Rong = Rong;
    }

    public boolean  Ktra(){
        if(Dai < 0 || Rong <0){
            return false;
        }
        return true; 
    }
     
    public double Chuvi(){
        double P = (Dai + Rong) * 2;
        return P;
    }
    public double  Dientich(){
        double S = Dai * Rong;
        return S;
    }
}

