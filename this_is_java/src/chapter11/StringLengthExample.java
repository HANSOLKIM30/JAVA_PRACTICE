package chapter11;
// 문자열의 문자 수 얻기: length"()"
public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		// 기본타입은 == 사용, Object는 되도록 equals 사용! 
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}
