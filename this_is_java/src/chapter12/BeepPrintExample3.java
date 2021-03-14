package chapter12;
/*
 * 1. Runnable 인터페이스 구현 
 * ***2. Thread 상속***
 */
public class BeepPrintExample3 {
	// 메인스레드
	public static void main(String[] args) {
		
		Thread thread = new BeepThread();	// Thread의 자식 객체를 통한 Thread 객체 생성.
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
