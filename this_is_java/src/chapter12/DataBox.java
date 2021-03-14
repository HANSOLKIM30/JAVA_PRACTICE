package chapter12;
// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 매체
public class DataBox {
	private String data;

	// 해당 모니터링 락은 메소드 실행이 종료되거나, wait()와 같은 메소드를 만나기 전까지 유지
	public synchronized String getData() {
		if(this.data == null) {
			try {
				System.out.println("소비자 스레드 일시정지");
				wait();	// 소비자 스레드를 일시정지 시킴.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("소비자 스레드 실행");
		String returnValue = this.data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		this.data = null;	// data 필드를 null로 만들고,
		notify();		// 생산자 스레드를 실행 대기 상태로 만듦.
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				System.out.println("생산자 스레드 일시정지");
				wait();	// 생산자 스레드를 일시정지 시킴.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("생산자 스레드 실행");
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + this.data);
		notify();	// 소비자 스레드를 실행 대기 상태로 만듦.
	}
}
