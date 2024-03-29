package chapter15;

import java.util.TreeSet;

// 특정 객체 찾기
public class TreeSetExample {
	public static void main(String[] args) {
		// 객체를 찾거나, 범위 검색과 관련된 메소드를 사용하기 위해 Set -> TreeSet 사옹
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score);
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score);
		
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수: " + score);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ") ");
		}
	}	
}
