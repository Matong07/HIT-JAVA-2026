public class Bankaccount {
    private double balance ;
    
    public Bankaccount (double balance){
        this.balance =  balance;
    }
    public void Nhap(double Guitien){
        this.balance = Guitien + this.balance;
        System.out.println("So du tai khoan: "+this.balance);
    }
}

