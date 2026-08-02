package Exam;


public class Example1 {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//Sinh ra ngẫu nhiên chỉ số trong mảng của kiểu dữ liệu liệt kê
		byte index = (byte)(Math.random()*Sizes.values().length);
		
		//Lấy ra giá trị
		Sizes s = Sizes.values()[index];
		
		//Hiển thị
		switch(s) {
			case XSMALL:
				System.out.println("Kích thước rất nhỏ");
				break;
			case SMALL:
				System.out.println("Kích thước nhỏ");
				break;
			case MEDIUM:
				System.out.println("Kích thước trung bình");
				break;
			case LARGE:
				System.out.println("Kích thước lớn");
				break;
			case XLARGE:
				System.out.println("Kích thước rất lớn");
				break;
			case XXLARGE:
				System.out.println("Kích thước vô cùng lớn");
				break;
				}
			}
}
