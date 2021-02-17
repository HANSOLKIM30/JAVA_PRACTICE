package chapter08;

// 익명 구현 클래스
public class RemoteControlExample2 {

	// 인터페이스를 익명 구현 클래스를 통해 실체화(객체화) 시킬 수 있다.
	// 한 번만 사용하고 말 클래스를 위해, 클래스를 선언하고 소스 파일 등을 생성하는 것은 비효율적이다. --> 인터페이스를 통해 익명 구현 객체를 생성함으로서 해결
	// 1. 자바의 UI 이벤트 / 2. 임시 작업 스레드 / 3. 람다식
	
	public static void main(String[] args) {
		// 인터페이스에 선언한 모든 추상 클래스들을 선언해야 한다. 
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volum) {
				// TODO Auto-generated method stub
				
			}
			
		};	// 실행문이기 때문에 반드시 ; 표시가 뒤에 붙어야 한다
	}
}
