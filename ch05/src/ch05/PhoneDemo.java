package ch05;

class Phone {
	String model;
	int value;
	
	void print() {
		System.out.println(value + " 만원 " + model + "폰");
	}

}

public class PhoneDemo { 
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		
		myPhone.model = "Galaxy S8";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "Galaxy G6";
		yourPhone.value = 85;
		yourPhone.print();
		
		Phone friendPhone = new Phone();
		friendPhone.model = "Iphone 17";
		friendPhone.value = 127;
		friendPhone.print();
		
		
	}
}
