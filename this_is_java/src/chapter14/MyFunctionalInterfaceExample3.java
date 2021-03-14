package chapter14;

public class MyFunctionalInterfaceExample3 {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		// 실행문에 return문 하나인 경우, 중괄호 {}와 return문 생략 가능.
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		// 실행문에 return문 하나인 경우, 중괄호 {}와 return문 생략 가능.
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
		
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}
