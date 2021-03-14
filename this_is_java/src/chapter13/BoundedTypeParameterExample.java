package chapter13;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String str = Util.compare("a", "b");
		// String은 Number 타입이 아니므로, 올 수 없음.
		
		int result1 = Util.compare(10, 20);	// int → Integer 자동 박싱
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); // double → Double 자동 박싱
		System.out.println(result2);
		
	}
}
