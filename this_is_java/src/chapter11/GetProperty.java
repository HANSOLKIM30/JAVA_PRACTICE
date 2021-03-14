package chapter11;

import java.util.*;

// 시스템 프로퍼티 읽기
public class GetProperty {

	public static void main(String[] args) {
		
		// 개별 솟성 읽기: getProperty
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈 디렉토리: " + userHome);
		
		System.out.println("---------------------");
		System.out.println("[key] value");
		System.out.println("---------------------");
		// 모든 속성의 키와 값을 출력: getProperties
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "] " + value);
		}
	}
}
