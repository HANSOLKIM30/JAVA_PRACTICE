package chapter12;

public class ThreadA extends Thread{
	public ThreadA() {
		// 이름을 설정하기 전의 스레드 이름은 Thread-N 방식으로 설정됨.
		this.setName("ThreadA");	// 스레드 이름 설정.
	}
	
	@Override
	public void run() {
		// ThreadA 실행내용
		for(int i = 0; i < 2; i++) {
			System.out.println(this.getName() + "가 출력한 내용.");	// 스레드 이름 얻기
		}
	}
}
