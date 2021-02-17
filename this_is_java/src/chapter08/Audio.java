package chapter08;

public class Audio implements RemoteControl {

	// 필드
	private int volume;
	// 인터페이스 디폴트 메소드의 재정의를 위한 필드 선언
	private boolean mute;
	
	// 인터페이스를 구현한 클래스는 반드시 인터페이스에서 선언한 추상 메소드의 실체 메소드를 구현해야 한다. 
	// 아니면 선언부에 abstract 선언을 하여 추상 클래스로 만들어야 함.
	
	// turnOn() 추상메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");		
	}

	// turnOff() 추상메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	// setVolume() 추상메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		
		// 인터페이스 상수를 이용해서 volume 필드의 값을 제한
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨: " + volume);
	}
	
	// 인터페이스의 디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
}
