package ch06;

public class Circle {
	private int radius;
	private String color;
	
	Circle(int r){
		radius = r;
	}
	
	Circle(int r, String c){
		this(r);
		setColor(c);
	}
	
	double findArea() {
		double result;
		
		result = getRadius() * getRadius() * 3.14;
		return result;
	}
}
