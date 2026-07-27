package Bai2;

public class Palindrome {
    private String chuoi;
    
    public Palindrome(String chuoi){
        this.chuoi = chuoi;
    }

    public boolean  Ktra (String chuoi){
        boolean palindrome = true;
        for (int i = 0; i < (chuoi.length()/2 - 1); i++){
            if(chuoi.charAt(i) != chuoi.charAt(chuoi.length()-1-i)){
                 palindrome =false;
                 break;
            }
        }
        return palindrome;
    }

    public void Conversion(String chuoi){
        if(Ktra(chuoi)== true){
            System.out.println(chuoi.toUpperCase());
            System.out.println("Chuoi nay doi xung!");
        }else{
            System.out.println(chuoi.toLowerCase());
            System.out.println("Chuoi nay khong doi xung");
        }
    }
}

