package chapter12;

import java.awt.Toolkit;
// 3초 주기로 10번 비프음 발생
public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000); 	// 3초 동안 메인스레드를 일시 정지 상태를 만듦.
			} catch (InterruptedException e) {
			}
		}		
	}
}
