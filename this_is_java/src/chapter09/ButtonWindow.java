package chapter09;

public class ButtonWindow {

	ButtonAnonymous button1 = new ButtonAnonymous();
	ButtonAnonymous button2 = new ButtonAnonymous();
	
	// 필드 초기값으로 대입
	ButtonAnonymous.OnClickListener listener = new ButtonAnonymous.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");	
		}
	};
	
	//생성자
	ButtonWindow(){
		// 매개값으로 필드 대입
		button1.setOnClickListener(listener);
		// 매개값으로 익명 구현 객체 대입
		button2.setOnClickListener(new ButtonAnonymous.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
				
			}
		});
	}
}
