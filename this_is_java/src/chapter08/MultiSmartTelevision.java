package chapter08;

// 다중 인터페이스 구현 클래스
// 다중 인터페이스를 구현한 클래스는 각 인터페이스의 모든 추상메서드를 구현해야 한다.
public class MultiSmartTelevision implements RemoteControl, Searchable{
	private int volume;
		
	// RemoteControl 인터페이스의 추상 메소드에 대한 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
			
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
	
	// Searchable 인터페이스의 추상 메소드에 대한 실체 메소드
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
