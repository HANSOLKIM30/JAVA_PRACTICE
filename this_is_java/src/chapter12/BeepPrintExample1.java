package chapter12;

import java.awt.Toolkit;
// 스레드가 없을 때: 비프음 발생 → "띵" 출력(동시 실행되지 않음.)
public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	// Toolkit 객체 얻기.
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생.
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
