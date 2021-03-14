package chapter13;
// 제네릭 타입 이용
public class BoxExample {
	public static void main(String[] args) {
		/*
		 * 비제네릭 타입
		 * Box box = new Box(); box.set("홍길동"); // String → Object (자동 타입 변환) String
		 * name = (String)box.get(); // Object → Stirng (강제 타입 변환)
		 * 
		 * box.set(new Apple()); // Apple → Object (자동 타입 변환) Apple apple = (Apple)
		 * box.get(); // Object → Apple (강제 타입 변환)
		 */	
		
		// 객체 생성 시에 타입 파라미터에 원하는 타입을 넣어주기
		Box<String> box1 = new Box<String>();
		box1.set("Hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);	// 자동 박싱
		int value = box2.get(); // 자동 언박싱	
	}
}
