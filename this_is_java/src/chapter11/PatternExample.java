package chapter11;

import java.util.regex.Pattern;

// 문자열 검증하기: 전화번호와 이메일
public class PatternExample {

	public static void main(String[] args) {
		// 어떤 데이터인지, 있는지 없는지(?/*/+), 몇 개인지, 순서로 쓰여짐.
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
