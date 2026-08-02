package objects;

public class StudentManager extends Manager {

	
	@Override
	//Bắt buộc
	public String getInfo(ABC a) {
		// TODO Auto-generated method stub
		return "SM: "+a.toString();//toString() của object
	}

}
