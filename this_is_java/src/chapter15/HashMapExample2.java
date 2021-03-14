package chapter15;

import java.util.*;

// 학번과 이름이 동일한 경우 같은 키로 인식
public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 학번과 이름이 동일한 Student를 Key로 저장
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		// 저장된 Map.Entry 수 얻기
		System.out.println("총 Entry 수: " + map.size());
	}
}
