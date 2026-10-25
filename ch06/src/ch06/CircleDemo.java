package ch06;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle();
		
		myCircle.setRadius(10.0);
		
		myCircle.show(myCircle.getRadius(), myCircle.findArea());

	}

}
/* 클래스 선언 */
class Circle{
	private double radius; // 캡슐화
	
	// 접근자
	public double getRadius() {
		return radius;
	}
	
	//설정자
	public void setRadius(double r) {
		radius = r;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %f, 넓이 = %f\n", x, y);
	}
}
