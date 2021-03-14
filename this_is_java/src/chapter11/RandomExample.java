package chapter11;

import java.util.Arrays;
import java.util.Random;

// 로또 번호 얻기
public class RandomExample {
	public static void main(String[] args) {
		/* 0.0 ~ 1.0 사이의(0.0 포함) double 밖에 리턴값을 갖지 못하는 Math.random()과 달리,
		 * 1. Random은 여러 리턴 타입을 가지고, 2. 씨드를 통해 같은 난수를 얻을 수 있다.  
		 */ 
		
		// 선택번호
		int[] selectNumber = new int[6];	// 선택 번호 6개 저장될 배열 생성
		Random random = new Random(3);	// 선택 번호를 얻기 위한 Random 객체 생성, 매개값의 종자값이 설정된다.
		System.out.print("선택 번호: ");
		for(int i = 0; i < 6; i++) {
			// random.nextDouble: 0.0 <= ~ < 1.0
			// random.nextInt(): 2^31 <= ~ <= 2^31-1
			// random.nextInt(int n): 0 <= ~ < n 사이의 난수를 리턴
			// random.nextInt(45): 0 ~ 44 사이의 난수를 리턴
			selectNumber[i] = random.nextInt(45) + 1;	// 1 ~ 45 사이의 난수를 리턴
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨번호
		int[] winningNumber = new int[6]; 	// 당첨번호 6개가 저장될 배열 생성
		/* 생성자의 씨드를 같게하면 동일한 난수가 나온다. */
		random = new Random(5);
		System.out.print("당첨 번호: ");
		for(int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨 여부
		// 비교 전 정렬
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);	// 배열의 항목 값 비교
		if(result) {
			System.out.println("1등에 당첨되었습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
