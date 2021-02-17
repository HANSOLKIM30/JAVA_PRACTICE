package chapter08;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		// 익명구현객체: 일회성의 구현객체를 만들 때, 구현객체를 따로 클래스로 선언하면 낭비이기에 익명구현객체로 선언.
		// 1. UI 2. 임시 스레드 3. 람다식 등에 사용
		action.work();
	}
}
