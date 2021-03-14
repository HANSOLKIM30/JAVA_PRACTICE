package chapter12;
// 무한 반복해서 출력하는 스레드
// stop() 메소드를 통해 스레드를 종료하면, 자원이 불안전한 상태로 남겨지게 됨. → stop 플래그를 통한 스레드 종료
public class PrintThread1 extends Thread{
	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
