package chapter09;

// 중첩 클래스 객체 생성
public class Main {

	 public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 맴버 클래스 객체 생성
		A.B b = a.new B();	// a 객체를 통해 접근 가능
		b.field1 = 3;
		b.method1();
		
		// 정적 맴버 클래스 객체 생성
		A.C c = new A.C();	// a 객체를 생성하지 않아도 바로 접근 가능
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
