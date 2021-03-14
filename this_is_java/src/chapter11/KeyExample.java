package chapter11;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용하여 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별 키 "new Key(1)"로 "홍길동"을 저장함.
		hashMap.put(new Key(1), "홍길동");
		
		// 식별 키 "new Key(1)"로 "홍길동"을 불러옴. hashCode() → equals() 과정을 거쳐 불러옴.
		// 오버라이딩 이전의 Object hashCode() 메소드는 각 객체의 메모리 주소값을 이용하여 "객체 해시코드" 정수값을 생성함.
		// 따라서, 객체가 서로 달라도 논리적으로 동등할 때의 객체들을 불러오기 위해서는 hashCode()를 오버라이딩해야 함.
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
