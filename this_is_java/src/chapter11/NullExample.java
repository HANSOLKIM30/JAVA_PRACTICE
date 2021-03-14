package chapter11;

import java.util.Objects;

// null 여부 조사
public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요.");	// Supplier 구현 객체로 람다식 사용
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
