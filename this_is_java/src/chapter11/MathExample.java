package chapter11;

public class MathExample {
	public static void main(String[] args) {
		// 절대값(int, double) / 최대값 / 최소값 / 반올림 을 제외한 Math 클래스의 메소드의 리턴 타입은 double
		// abs: 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);

		// ceil: 올림 / 리턴값이 double이어야 정상적인 처리 가능.
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);

		// floor: 버림 / 리턴값이 double이어야 정상적인 처리 가능.
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);

		// 최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);

		// 최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		// 0.0 <= Math.random < 1.0 사이의 랜덤값
		// 0.0이 포함되는 것이 포인트
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		
		// rint: 더 가까운 실수의 정수값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 = " + v12);
		System.out.println("v13 = " + v13);
		
		// round: 반올림 / 리턴타입 long
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 = " + v14);
		System.out.println("v15 = " + v15);
		
		// round 메소드는 항상 소수점 첫째 자리에서 반올림하므로, 원하는 소수 자리수에서 반올림된 값을 얻기 위해서는 *10^n 계산 후 다시 /10^n 처리.
		// 셋째 자리에서 반올림하는 예제
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16 = " + v16);
	}
}
