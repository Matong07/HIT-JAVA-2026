package objects;

public class Worker extends Person {

	// object's
	private String worker_id;// Mã CV
	private String worker_name;// Tên công việc

	public Worker() {

	}

	public Worker(String firstName, String lastName, byte age, Address address, String worker_id, String worker_name) {
		super(firstName, lastName, age, address);
		// TODO Auto-generated constructor stub
		this.worker_id = worker_id;
		this.worker_name = worker_name;
	}

	public String getWorker_id() {
		return worker_id;
	}

	public String getWorker_name() {
		return worker_name;
	}

	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}

	public void setWorker_name(String worker_name) {
		this.worker_name = worker_name;
	}

	@Override
	public String toString() {
		return "Worker ["+super.toString()+"worker_id=" + worker_id + ", worker_name=" + worker_name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w = new Worker();
		w.setFirstName("Vinh");
		w.setLastName("Hứa Quang");
		w.setAge((byte)19);
		w.setWorker_id("Worker 355");
		w.setWorker_name("Sửa chữa ô tô");
	}

}
