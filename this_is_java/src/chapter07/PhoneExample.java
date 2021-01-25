package chapter07;

public class PhoneExample {

	public static void main(String[] args) {
		
		// Phone phone = new Phone(); new 생성자로 abstract Class를 생성할 수 없음.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		// Phone의 메소드
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
}
