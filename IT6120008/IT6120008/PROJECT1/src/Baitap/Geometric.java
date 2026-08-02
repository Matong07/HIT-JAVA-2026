package Baitap;

public abstract class Geometric {

	// object's
	private String colour;// Làm màu
	private boolean filedin;
	
	public abstract double findArea();
	public abstract double findPerimeter();
	
	public Geometric() {

	}

	public Geometric(String colour, boolean filedin) {
		this.colour = colour;
		this.filedin = filedin;
	}

	
	public String getColour() {
		return colour;
	}

	public boolean isFiledin() {
		return filedin;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setFiledin(boolean filedin) {
		this.filedin = filedin;
	}

	@Override
	public String toString() {
		return "Geometric [colour=" + colour + ", filedin=" + filedin + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

	}

}
