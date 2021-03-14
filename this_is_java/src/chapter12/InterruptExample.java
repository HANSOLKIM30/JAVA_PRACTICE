package chapter12;
//무한 반복해서 출력하는 스레드
//stop() 메소드를 통해 스레드를 종료하면, 자원이 불안전한 상태로 남겨지게 됨. → interrupt 메소드를 통한 스레드 종료
public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();	// PrintThread2 실행. "실행 중" 출력 후, 1초 sleep
		
		try {
			Thread.sleep(1000);	// main Thread. 1초 휴식
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();	// interrupt 발생 →  PrintThread2에서 미래에 일시 정지 상태가 되면 예외처리.
	}
}
