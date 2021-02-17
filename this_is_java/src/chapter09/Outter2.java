package chapter09;
// 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter2 {

	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-field");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter2.this.field);	// 바깥 클래스 객체명 + this → 바깥 클래스 참조 얻기
			Outter2.this.method();
		}
	}
}
