package chapter12;
/*
 * ***1. Runnable 인터페이스 구현*** → Thread 객체 생성 시, Runnable 인터페이스 타입의 객체가 매개변수로 사용됨.
 * 2. Thread 상속
 */
public class BeepPrintExample2 {
	// 메인스레드
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);	// Thread 객체 생성 시, Runnable 인터페이스 타입의 객체가 매개변수로 사용됨.
		thread.start(); // 반드시 start 메소드를 통해 스레드 실행.
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
