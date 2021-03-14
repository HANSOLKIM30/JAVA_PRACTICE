package chapter12;

import java.awt.Toolkit;

/*
 * 1. Runnable 인터페이스 구현
 * ***2. Thread 상속***
 */
public class BeepThread extends Thread{
	@Override
	public void run() {
		// 스레드 실행 내용
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
}
