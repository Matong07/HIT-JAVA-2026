package Baitap1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Lion("Nâu đất","To lớn","Thịt Động Vật","Châu Phi", "4 chân", "Nhiệt đới",true);
		Feline f = new Lion("Nâu đất","To lớn","Thịt Động Vật","Châu Phi", "4 chân", "Nhiệt đới",true);
		Animal a1 = new Cat("Vàng","Nhỏ","Chuột","Mọi nơi trên trái đất","Biết bắt chột","Mát mẻ",true);
		Feline f1 = new Cat("Vàng","Nhỏ","Chuột","Mọi nơi trên trái đất","Biết bắt chột","Mát mẻ",true);
		Animal a2 = new Tiger("Vàng, cam", "To lớn","Thịt","Châu Á","Có nhiều sọc đen","Đồng bằng",true);
		Feline f2 = new Tiger("Vàng, cam", "To lớn","Thịt","Châu Á","Có nhiều sọc đen","Đồng bằng",true);
		
		Animal a3 = new Hippo("Đen","To lớn","Thực Vật","Dưới Nước và Trên Cạn");
		
		Canine c = new Wolf("Trắng","Trung bình", " Răng Nanh", "Sinh sản hữu tính","Bắc cực","Chó sói Bắc Cực");
		
		Canine c1 = new Dog("Đen, Nâu"," To lớn","Họ nhà chó", "Sinh sản hữu tính","Mông cổ","Chó Ngao Tây Tạng");
		
		System.out.println(a.Characteristic());
		System.out.println(a.Habitat());
		
		System.out.println(f.Characteristic());
		System.out.println(f.Habitat());
		System.out.println(f.Climb());
		
		System.out.println(a1.Characteristic());
		System.out.println(a1.Habitat());
		
		System.out.println(f1.Climb());
		
		System.out.println(a2.Characteristic());
		System.out.println(a2.Habitat());
		System.out.println(f2.Climb());
		
		System.out.println(a3.Characteristic());
		System.out.println(a3.Habitat());
		System.out.println(a3);
		
		System.out.println(c.Characteristic());
		System.out.println(c.Habitat());
		System.out.println(c);
		
		System.out.println(c1.Characteristic());
		System.out.println(c1.Habitat());
		System.out.println(c1);
	}

}
