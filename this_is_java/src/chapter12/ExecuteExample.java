package chapter12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// execute() 메소드로 작업 처리 요청한 경우
public class ExecuteExample {
	public static void main(String[] args) throws InterruptedException {
		// 최대 스레드 개수가 2개인 스레드풀 생성
		/*
		 * Executor.newCachedThreadPool: 
		 * 초기 스레드 수: 0 / 코어 스레드 수: 0 / 최대 스레드 수: Integer.MAX_VALUE
		 * 스레드 개수보다 작업 개수가 많으면 새로운 스레드를 생성하여 작업을 처리한다.
		 * 일 없이 60초 동안 아무 일을 하지 않는 스레드는 종료시키고 스레드풀에서 제거한다.
		 * 
		 * Executor.newFixedThreadPool(int nThreads)
		 * 초기 스레드 수: 0 / 코어 스레드 수: nThreads / 최대 스레드 수: nThreads
		 * 일 없이 놀고 있어도 스레드를 제거하지 않고 내버려 둔다.
		 */
		//ExecutorService executorService = Executors.newFixedThreadPool(2);
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		// 스레드 풀에 10번의 작업을 지시
		for(int i = 0; i < 10; i++) {
			// 작업 정의
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					// 스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor =  (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
					
					// 예외 발생시킴
					int value = Integer.parseInt("삼");
				}
			};
			
			//  작업 처리 요청
			/* 
			 * execute: 예외 발생 시, 스레드를 종료하고 해당 스레드는 스레드풀에서 제거된다. 스레드풀은 다른 작업 처리를 위해 새로운 스레드를 생성한다.
			 * submit: 예외 발생하더라도 스레드는 종료되지 않고 다음 작업에서 재사용 된다. 
			 */
			//executorService.execute(runnable);
			executorService.submit(runnable);
			
			Thread.sleep(10);	// 콘솔에 출력 시간을 주기 위해 0.01초 일시 정지 시킴.
		}
		
		executorService.shutdown();
	}
}
