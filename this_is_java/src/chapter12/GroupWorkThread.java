package chapter12;

// InterruptedException이 발생할 때 스레드가 종료되도록 함.
public class GroupWorkThread extends Thread{
	// 스레드 그룹과 스레드 이름을 설정
	// 스레드 그룹을 지정하지 않으면 현재 스레드가 속한 하위 그룹으로 생성됨.
	public GroupWorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(this.getName() + " interrupted");
				break;
			}
		}
		System.out.println(this.getName() + " 종료됨.");
	}
	
	
}
