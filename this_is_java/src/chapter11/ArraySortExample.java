package chapter11;

import java.util.Arrays;

// 배열 비교 및 정렬: sort
public class ArraySortExample {
	public static void main(String[] args) {

		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		Arrays.toString(scores);
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}
		System.out.println();
		
		ArrayMember m1 = new ArrayMember("홍길동");
		ArrayMember m2 = new ArrayMember("박동수");
		ArrayMember m3 = new ArrayMember("김민수");
		ArrayMember[] members = {m1, m2, m3};
		Arrays.sort(members);	// 사용자 정의 정렬: comparable 인터페이스 구현을 통해 compare 메서드 정의해야 실행 가능
		for(int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		}
	}
}
