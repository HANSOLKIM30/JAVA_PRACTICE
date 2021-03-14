package chapter11;

import java.util.Arrays;

// 배열 검색: binarySearch()
public class ArraySearchExample {

	public static void main(String[] args) {
		// 기본 타입값 검색
		int[] scores = {99, 97, 98};
		// binarySearch를 통해 검색하기 전, sort를 통해 오름차순 정렬(필수)
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);
		
		// 문자열 검색
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스: " + index);
		
		ArrayMember m1 = new ArrayMember("홍길동");
		ArrayMember m2 = new ArrayMember("박동수");
		ArrayMember m3 = new ArrayMember("김민수");
		ArrayMember[] members = {m1, m2, m3};
		Arrays.sort(members);	// 사용자 정의 정렬: comparable 인터페이스 구현을 통해 compare 메서드 정의해야 실행 가능
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
	}
}
