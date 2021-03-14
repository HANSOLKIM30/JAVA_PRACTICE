package chapter12;
//무한 반복해서 출력하는 스레드
//stop() 메소드를 통해 스레드를 종료하면, 자원이 불안전한 상태로 남겨지게 됨. → stop 플래그를 통한 스레드 종료
public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printThread.setStop(true);
	}
}
