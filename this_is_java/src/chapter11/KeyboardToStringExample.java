package chapter11;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		
		// 읽은 바이트를 저장하기 위한 배열 생성
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		
		try {
			// 배열에 키보드로부터 읽은 바이트(아스키 코드)를 저장하고 읽은 바이트 수를 리턴.
			int readByteNo = System.in.read(bytes);
			// 배열을 문자열로 전환.
			String str = new String(bytes, 0, readByteNo-2); // 입력 후, 엔터 시, /r (캐리지 리턴) ,/n (라인피드)가 입력되므로, 이를 제거하기 위해 -2
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
