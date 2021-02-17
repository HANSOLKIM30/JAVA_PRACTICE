package chapter08;

// 인터페이스 필드의 다형성 - Car 클래스의 필드 타입으로 사용된 Tire 인터페이스가 지니는 다형성
public class Car {
	
	Tire frontLeftTire = new HankookTire();	// Tire 인터페이스 타입의 필드 선언과 초기 구현 객체 대입
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();	// 인터페이스에서 설명된 roll() 메소드 호출
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
