package chapter11;
// 문자열 분리
// String.split(정규표현식): 정규표현식을 사용하여 특정 문자를 기준으로 분리 → 여러 문자들이 섞여있을 때 사용하면 좋음.
// StringTokenizer: 문자로 분리 가능.
public class StringSplitExample {

	public static void main(String[] args) {
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");	// 정규표현식 사용
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
