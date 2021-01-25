package chapter06;

public class Account {
	
	final static int MIN_BALANCE = 0;	//*final 필드는 객체마다 저장되고, 생성자의 매개값을 통해 여러가지 값을 가질 수 있음. --> final static이 상수인 이유.
	final static int MAX_BALANCE = 1000000;
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
		
	public Account() {
	}
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
}
