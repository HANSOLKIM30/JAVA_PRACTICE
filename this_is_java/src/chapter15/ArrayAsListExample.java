package chapter15;

import java.util.Arrays;
import java.util.List;

// Arrays.asList() 메소드: 고정된 객체들로 구성된 List 생성 → 고정되었기 때문에, 새로운 데이터를 추가하거나, 데이터 사이에 add하거나, 기존데이터를 remove하는 것은 불가능
public class ArrayAsListExample {
	public static void main(String[] args) {
		/*
		 *  Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴한다.
		 *  이 정적 클래스는 java.util.ArrayList와는 다른 클래스이다.
		 *  java.util.Arrays.ArrayList는 set() - 수정 / get() - 참조번지 가져오기 / contain() - 포함하는지 확인의 메서드를 가지고 있지만,
		 *  사이즈를 바꿀 수 없기 때문에 요소를 추가(add)하거나 삭제(remove)하는 메서드는 없다. 
		 */		
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name : list1) {
			System.out.println(name);
		}
		System.out.println();
		
		List<Integer>list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
