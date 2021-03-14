package chapter14;
// 표준  API의 함수적 인터페이스: 한ㄱ 개의 추상 메소드를 가지는 인터페이스는 람다식을 이용하여 익명 구현 객체로 표현 가능
public class RunnableExample {
	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();		
	}
}
