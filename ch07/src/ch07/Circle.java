package ch07;

class Circle {
	private  double radius;
	private String color;
	static int numOfCircles = 0;
	int  numCircles = 0;
	
    Circle(double r)
    {
    	radius = r;
    	numOfCircles++;
    	numCircles = numOfCircles;

    }
    
    Circle(double r, String c){
    	this(r);
    	color = c;
    }
	 
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double findArea(){
		double result;
		
		result = Math.PI  * radius * radius;
		return result;	
	}
	
	double getDiameter() {
		double result;
		
		result = 2 * radius;
		return result;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}

