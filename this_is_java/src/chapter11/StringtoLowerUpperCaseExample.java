package chapter11;
// 전부 소문자 혹은 대문자로 변경. toLowerCase(), toUpperCase()
// 비교 시, 소문자 및 대문자와 상관없이 비교: equalsIgnoreCase()
public class StringtoLowerUpperCaseExample {

	public static void main(String[] args) {
		// toLowerCase, toUpperCase 사용한다고 해도, 원래 String 객체가 변하는 것이 아님. → 새로운 객체 생성
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// equalsIgnoreCase: 대소문자와 상관없이 문자열 비교
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
