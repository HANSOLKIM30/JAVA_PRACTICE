package chapter12;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 작업 완료 순으로 통보받기
// 3개의 Callable 작업을 처리 요청하고 처리가 완료되는 순으로 작업의 결과값을 콘솔에 출력
public class CompletionServiceExample {
	public static void main(String[] args) {
		// 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		// Completion Service 생성
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

		System.out.println("[작업 처리 요청]");
		for (int i = 0; i < 3; i++) {
			// 스레드풀에게 3개의 Callable 작업 처리 요청
			completionService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i = 1; i <= 10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}

		System.out.println("[처리 완료된 작업 확인]");
		// future get메소드는 블로킹 메소드이므로, 해당 작업이 완료될 때까지 다른 모든 스레드는 정지됨. → 또 다른 새로운 스레드 또는, 새로운 스레드 풀에서 작업 실행할 것.
		executorService.submit(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						/*
						 *  완료된 작업 가져오기
						 *  take: 완료된 작업의 Future를 가져옴. 완료된 작업이 없다면, 있을 때까지 블로킹됨.
						 *  poll: 완료된 작업의 Future를 가져옴. 완료된 작업이 없다면, Null을 리턴.
						 */				
						Future<Integer> future = completionService.take();
						int value = future.get();	
						System.out.println("[처리 결과] " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});
		
		// 3초 후 스레드풀 종료
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		executorService.shutdown();
	}
}
