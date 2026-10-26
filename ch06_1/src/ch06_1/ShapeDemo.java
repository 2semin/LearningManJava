package ch06_1;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		c1.radius = 10;
		System.out.println(c1.findArea());
		
		r1.width = 5;
		r1.height = 10;
		System.out.println(r1.findArea());
		
		

	}

}
