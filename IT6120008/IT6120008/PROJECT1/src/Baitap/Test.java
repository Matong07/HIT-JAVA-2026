package Baitap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometric c = new Circle("red", true, 5);
		Geometric r = new Rectangle("blue", true, 10, 25);
		
		
		System.out.println(c);
		System.out.println(c.findPerimeter());
		
		System.out.println(r.findArea());
		System.out.println(r.findPerimeter());
	}

}
