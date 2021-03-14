package chapter14;

public class MyFunctionalInterfaceExample2 {
	public static void main(String[] args) {
		MyFunctionalInterface2 fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> {
			System.out.println(x*5);
		};
		fi.method(2);
		
		// 매개변수가 하나일 때는 괄호 생략 가능
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
}
