package chapter11;

// 문자열 비교
public class StringEqualsExample {

	public static void main(String[] args) {
		// ***따로 생성자 없이*** 단순히 ""를 통해 같은 문자열의 String 객체 생성 시, 같은 객체 참조.
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조.");
		} else {
			System.out.println("다른  String 객체를 참조.");
		}
		
		// 객체의 메모리 번지를 참조하는 Object.equeals()를 String Class에서 Override
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐.");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}
