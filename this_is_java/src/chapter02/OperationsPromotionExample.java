package chapter02;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2;	컴파일 에러:연산 시. int형으로 변형되어 계산
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;	컴파일 에러:연산 시. int형으로 변형되어 계산
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� = " + intValue2);	
		System.out.println("��¹��� = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0;	컴파일 에러:연산 시. int형으로 변형되어 계산
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}
}
 