package chapter10;

// 사용자 정의 예외 발생시키기: 특정 상황이 되었을 때 "throw"를 통해 예외를 발생시키고 프로그램의 흐름을 종료시킨다.
public class Account {
	
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		
		if(balance < money) {
			// 사용자 정의 예외 발생
			// throw를 통해 예외를 발생시킴. → 호출한 메소드에서 해당 예외처리하도록  throws로 넘겨줌
			throw new BalanceInsufficientException("잔고부족: " + (money - balance) + " 모자람.");
		}
		balance -= money;
	}

}
