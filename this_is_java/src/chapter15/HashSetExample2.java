package chapter15;

import java.util.*;

// Memeber 객체를 중복없이 저장하는 HashSet
public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// 인스턴스는 다르지만, 내부 데이터가 동일하므로 객체 1개만 저장. -> Member 객체의 equal 및 hashCode 오버라이딩.
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		// 저장된 객체 수 얻기
		System.out.println("총 객체 수: " + set.size());
	}

}
