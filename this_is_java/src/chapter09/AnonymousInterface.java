package chapter09;

// 익명 구현 클래스와 객체 생성
public class AnonymousInterface {

	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	// 로컬 변수 값으로 대입
	public void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
	
		//로컬 변수 사용
		localVar.turnOn();
	}
	
	// 매개값으로 사용
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
