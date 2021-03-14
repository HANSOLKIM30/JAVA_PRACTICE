package chapter12;

public class YieldExample {
	public static void main(String[] args) {
		ThreadYieldA threadA = new ThreadYieldA();
		ThreadYieldB threadB = new ThreadYieldB();
		
		// threadA, threadB 모두 실행.
		threadA.start();
		threadB.start();
		
		// 메인 스레드 3초 동안 sleep.
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = false;	// threadB만 실행.
		
		// 메인 스레드 3초 동안 sleep.
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA.work = true;	// threadA, threadB 모두 실행.
		
		// threadA, threadB 모두 종료.
		threadA.stop = true;
		threadB.stop = true;
	}
}
