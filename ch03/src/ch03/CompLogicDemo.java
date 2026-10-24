package ch03;

public class CompLogicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- <1));
		
		System.out.println("x= " + x + ", y= " + y );
		x = 0;
		y = 1;
		System.out.println( (y-- <1)); // false
		System.out.println( " ---연산 후 " + y); //false

	}

}
