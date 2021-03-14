package chapter11;
// 문자열 대치하기: replace()
public class StringReplaceExample {

	public static void main(String[] args) {
		// String 객체는 변경될 수 없기 때문에, replace를 사용하여 만들어진 객체는 완전히 새로운 객체
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
