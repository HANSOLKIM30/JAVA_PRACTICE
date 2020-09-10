package chapter06;

public class Singleton {

	private static Singleton singleton = new Singleton();	// 객체 생성. 외부에서 정적필드 singleton의 값을 함부로 변경하지 못하도록 private 선언.
	
	private Singleton(){};	// 외부에서 Singleton 객체를 함부로 생성하지 못하도록 private 선언.

	public static Singleton getInstance() {
		return singleton;	// 5줄에서 생성한 유일한 객체를 불러올 수 있는 유일한 정적 메소드.
	}
}
