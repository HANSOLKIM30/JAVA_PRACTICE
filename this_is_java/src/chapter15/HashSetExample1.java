package chapter15;

import java.util.*;

/*
 *  String 객체를 중복 없이, 순서 없이 저장하는 HashSet
 *  HashSet은 순서 X -> 인덱스 X
 *  따라서, get(index) X
 *  원하는 객체를 얻기 위해서는 iterator 이용.
 */
public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBatis");
		
		// 저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		// 반복자 얻기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();	// 한 개의 객체 가져오기
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBatis");
		
		size = set.size();
		System.out.println("총 객체 수: " + size);
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();	// 한 개의 객체 가져오기
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
