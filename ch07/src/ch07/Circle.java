package ch07;

class Circle {
	
	private double radius=10;
	String color;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double findArea(){

		return radius * radius * 3.14;
	}
	
	double getDiameter() {
		return 2 * radius;
	}
	
	
	Circle(double r) {
		this.radius = r;
		this.color = "blue";
	}
	
	Circle(double r,String c) {
		this.radius = r;
		this.color = c;
	}
	


}


