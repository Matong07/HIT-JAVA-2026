package objects;

public abstract class Manager {
	
	//Phương thức trừu tượng
	//Khai báo tham số đầu vào lớp đối tượng Cha ABC
	public abstract String getInfo(ABC a);
	
	//Phương thức tường minh
	public String getDetail(Person p) {
		return "super- "+this.getInfo(p);
	}
	
}
