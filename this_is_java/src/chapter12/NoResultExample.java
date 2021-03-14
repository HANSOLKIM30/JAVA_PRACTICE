package chapter12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 리턴값이 없는 작업 완료 통보
public class NoResultExample {
	public static void main(String[] args) {
		
		// 스레드를 CPU 코어의 수만큼 가지는 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("[처리 결과] " + sum);
			}
		};
		
		/*
		 *  스레드 풀에 작업 처리 요청
		 *  → ExecutorService의 submit()메소드는 Runnalble, Callable을 구현한 작업을 스레드풀의 작업 큐에 저장하고,
		 *  → 즉시 Future객체를 리턴한다.
		 *  Future객체를 통해 다른 스레드에서 처리한 작업 결과를 또 다른 객체에 전달 가능하다.(스레드풀 → 메인스레드)
		 */
		Future future = executorService.submit(runnable);
		
		try {
			/*
			 * Future 객체는 작업이 완료될 때까지 기다렸다가(블로킹 되었다가) 작업이 완료되고, 최종 결과를 얻는 데 사용된다.
			 * Future의 get() 메소드는 Future객체에 어떤 값이 설정될 때까지 기다린다.
			 * → 이미 설정이 되어있다면 바로 반환, 설정이 되어있지 않다면 기다림.(블로킹)
			 * 따라서, 유연한 코드의 처리를 위해 get() 메소드를 호출하는 스레드는 새로운 스레드이거나, 스레드풀의 또 다른 스레드가 되어야 한다.
			 * 이 예제와 같이 main 스레드에서 이 작업을 실행하면 메인스레드의 다른 코드들이 실행되지 않는다.
			 */
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		/*
		 * 스레드 풀 종료하기
		 * 1. shutdown(): 작업 큐에 남아있는 작업까지 모두 마무리 후 종료
		 * 2. shutdownNow(): 작업큐의 작업 잔량과 관계없이 강제 종료
		 * 3. awaitTermination(long timeout, TimeUnit unit): 모든 작업 처리를 timeout 시간 안에 처리하면 true, 시간 안에 처리하지 못하면 강제종료 후, false 반환.
		 */
		executorService.shutdown();
	}
}
