package chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;
// 현재 날짜를 출력하기
public class DateExample {
	public static void main(String[] args) {
		// 컴퓨터의 현재 ***날짜***를 읽어 Date 객체로 만듦.
		// 현재는 new Date() 생성자만 주로 사용
		// 문자열로 객체 정보를 얻고 싶다면 toString();
		// 특정 문자열 포멧으로 얻고 싶다면 *****java.text.SimpleDateFormat***** 사용
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
