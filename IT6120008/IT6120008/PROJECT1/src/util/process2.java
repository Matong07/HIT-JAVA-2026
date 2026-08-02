package util;

public class process2 {
	/**
	 * Thực hiện phép toán nhân hoặc chia tùy điều kiện<b>
	 * @author Quyền HG
	 * @param t giá trị cần tìm
	 * @param a số nguyên a
	 * @param b số nguyên b
	 * @return trả về giá trị nhân hoặc chia
	 */
		public static int getPhepnhan( int a, int b) {
			int t;
			if(a >= b) {
				System.out.println("a >= b");
				t = a * b;
			}else {
				System.out.println("a < b");
				t = a / b;
			}
			return t;
		}
	public static void main(String[] args) {
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		System.out.println("giá trị của a = "+a+" b = "+b+" = "+process2.getPhepnhan(a, b));

	}

}
