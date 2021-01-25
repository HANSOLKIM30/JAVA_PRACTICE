package chapter06;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("------------------------------");
			System.out.print("선택> "); 
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {	//배열의 크기를 이미 100으로 선언하였으므로, for문 실행은 100번. null값 체크로, null을 만나면 반드시 break. 아니면 null인 나머지 배열까지 만나서 nullpointexception 발생.
				break;
			} else {
				String ano = accountArray[i].getAno();
				String owner = accountArray[i].getOwner();
				int balance = accountArray[i].getBalance();
				
				System.out.println(ano + "   " + owner + "   " + balance);
			}
			
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 없습니다.");
		} else {
			System.out.print("예금액: ");
			int deposit = scanner.nextInt();
			int balance = account.getBalance();
			account.setBalance(balance + deposit);
			System.out.println("예금이 성공되었습니다.");
		}	
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 없습니다.");
		} else {
			System.out.print("출금액: ");
			int deposit = scanner.nextInt();
			int balance = account.getBalance();
			if(deposit > balance) {
				System.out.println("예금액보다 많은 금액을 출금할 수 없습니다.");
			} else {
				account.setBalance(balance - deposit);
				System.out.println("출금이 성공되었습니다.");
			}			
		}		
	}
	
	private static Account findAccount(String ano) {
		Account account = null;		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			} else {
				break;
			}
		}
		return account;		
	}
}
