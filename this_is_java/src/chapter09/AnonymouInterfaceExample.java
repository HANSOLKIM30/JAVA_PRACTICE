package chapter09;

// 익명 구현 클래스와 객체 생성
public interface AnonymouInterfaceExample {

	public static void main(String[] args) {
		AnonymousInterface anony = new AnonymousInterface();
		// 익명 객체 필드 사용
		anony.field.turnOn();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});
	}
}
