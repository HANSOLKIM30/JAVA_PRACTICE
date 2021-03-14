package chapter15;

import java.util.*;


// ArrayList와 LinkedList의 성능 비교
public class LinkedListExample {
	public static void main(String[] args) {
		/*
		 *  LinkedList는 인접 참조를 링크해서 체인처럼 관리
		 *  중간에 추가, 또는 삭제할 경우 앞 뒤의 링크 정보만 변경하면 되기 때문에 더 빠르다.
		 */
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + " ns");
		
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + " ns");
	}
}
