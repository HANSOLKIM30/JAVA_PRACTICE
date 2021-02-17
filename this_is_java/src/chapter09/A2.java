package chapter09;

// 바깥 필드와 메소드에서 사용 제한
public class A2 {
	// 인스턴스 맴버 클래스는 반드시 바깥 클래스의 객체가 생성되어야 생성가능하므로, 객체 생성 없이 사용 가능한 바깥 클래스의 static 맴버 및 메소드에서는 객체를 생성할 수 없다.
	
	// 바깥 클래스의 인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
	// static B field3 = new B();
	static C field4 = new C();
	
	// 정적 메소드
	static void method2() {
		// B var1 = new B();
		C var2 = new C();
	}
	
	// 인스턴스 맴버 클래스
	class B{}
	// 정적 맴버 클래스
	static class C{}
}
