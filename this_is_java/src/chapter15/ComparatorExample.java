package chapter15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		
		/*
			TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
			// Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생.
			treeSet.add(new Fruit("포도", 3000));
			treeSet.add(new Fruit("수박", 10000));
			treeSet.add(new Fruit("딸기", 6000));
		*/
		
		/* 
		 * 1. 사용자 정의 객체가 Comparable 인터페이스를 구현 -> Person
		 * 2. 생성자에 Comparator 인터페이스를 구현한 객체 
		 */
		 TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		 treeSet.add(new Fruit("포도", 3000));
		 treeSet.add(new Fruit("수박", 10000));
		 treeSet.add(new Fruit("딸기", 6000));
		 
		 Iterator<Fruit> iterator = treeSet.iterator();
		 while(iterator.hasNext()) {
			 Fruit fruit = iterator.next();
			 System.out.println(fruit.name + ": " + fruit.price);
		 }
	}
}
