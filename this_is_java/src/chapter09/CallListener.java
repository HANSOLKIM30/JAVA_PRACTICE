package chapter09;

// Button의 중첩클래스 OnClickListener 인터페이스의 구현 클래스 
public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
