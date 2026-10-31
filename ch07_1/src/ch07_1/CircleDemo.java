package ch07_1;

class Circle{
	double radius; //인스턴스 필드      // 필드 수 2
	static int numOfCircles = 0; // 정적변수
	
	public Circle(double radius) {
		this.radius = radius;
		numOfCircles ++ ;
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		System.out.println("The number of circles : " + Circle.numOfCircles);

	}
	
	void print() {
		System.out.println("ststic member");
	}

}
