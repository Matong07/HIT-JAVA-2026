package objects;

public class Employee extends Person {

	// contant
	public static final int EM_NET = (int) 0;
	public static final String EM_POSITION = "VT 0";
	public static final short EM_APPLY_YEAR = (short) 0;

	// objects's properties
	private int em_net; //thu nhập
	private String em_position;// Vi tri
	private short em_apply_year;//Năm làm việc

	// contructor
	public Employee() {
		this(Employee.FIRSTNAME, Employee.LASTNAME, Employee.AGE, Employee.ADDRESS, Employee.EM_NET,
				Employee.EM_POSITION, Employee.EM_APPLY_YEAR);
	}

	public Employee(String firstName, String lastName, byte age, Address address, int em_net, String em_position,
			short em_apply_year) {
		// Khởi tạo lớp cha
		super(firstName, lastName, age, address);
		// khởi tạo lớp con
		this.em_net = em_net;
		this.em_position = em_position;
		this.em_apply_year = em_apply_year;
	}
	

	public int getEm_net() {
		return em_net;
	}

	public String getEm_position() {
		return em_position;
	}

	public short getEm_apply_year() {
		return em_apply_year;
	}

	public void setEm_net(int em_net) {
		this.em_net = em_net;
	}

	public void setEm_position(String em_position) {
		this.em_position = em_position;
	}

	public void setEm_apply_year(short em_apply_year) {
		this.em_apply_year = em_apply_year;
	}

	@Override
	public String toString() {
		return "Employee ["+super.toString()+"+em_net=" + em_net + ", em_position=" + em_position + ", em_apply_year=" + em_apply_year + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo 
		Address addr = new Address("Tuyên Quang", "Chiêm Hóa", "Tri phú");
		//
		Person e1 = new Employee("Quyền", "Ma Thế",(byte)19,addr,(int)12, "Vị trí 21",(short)2);
		
		Employee e = new Employee();
		e.setFirstName("Quyền");
		e.setLastName("Ma Thế");
		e.setAge((byte)19);
		e.setEm_net((int)12);
		e.setEm_position("Vị Trí 9");
		e.setEm_apply_year((short)2);
		//In thông tin
		System.out.println(e);
		System.out.println(e1);
	}

}
