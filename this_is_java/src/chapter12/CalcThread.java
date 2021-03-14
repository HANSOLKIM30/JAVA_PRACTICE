package chapter12;
// 작업 스레드
/*
 * 싱글코어: 동시성
 * 멀티코어: 병렬성(단, 멀티코어>스레드)
 * "동시성"일 경우 처리방법: 1. 우선순위 - 사용자 정의 가능. 2. 순환할당 - JVM 처리.
 */
public class CalcThread extends Thread{
	
	public CalcThread(String name) {
		// 스레드 이름 변경
		this.setName(name);
	}
	
	@Override
	public void run() {
		// 스레드가 실행할 내용
		for(int i = 0; i < 2000000000; i++) {
			
		}
		System.out.println(this.getName());
	}

}
