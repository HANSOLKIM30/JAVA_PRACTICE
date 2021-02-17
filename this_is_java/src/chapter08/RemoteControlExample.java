package chapter08;

// 인터페이스 변수에 구현 객체 대입
public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 추상메소드 구현 및 구현객체 대입(Television)
		RemoteControl rc = null;	// 인터페이스 변수 선언
		rc = new Television();	// 구현 객체 대입
		rc.turnOn();	// 인터페이스의 turnOn(), turnOff() 호출
		rc.turnOff();
		
		// 디폴트 메소드
		rc.setMute(true);
		
		// 추상메소드 구현 및 구현객체 대입(Audio)
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		// 디폴트 메소드(오버라이딩)
		rc.setMute(true);
	}
}
