package chapter11;

import java.util.Arrays;

// 배열 복사
public class ArrayCopyExample {

	public static void main(String[] args) {
		/*
		 * copyOf: 인덱스 0부터 복사할 길이만큼 복사한 타겟 배열을 리턴 
		 * copyOfRange: 시작인덱스, 끝 인덱스 지정(끝 인덱스는 포함되지 않음.)
		 * 단순히 배열을 복사하기 위함이라면 System.arrayCopy 이용
		 */
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		// 방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);	// arr1 전체를 arr2로 복사.
		System.out.println(Arrays.toString(arr2));
		
		// 방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);	// arr[1]~arr[2]를 arr3[0]~arr3[1]로 복사.
		System.out.println(Arrays.toString(arr3));
		
		// 방법3
		char[] arr4 = new char[arr1.length];
		// System.arraycopy(원본배열, 원본시작인덱스, 타겟배열, 타겟시작인덱스, 복사개수);
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);	// arr1 전체를 arr4로 복사
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
	}
}
