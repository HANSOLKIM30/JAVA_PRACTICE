package chapter08;


public interface RemoteControl {
	// 상수 필드 선언: 따로 public static final 선언하지 않아도, 컴파일 과정에서 붙게됨.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상메소드 선언: 따로 public abstract 선언하지 않아도, 컴파일 과정에서 붙게됨.
	// 호출 방법만 기술하면, 해당 메소드는 객체에서 재정의되어 실제로 실행됨.
	public void turnOn();
	public void turnOff();
	public void setVolume(int volum);
	
	// 디폴트 메소드 선언: 따로 public 선언하지 않아도, 컴파일 과정에서 붙게됨.
	// 실제로는 구현객체에서 실행되기 때문에, 선언은 인터페이스에서 하지만 구현객체가 지니는 "인스턴트 메소드"라고 생각해도 무방하다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메소드 선언: 따로 public 선언하지 않아도, 컴파일 과정에서 붙게됨.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
