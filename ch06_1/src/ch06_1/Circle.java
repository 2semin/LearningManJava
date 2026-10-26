package ch06_1;

public class Circle {
	
	
	private double radius;// 필드
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	//Method
	double findArea(){
		double result = radius * radius * 3.14;
		return result;
		
	}

}
