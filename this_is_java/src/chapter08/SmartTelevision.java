package chapter08;

// 다중 인터페이스 구현 객체
// 하나의 객체에 다중 인터페이스를 구현할 경우, 모든 인터페이스의 추상메소드를 구현해야한다. 하나라도 구현하지 않으면 abstract 선언 필요.
public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	// Searchable 인터페이스의 객체
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	// RemoteControl 인터페이스의 객체
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}

	
}
