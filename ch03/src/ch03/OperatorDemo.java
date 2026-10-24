package ch03;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 1;
		byte b2 = 2;
		
		// b1 + b2라는 연산의 결과는 값은 3이지만 그 값이 저장된 저장소의 크기는 4bype이다.
		//byte b3 = b1 +  b2;
		
		//강제형(타입 변환)
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);

	}

}
