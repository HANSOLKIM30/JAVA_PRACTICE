package chapter11;

import java.util.Comparator;
import java.util.Objects;

// 비교자 사용
public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparartor());
		System.out.println(result);
	}
	
	// 정적 맴버 클래스(p.396)
	// static 클래스 → 바깥 클래스 - 필드 및 메서드 어디서나 사용 가능. 
	// 인스턴스 클래스  → 바깥 클래스 - 인스턴스 필드 및 메서드에서만 사용 가능. 
	static class Student {
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	// 정적 맴버 클래스
	static class StudentComparartor implements Comparator<Student>{
		
		@Override
		public int compare(Student o1, Student o2){
			/*
			 * if(o1.sno < o2.sno) { return -1; } 
			 * else if(o1.sno > o2.sno) { return 0; }
			 * else { return 1; }
			 */
			return Integer.compare(o1.sno, o2.sno);
		}
	}

}

