package ch05;

class Phone {
	String model;
	int value;
	String number;
	
	void print() {
		System.out.println(value + " 만원 " + model + " 폰 " + number);
	}

}

public class PhoneDemo { 
	public static void main(String[] args) {
		
		// 객체 생성과 참조변수
		Phone myPhone = new Phone();
		
		myPhone.model = "Galaxy S8";
		myPhone.value = 100;
		myPhone.number = "01013579122";
		myPhone.print();
		
		
		Phone yourPhone = new Phone();
		yourPhone.model = "Galaxy G6";
		yourPhone.value = 85;
		yourPhone.number = "01098765432";	
		yourPhone.print();
		
		
		Phone friendPhone = new Phone();
		friendPhone.model = "Iphone 17";
		friendPhone.value = 127;
		friendPhone.number = "01012345678";
		friendPhone.print();
		
		
		
	}
}
