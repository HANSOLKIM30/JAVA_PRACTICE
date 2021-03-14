package chapter12;

// 메인 스레드가 실행하는 코드
public class MainThreadExample {
	public static void main(String[] args) {
		/* User 스레드가 Calculator 객체의 memory 필드에 100을 먼저 저장하고 2초간 일지 정시 상태가 된다.
		 * 그 동안에, User2 스레드가 memory 필드 값을 50으로 변경. 
		 * 2초가 지난 후에 User1 스레드가 다시 실행 상태가 되어 memory 필드의 값을 출력하면 User2가 저장한 50이 나온다.
		 */
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();	// User1 스레드 생성
		user1.setCalculator(calculator);	// 공유 객체 생성
		user1.start();	// User1 스레드 시작
		
		User2 user2 = new User2();	// User2 스레드 생성
		user2.setCalculator(calculator);	// 공유 객체 생성
		user2.start();	// User2 스레드 시작
	}
}
