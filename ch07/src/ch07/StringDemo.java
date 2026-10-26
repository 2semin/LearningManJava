package ch07;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello, Java";
		String s2 = s1;
		
		System.out.println(s1 == s2);
		
		String s3 = new String("Hello, JavA"); // 출력때 32가 뜨는 이유는 소문자 a와 대문자 A의 유니코드는 32차이나기 때문이다
		System.out.println(s1 == s3);
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.equals(s3));
	}

}
