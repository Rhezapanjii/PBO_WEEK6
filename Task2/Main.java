package Task2;

public class Main {

	public static void main(String[] args) {
		Square kotak = new Square(15);
		System.out.println(kotak.toString());
		
		Circle lingkaran = new Circle(14);
		lingkaran.setColor("Blue");
		System.out.println(lingkaran.toString());
	}

}