package chapter12;

public class ThreadB extends Thread{

	public ThreadB() {
		// 이름을 설정하기 전의 스레드 이름은 Thread-N 방식으로 설정됨.
		this.setName("ThreadB");	// 스레드 이름 재설정
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(this.getName() + "가 출력한 내용.");
		}
	}
}
