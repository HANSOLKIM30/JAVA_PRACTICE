package chapter11;

import java.util.StringTokenizer;

// java.util.StringTokenizer(text, 구분자): 한 종류의 문자로 구분되어 있을 경우 사용하기 좋음.
// countToken / hasToken / NextToken 메서드를 사용하여 토큰을 추출
public class StringTokenizerExample {
	public static void main(String[] args) {
		
		String text = "홍길동/이수홍/박연수";
		
		// how1: 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken(); 	// 토큰 꺼내오기.
			System.out.println(token);
		}
		
		System.out.println();
		
		// how2: 남아 있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
