package chapter11;
// 앞뒤 공백 제거: trim() → 기존의 문자열을 변경하는 것이 아닌, 새로운 String 객체 생성
// 중간의 공백은 제거하지 않는다.
public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "   02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}
