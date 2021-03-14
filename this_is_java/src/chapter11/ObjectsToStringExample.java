package chapter11;

import java.util.Objects;

// 객체 문자 정보
public class ObjectsToStringExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		// 그대로 "null"을 리턴하거나, 두번째 매개변수를 리턴
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
	}
}
