package chapter15;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet, TreeMap 모두 정렬을 위해 Comparable 인터페이스를 구현한다. 
// Comparable 인터페이스를 구현한 Person 객체를 TreeSet, TreeMap을 통해 나이 순서대로 정렬
public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// **********저장될 때 나이 순으로 정렬됨.**********
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		// 왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 반복해서 가져오기(오름차순)
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ": " + person.age);
		}
	}
}
