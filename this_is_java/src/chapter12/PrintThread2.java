package chapter12;
// 1초 후 출력 스레드를 중지시킴.
// sleep을 통해 interrupt 예외처리를 한 후, while문 break 후 종료.
// interrupted / isInterrupted 메소드를 통해 while문 break 후 종료.
public class PrintThread2 extends Thread {

	/* @Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Catch InterruptedException");

		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}*/
	
	@Override
	public void run() {
		while (true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {	//mainThread에서 현재 스레드에 interrupt()가 호출되었는지 확인.
				break;
			}	
		} 
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}