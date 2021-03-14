package chapter12;

public class WaitNotifyExample {
	public static void main(String[] args) {
		
		WorkObject sharedObject = new WorkObject();	// 공유 객체 생성
		
		WorkObjectThreadA threadA = new WorkObjectThreadA(sharedObject);
		WorkObjectThreadB threadB = new WorkObjectThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
		
	}
}
