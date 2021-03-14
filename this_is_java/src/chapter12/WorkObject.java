package chapter12;

// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체
public class WorkObject {

	// 스레드A가 작업할 내용
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); // 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦.
		try {
			wait(); // ThreadA를 일시정지 상태로 만듦. 메소드 종료
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 스레드B가 작업할 내용
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify(); // 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦.
		try {
			wait(); // ThreadB를 일시정지 상태로 만듦. 메소드 종료
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
