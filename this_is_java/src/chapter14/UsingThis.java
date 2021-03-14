package chapter14;

// 람다식의 this: 익명객체 자체의 this X -> 람다식을 호출한 객체를 의미
public class UsingThis {

	public int outterField= 10;
	
	class Inner {
		// 필드
		int innerField = 20;
		// 메소드                                                                                                                                                                                                                                                                                                                                                                                            
		void method() {
			// 람다식 - 익명 객체 구현
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				// 바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
