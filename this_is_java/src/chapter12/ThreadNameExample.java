package chapter12;
// 메인 스레드 이름 출력 및 UserThread 생성 및 시작
public class ThreadNameExample {
	public static void main(String[] args) {
		/*
		 *  setName, getName은 Thread의 인스턴스 메소드 → 객체 필요.
		 *  객체가 없다면 currentThread 정적 메소드를 통해 참조 가능.
		 */
		
		Thread mainThread = Thread.currentThread(); 	// 이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());	// 스레드 이름 얻기
		
		ThreadA threadA = new ThreadA();	// ThreadA 생성
		System.out.println("작업 스레드 이름: " + threadA.getName()); 	// 스레드 이름 얻기
		threadA.start();	// ThreadA 시작
		
		ThreadB threadB = new ThreadB();	// ThreadB 생성
		System.out.println("작업 스레드 이름: " + threadB.getName()); 	// 스레드 이름 얻기
		threadB.start();	// ThreadB 시작
	}
}
