package chapter11;

import java.io.UnsupportedEncodingException;

// 바이트 배열로 변환: getBytes()
// 문자열을 암호화하거나, 네트워크를 이용하여 문자열을 전송할 때 바이트 코드 배열로 전달해야함.
public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		// 기본 문자셋으로 인코딩과 디코딩
		// 바이트 배열로 변환
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		// String 객체로 변환
		String str1 = new String(bytes1);
		System.out.println("bytes1 → String: " + str1);
		
		try {
			// EUC-KR을 이용하여 인코딩과 디코딩(한글: 2바이트 / 알파벳: 1바이트)
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2);
			System.out.println("bytes2 → String: " + str2);
			
			// UTF-8을 이용하여 인코딩과 디코딩(한글: 3바이트 / 알파벳: 1바이트)
			byte[] byte3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + byte3.length);
			String str3 = new String(byte3);
			System.out.println("bytes3 → String: " + str3);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
