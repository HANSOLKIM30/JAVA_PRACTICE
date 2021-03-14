package chapter11;

import java.util.Objects;

// 해쉬코드 생성
public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));		// 매개변수 Object의 해시코드 값 리턴
	}
	
	// 정적 맴버 클래스
	static class Student{
		int sno;
		String name;

		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);	// hash: 매개값으로 주어진 값들을 이용해서 해시 코드를 생성. 동일한 필드값을 가지는 객체는 동일한 해쉬코드를 가질 수 있다.
		}
	}
}
