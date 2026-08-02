package Exam;

public class Eg3 {
	public static void main(String[] args) {
		int i = 5, j = 10;
		int k = 0;
		System.out.println("i = " +i + ", j = "+j+ ", k = "+k);
		++i; j++;
		System.out.println("i = " +i + ", j = "+j+ ", k = "+k);
		k = ++i + j++;
		System.out.println("i = " +i + ", j = "+j+ ", k = "+k);
		k+= --k;
		System.out.println("i = " +i + ", j = "+j+ ", k = "+k);
	}

}
