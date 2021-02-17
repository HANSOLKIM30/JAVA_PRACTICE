package chapter10;

// 사용자 정의 예외 클래스
public class BalanceInsufficientException extends Exception{

	/* 
	 * 필드, 메소드, 생성자 모두 선언 가능. 
	 * 생성자는 주로 2가지로 선언.
	 * 1. 기본생성자.
	 * 2. 예외 발생 원인을 전달하기 위해 String을 매개변수로 받아 상위 클래스에 전달하는 생성자.
	 */
	
	// 기본생성자
	public BalanceInsufficientException() {
		
	}
	
	//예외 발생 원인을 전달하기 위해 String을 매개변수로 받아 상위 클래스에 전달하는 생성자
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
