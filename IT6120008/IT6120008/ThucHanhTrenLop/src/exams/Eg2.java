package exams;

public class Eg2 {
		//TODO Auto-generated method stub
		
		//Sinh ngẫu nhiên chỉ trong mảng của kiểu dữ liệu liệt kê
		byte index = (byte)(Math.random()*Size.values().length);
		
		//Lấy ra giá trị
		Size s = Size.values()[index];
		
		//Hiển thị
		swich(s) {
			case XSMAll:
				System.out.println("Kích thước rất nhỏ");
				break;
			case SMALL:
				System.out.println("Kích thước nhỏ");
				break;
			case MEDIUM:
				System.out.println("Kích thước trung bình");
				break;
			case LARGER:
				System.out.println("Kích thước lớn");
				break;
			case XLARGER:
				System.out.println("Kích thước rất lớn");
				break;
			case XXLARGER:
				System.out.println("Kích thước vô cùng lớn");
				break;
		}
	}
