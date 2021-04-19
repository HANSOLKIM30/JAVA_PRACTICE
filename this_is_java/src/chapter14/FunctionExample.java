package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	);
	
	// Fuction 인터페이스를 대입
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {	// list에 저장된 수만큼 루핑
			// 람다식 실행
			System.out.println(function.apply(student));	// Student -> String
		}
		System.out.println();
	}
	
	// Fuction 인터페이스를 대입
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			// 람다식 실행
			System.out.println(function.applyAsInt(student));
		}
	}
	
	public static void main(String[] args) {
				
		System.out.println("[학생 이름]");
		// Fuction 인터페이스 function의 익명 구현 객체
		printString(t -> { 
				return t.getName();
			} 	
		);
		
		// return 및 중괄호 생략 가능
		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());	// ToIntFunction 인터페이스 function의 익명구현객체
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());	// ToIntFunction 인터페이스 function의 익명구현객체
	}
}
