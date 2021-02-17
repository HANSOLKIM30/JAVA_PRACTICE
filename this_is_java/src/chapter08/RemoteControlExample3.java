package chapter08;

// 정적 메소드 사용.
// 구현 객체가 필요한 추상메소드, 디폴트메소드와 달리 인터페이스를 통해 바로 호출 가능
public class RemoteControlExample3 {
	public static void main(String[] args) {
		RemoteControl.changeBattery();
	}
}
