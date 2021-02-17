package chapter09;

// 버튼의 클릭이벤트 처리(익명 구현 객체): UI 클래스
public class ButtonAnonymous {

	// 인터페이스 타입 필드
	OnClickListener listner;
	
	// 매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listner = listener;
	}
	
	// 구현 객체의 onClick 메소드 호출
	void touch() {
		this.listner.onClick();
	}
	
	// 중첩 인터페이스 
	interface OnClickListener {
		void onClick();
	}
}
