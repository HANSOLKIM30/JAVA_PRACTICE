package chapter11;

import java.text.MessageFormat;

/*
 * [Format]
 * 1. DecimalFormat
 * 2. SimpleDateFormat
 * **3. MessageForamy
 */
// 매개 변수화된 문자열 형식: 1. 데이터를 파일에 저장 / 2. 네트워크 전송 / 3. sql문 작성
public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "java";
		String name = "김한솔";
		String tel = "010-123-4567";
		
		String text = "회원 ID: {0} \n회원 이름: {1} \n회원전화: {2}";
		// 정적 메소드이기 때문에 객체를 만들어주지 않아도 된다.
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert int member values( {0}, {1}, {2} )";
		Object[] arguments = new Object[] {"java", "신용권", "010-890-1234"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		System.out.println();
	}
}
