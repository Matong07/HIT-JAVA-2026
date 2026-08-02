package ontap3;

import java.util.*;

public class MyArray {

	public static int[] generateArray(int n) {
		// Khai báo mảng trung gian
		int[] arrInt = new int[n];

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		return arrInt;
	}
	public static Employer[] generateEmployer(int n) {
		//khai báo mảng trung gian
		Employer[] listEmployer = new Employer[n];
		
		//Khai báo danh sách firstName
		String[] firstName = {"Quyền","Thảo", "Hà", "Độ"," Phong"};
		//lastName
		String[] lastName = {"Ma Thế", "Nguyễn Thanh", "Trần Thanh", "Vũ Văn"};
		
		//Sinh dữ liệu
		int index;
		for(int i = 0;i < listEmployer.length;i++) {
			//cấp phát bộ nhớ
			listEmployer[i] = new Employer();
			
			//Sinh ngẫu nhiên firstName
			index = (int)(Math.random()*firstName.length);
			listEmployer[i].setFirstName(firstName[index]);
			//Sinh ngẫu nhiên lastName
			index = (int)(Math.random()*lastName.length);
			listEmployer[i].setLastName(lastName[index]);
			//Sinh ngẫu nhiên day
			index = (int)(Math.random()*30 + 1);
			listEmployer[i].setBirthDay(null);
			
		}
		return null;
	}
}
