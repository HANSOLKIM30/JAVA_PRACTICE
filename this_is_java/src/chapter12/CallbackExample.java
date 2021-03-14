package chapter12;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 콜백 방식의 작업 완료 통보받기
public class CallbackExample {
	
	// 필드 - 스레드풀
	private ExecutorService executorService;
	
	// 생성자 - 스레드풀 객체 생성
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}
	
	/*
	 * ExectionService는 콜백을 위한 별도의 기능을 제공하지 않음.
	 * → Runnable 구현 클래스 작성 시, 콜백 기능을 구현해야 함.
	 * → 콜백 기능을 구현하기 위한 콜백 메소드를 가진 클래스는 직접 정의할 수도 있고, CompletionHandler를 사용할 수 도 있음.
	 */
	// 콜백 메소드를 정의한 CompletionHandler 익명 구현 객체 생성
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {

		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행: " + result);
		}

		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() 실행: " + exc.toString());
		}
	};
	
	// Callback Handler를 이용한 작업 내용 정의
	public void doWork(final String x, final String y) {
		// 작업 내용이 담겨있는  Runnable 익명 구현 객체 생성
		Runnable task = new Runnable() {

			// 작업 내용에서 callback 기능 구현
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);
				} catch(NumberFormatException e) {
					callback.failed(e, null);
				}
			}	
		};
		executorService.submit(task);
	}
	
	// 스레드풀 종료
	public void finish() {
		executorService.shutdown();
	}
	
	public static void main(String[] args) {
		CallbackExample example = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "삼");
		example.finish();
	}
}
