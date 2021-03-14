package chapter12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 작업 처리 결과를 외부 객체에 저장
public class ResultByRunnableExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		/*
		 * Result를 변수로 받아 Runnable 인터페이스를 구현한 객체를 생성하는 Task
		 */
		class Task implements Runnable{
			
			// 외부 Result 객체를 필드에 저장
			Result result;

			Task(Result result){
				this.result = result;
			}
			@Override
			public void run() {
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				result.addValue(sum);
			}			
		}
		// 두 가지 작업 처리를 요청
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		// 작업 처리 요청
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		
		// 두 가지 작업 결과를 취합
		try {
			// task1이 끝날 때까지 기다렸다가 result를 얻겠다는 뜻
			result = future1.get();
			// task2가 끝날 때까지 기다렸다가 result를 얻겠다는 뜻
			result = future2.get();
			System.out.println("[처리 결과]" + result.accmValue);
			System.out.println("[작업 처리 완료]");
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}

// 처리 결과를 저장하는 Result 클래스
class Result{
	int accmValue;
	// 동기화 처리를 통해 
	synchronized void addValue(int value) {
		accmValue += value;
	}
}
