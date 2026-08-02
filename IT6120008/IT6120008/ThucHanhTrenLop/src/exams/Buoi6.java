package exams;

public class Buoi6 {

	public static void main(String[] args) {
		//Ngẫu nhiên số nguyên trong khoảng từ [0-100)
		int n = (int)(Math.random()*100);
		//Vì kiểu.random là kiểu số thực nên muốn in kiểu số nguyên ta phải ép kiểu
		//Ngẫu nhiên số thực trong khoảng từ [0-100)
		double m = Math.random()*100;
		//In ra màn hình
		System.out.println("n = "+n);
		System.out.println("m = " +m);
		System.out.println("Giá trị của m + n =" + (m + n));
		
		//Kiểu số nguyên và số thực
		int i = 5;
		float f;
		f = i;
		System.out.println("i = " +i+",f = "+f);
		f = 5.86f; i = (int)f;
		System.out.println("i = "+i+ ",f = "+f);
		//Không ép kiểu
		System.out.println("6/4 = " +6/4);
		//Khi trong phép tính có kiểu số thực thì kiểu nguyên không có tác dụng
		System.out.println("6/4 = "+(float)6/4);
		System.out.println(6/(float)4);
		System.out.println(6.0/4);
		
		int i1 = 5, j1 = 10;
		int k = 0;
		System.out.println("i = "+i1+", j = "+j1+" k, = "+k);
		++i1;j1++;
		System.out.println("i = "+i1+", j = "+j1+ ", k = "+k);
		k = ++i1 + j1++;
		System.out.println("i = "+i1+", j = "+j1+ ", k = "+k);
		
		
	}

}
