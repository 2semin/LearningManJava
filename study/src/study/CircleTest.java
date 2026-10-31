package study;

class Circle{
	double radius;
	String color;
	final double PI = 3.14; // 1. 다
	static int numOfCircles = 0;
	
	Circle(){
		this(10); // 1.가, 나 
	}
	
	Circle(double radius){
		this.radius = radius;
		numOfCircles++;
	}
	
	Circle(double radius, String color){ // 2. 가, 나
		this.radius = radius;
		this.color = color;
		numOfCircles++;
	}
	
	double getRaidus() { // 2. 다
		return this.radius;
	}
	
	void setRadius(double radius) { // 2. 다
		this.radius =radius;
	}
	
	String getColor(){
		return this.color;
	}
	
	double findArea() { // 2. 라
		return PI * radius* radius;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	double findCircumference() { // 2. 라
		return 2 * PI * radius;
	}
	
	boolean sameCircle(Circle other) { //3. 가
		if(other == null) {
			return false; //3. 나
		}
		
		return (this.radius == other.radius) && (this.color != null && this.color.equals(other.color));
	}
	
	void show() { //4. 가
		System.out.println("색: " + color + " , 반지름 " + radius);
	}
}

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("작동 테스트");
		Circle c1 = new Circle(15.5, "빨강");
		c1.show();
		System.out.println("넓이: " + c1.findArea()); 
		System.out.println("둘레: " + c1.findCircumference());
		
		Circle c2 = new Circle(15.5, "빨강");
		Circle c3 = new Circle(15.5, "파랑");
		
		System.out.println("c1 과 c2 비교: ");
		if(c1.sameCircle(c2)) { // 5. 가
			System.out.println("같은 원입니다.");
		}
		else {
			System.out.println("다른 원입니다.");
		}
		
		System.out.println("c2 과 c3 비교: ");
		if(c2.sameCircle(c3)) {
			System.out.println("같은 원입니다.");
		}
		else {
			System.out.println("다른 원입니다.");
		}

	}
}
