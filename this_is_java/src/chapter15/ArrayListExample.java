package chapter15;

import java.util.*;

// String 객체를 저장하는  ArrayList
public class ArrayListExample {
	public static void main(String[] args) {
		// List 인터페이스를 구현하는  ArrayList
		List<String> list = new ArrayList<String>();
		
		// String 객체를 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		// 저장된 총 객체 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		// 2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		// 저장된 총 객체 수만큼 루핑
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i +": " + str);
		}
		System.out.println();
		
		// 2번 인덱스 객체(Database) 삭제
		list.remove(2);
		// 2번 인덱스 객체(Servlet/JSP) 삭제
		list.remove(2);
		list.remove("iBatis");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i +": " + str);
		}
	}
}
