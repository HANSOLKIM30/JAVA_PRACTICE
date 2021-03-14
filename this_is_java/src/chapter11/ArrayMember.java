package chapter11;

// 배열항목 정렬: sort()의 사용자 정의 구현을 위한 Comparable 구현클래스
public class ArrayMember implements Comparable<ArrayMember> {

	String name;

	ArrayMember(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(ArrayMember o) {

		// String(name)의 compareTo 리턴값을 사용하여 유니코드 비교.(오름차순)
		return this.name.compareTo(o.name);
	}
}
