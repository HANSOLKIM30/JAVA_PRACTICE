package chapter15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		// 내림차순 정렬된 NavigableMap 객체 리턴
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		// descendingMap()을 두번하면 오름차순으로 변경
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> acsendingEntrySet = ascendingMap.entrySet();	// keySet() 메서드를 통해, 엔트리의 키를 호출한 뒤, get(key)를 통해 값을 가져올 수도 있음.
		for(Map.Entry<Integer,String> entry : acsendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	} 
}
