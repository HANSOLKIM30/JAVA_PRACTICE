package chapter11;
/* 
 * StringBuilder에서 문자열 조작
 * 내부 버퍼에 문자열을 임시로 저장해두고 그 안에서 추가, 수정, 삭제한다.
 * Buffer: 데이터를 임시로 저장하는 메모리
 * StringBuiler: 단일 스레드 / StringBuffer: 스레드에 안전
*/
public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();	// 버퍼 생성(기본 16개 문자)
		
		sb.append("Java ");	// append: 문자열을 끝에 추가.
		sb.append("Program Study");
		System.out.println(sb.toString());	// 문자열로 변환하여 출력
		
		sb.insert(4, "2");	// 4번째 "문자 뒤"에 2를 삽입.
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');	// 4번째 "문자 뒤"의 문자를 6으로 변경.
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "book");	// 6번째 "문자 뒤"부터 13번째 문자까지를 Book으로 대치
		System.out.println(sb.toString());
		
		sb.delete(4, 5);	// 4번째 "문자 뒤"에서 5번째 문자까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자 수: " + length);
		
		String result = sb.toString();	// 버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);
	}
}
