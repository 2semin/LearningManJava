class Triangle{
	private double height;
	private double width;
	String color;
	static int numOfTriangles = 0;
	
	
	Triangle(double height, double width) {
		this.height = height;
		this.width = width;
		numOfTriangles++;
	}
	Triangle(String color) {
		this.color = color;
		numOfTriangles++;
	}
	
	double getArea() {
		return (this.height * this.width )/ 2;
		
	}
	
	public void setHeigth(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	boolean isSameArea(Triangle t) {
		double area1 = t.getArea();
		double area2 = (this.width * this.height) / 2;// 자신의 삼각형 넓이
//		double area2 = getArea();
		if(area1 == area2)
			return true;
		else
			return false;
	}
		
	
}
	
	