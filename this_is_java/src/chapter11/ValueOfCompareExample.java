package chapter11;

// 포장 객체 비교
/*
 * 언박싱하여 비교하거나, equal() 메소드를 통해 비교하여야 한다.
 * 단, 자바에서 규정한 boolean, char, int의 특정 값이라면 ==, !=을 통해 비교가능하다.
*/
public class ValueOfCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과 값인 경우]");
		Integer obj1 = 300;	// 자동 박싱
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));	// false
		System.out.println("언박싱 후 ==결과: " + (obj1.intValue() == obj2.intValue()));		//true
		System.out.println("equals() 결과: " + obj1.equals(obj2));	//true
		
		System.out.println("[-128~127 범위 값인 경우]");
		Integer obj3 = 10;	// 자동 박싱
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));	//true
		System.out.println("언박싱 후 ==결과: " + (obj3.intValue() == obj4.intValue()));	//true
		System.out.println("equals() 결과: " + obj3.equals(obj4));	//true
	}
	
}
