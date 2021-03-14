package chapter11;

// String 생성자 직접 사용하기: 바이트 배열을 문자열로 전환
public class ByteToStringExample {

	public static void main(String[] args) {
		
		// 아스키 코드
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}
}
