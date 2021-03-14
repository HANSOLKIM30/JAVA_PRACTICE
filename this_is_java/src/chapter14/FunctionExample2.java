package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	);
	
	// ToIntFunction(객체 -> int) 인터페이스를 매개변수로 사용
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			// 람다식 실행
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(t -> t.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg(t -> {
			return t.getMathScore();
		});
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
