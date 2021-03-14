package chapter12;
// 1초 주기로 save() 메소드를 호출하는 데몬 스레드
/* 
 * 주 스레드가 종료되면 데몬 스레드도 함께 종료됨.
 * 스레드를 시작하기 전에 setDaemon(true)로 데몬스레드 만들기 → start 이후 설정 시, 오류 발생.
 * 스레드가 데몬스레드인지 알아보기 위해 isDaemon() 메소드로 조사 가능.
 */
public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				break;
			}
			save();
		}	
	}
}
