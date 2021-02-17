package chapter09;
// 맴버 클래스에서 사용 제한
public class A3 {
	
	// 객체가 생성되어야 사용되는 일반 필드 및 메소드에는 static 클래스에서 접근 불가능함.
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	// 인스턴스 맴버 클래스는 모든 필드와 메소드에 접근 가능할 수 있다.
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	// 정적 맴버 클래스 내부에서 인스턴스 필드와 메소드에는 접근할 수 없다.
	static class C{
		void method() {
			// field1 = 10;
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
