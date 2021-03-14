package chapter13;
// 제네릭 타입
public class Course <T>{

	private String name;
	private T[] students;	// 타입 파라미터 타입의 배열
	
	public Course(String name, int capacity) {
		this.name = name;
		/* 
		 * 타입 파라미터로 배열을 생성한다면, 
		 * new T[] 형태로 배열을 생성할 수 없고,
		 * (T[]) (new Object[n]) 형태로 생성해야 한다.
		 */
		this.students = (T[]) new Object[capacity];	
	}
	
	public String getName() {
		return this.name;
	}
	
	public T[] getStudents() {
		return this.students;
	}
	
	// 배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
