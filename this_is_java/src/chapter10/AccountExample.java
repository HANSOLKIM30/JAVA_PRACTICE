package chapter10;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		// 출금하기
		// 해당 메서드에는 예외가 있음: try-catch 처리 혹은, throws로 콜러에서 처리
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			// 예외 메세지 얻기
			System.out.println(message);
			System.out.println();
			// 예외 추적 후 출력
			e.printStackTrace();
		}
	}
}
