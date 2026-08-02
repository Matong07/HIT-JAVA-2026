package util;

/**
 * Lớp đối tượng thực hiện cài đặt một số thuật toán căn bản<br>
 * <i></i>Cập nhật 4/11/2022</i>
 *
 */
public class process {

	/**
	 * Phương thức thực hiện cài đặt thuật toán kiểm tra n<b> có phải nguyên tố</b>
	 * ? <br>
	 * <i></i>Cập nhật 4/11/2022</i>
	 * 
	 * @author T.Quyền
	 * @param n - giá trị cần kiểm tra
	 * @return - trả về khẳng định là nguyên tố đúng hay sai
	 */
	public static boolean isPrime(int n) {
		// Biến ghi nhận kết quả
		boolean flag = true;
		if (n < 2) {
			flag = false;
		} else {
			for (int v = 2; v <= (int) (Math.sqrt(n)); v++) {
				if (n % v == 0) {
					flag = false;
					break;
				}
			}
		}
		// Trả về kết quả
		return flag;

		/**
		 * Phương thức tìm UCLN của 2 giá trị nguyên dương<br>
		 * <i>Cập nhật ngày 4/11/2022</i>
		 * 
		 * @param a - giá trị thứ nhất
		 * @param b - giá trị thứ hai
		 * @return - UCLN tìm được
		 */
		
	}
	public static int getUCLN(int a, int b) {
		
		int ucln = -1;
		a = Math.abs(a);
		b = Math.abs(b);
		// Thuật toán tìm UCLN cách 1
		if (a * b != 0) {
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}

			ucln = a;// b
		}
		return ucln;
	}
	/**
	 * Tìm UCLN của 3 số nguyên dương
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int getUCLN(int a, int b, int c) {
		return process.getUCLN(process.getUCLN(a, b),c);
		
		
	}

	public static void main(String[] args) {
		// khởi tạo thể hiện lớp đối tượng
		//process p = new process();// Cấp phát bộ nhớ

		int a = (int) (Math.random() * 100);
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		// Kiểm tra
		//boolean isPrime = p.isPrime(a);

		// Thông báo
//		if (process.isPrime(a))/*(p.isPrime(a)) */{
//			System.out.println("a = " + a + " là số nguyên tố");
//		} else {
//			System.out.println("a = " + a + " không phải là số nguyên tố");
//		}
		
		//thông báo
		System.out.println("UCLN của a = "+a+ ", b = "+b+"và c = "+c+ "là: " + (process.getUCLN(a, b, c));
		

	}

}
