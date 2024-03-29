package chapter14;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 최대값 얻기
		// IntBinaryOperator 인터페이스 operator의 추상메소드 applyAsInt를 구현함으로서 익명구현객체 생성
		int max = maxOrMin((a,b)->{
			if(a >= b) {
				return a;
			} else {
				return b;
			}
		});
		System.out.println("최대값: " + max);
		
		// 최소값 얻기
		// IntBinaryOperator 인터페이스 operator의 추상메소드 applyAsInt를 구현함으로서 익명구현객체 생성
		int min = maxOrMin((a,b) -> {
			if(a <= b) {
				return a;
			} else {
				return b;
			}
		});
		
		System.out.println("최소값: " + min);
	}
}
