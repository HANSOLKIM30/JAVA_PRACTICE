package chapter14;

// 매개 변수와 리턴값이 없는 람다식
public class MyFuctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 람다식: 하나의 추상 메서드를 가지고 있는 인터페이스를 통해 익명 객체 구현
		// 추상 메서드를 구현함과 동시에, 익명 객체 생성 
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();
		
		// 실행문이 하나라면, 중괄호 {}는 생략 가능
		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
