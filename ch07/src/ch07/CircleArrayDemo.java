package ch07;

public class CircleArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle [] circles;
		circles = new Circle[5];
		
		for(int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i+1);
			
		}
		for(int i = 0; i < circles.length; i++) {
			System.out.println(circles[i].findArea());
		}

	}

}
