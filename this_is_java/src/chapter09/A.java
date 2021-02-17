package chapter09;

// 중첩클래스
/*바깥 클래스*/
class A {

	A(){
		System.out.println("A 객체가 생성됨.");
	}
	
	/* 인스턴스 맴버 클래스 */
	class B {
		B(){
			System.out.println("B 객체가 생성됨.");
		}
		int field1;
		void method1() {}
		/* 인스턴스 맴버 클래스에는 static 맴버 및 메소드 선언 불가 */
		// static int field2;
		// static void method2() {}
	}
	
	/* 정적 맴버 클래스 */
	static class C {
		C(){
			System.out.println("C 객체가 생성됨.");
		}
		int field1;
		void method1() {
			
		}
		static int field2;
		static void method2() {}
	}
	
	/* 로컬 클래스 */
	void method() {
		class D {
			D(){
				System.out.println("D 객체가 생성됨.");
			}
			int field1;
			void method1() {
				
			}
			/* 로컬 맴버 클래스에는 static 맴버 및 메소드 선언 불가 */
			//static int field2;
			//static void method2() {}
		}
		// 메소드 내부에서만 사용되므로, 접근제한자 사용 불가
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
