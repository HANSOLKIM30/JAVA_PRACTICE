package chapter12;
// 타겟 스레드의 상태를 출력하는 스레드
public class StatePrintThread extends Thread{
	
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {	// 매개변수: 상태를 조사할 스레드
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = this.targetThread.getState();	// 스레드 상태 얻기
			System.out.println("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) {	// 객체 생성 상태일 경우, 실행 대기 상태로 만듦.
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;	// 종료 상태일 경우 while문을 종료함.
			}
			
			try {
				Thread.sleep(500);	//0.5초간 일시정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
