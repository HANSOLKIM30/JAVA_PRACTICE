package chapter11;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			
			counter = null;	// counter 객체를 쓰레기로 만듦.
			
			System.gc(); // Garbage Collector 호출
		}
	}
}
