package chapter13;

import java.util.Arrays;

// 와일드 타입 매개 변수
public class WildCardExample {
	
	// <?> → Person, Worker, Student, HighStudent
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.toString(course.getStudents()));
	}
	
	// <?> → Student, HighStudent
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.toString(course.getStudents()));
	}
	
	// <?> → Worker, Person
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		/* 
		 * 생성자를 통해 타입 파라미터를 정하는 과정에서는, 하위 객체와 호환되지 않음.
		 * Worker가 Person을 상속받고 있다고 해서, Course<Worker>가  Course<Person>을 상속받고 있는 것은 아님.
		 * Course<Worker>와 Course<Person>는 Object를 상속받는 완전히 다른 객체.
		 * → 많은 사람들이 헷갈리는 사항.
		 */
		 
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		// 타입 파라미터가 Person으로 결정된 상황. → Person을 상속하는 하위 클래스을 파라미터로 넣어도 OK.
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudent = new Course<HighStudent>("고등학생과정", 5);
		highStudent.add(new HighStudent("고등학생"));
		
		// 모든 과정 등록 가능
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudent);
		System.out.println();
		
		// Course<? extends ...> 자기 자신과, 자기 자신을 상속받는 클래스의 객체만 등록 가능. → 학생 과정만 등록 가능.
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudent);
		System.out.println();
		
		// Course<? super ...> 자기 자신과, 자기 자신이 상속받는 클래스의 객체만 등록 가능. → 일반인 및 직장인 과정만 등록 가능.
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
	}
}
