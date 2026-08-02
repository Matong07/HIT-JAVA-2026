package objects;

//Khai báo
//Tầm nhìn truy cập <public| private .. > <options> <int|float|..>[]<name>=new<int|float|....>[size];
//Tầm nhìn truy cập <public| private .. > <options> <int|float|..><name>[]=new<int|float|....>[size];
/**
 * ví dụ : int[] arrInt = new int[100]; float[] arrFoat = new float[100];Mảng nguyên thủy
 * String[] = arrStr = {"a", "abc", "abcd", "efgh"};Mảng đối tượng
 * 
 * Dạng 2:
 * double arrDouble[] = new double[15]; // Mảng nguyên thủy
 * Person list[] = new Person[20]; //mảng đối tượng
 * Address addrs[] = null; //Mảng đối tượng, không được xác định kích thước và giá trị
 * @author Thế Quyền
 *
 */
public class MyArrays {
	/**
	 * Sinh ngẫu nhiên các giá trị cho mảng 1 chiều với n phần tử
	 * 
	 * @param n - số phần tử
	 * @return - trả về mảng 1 chiều giá trị nguyên trong phạm vi 100
	 */
	public static int[] generateArray(int n) {
		int[] arrInt = new int[n];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (Math.random() * 100);
		}
		return arrInt;
	}

	public static void printArray(int[] arrInt) {
		for (int value : arrInt) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Sinh mảng
		int[] arrInt = MyArrays.generateArray(20);

		// In ra màn hình
		MyArrays.printArray(arrInt);
	}
}
