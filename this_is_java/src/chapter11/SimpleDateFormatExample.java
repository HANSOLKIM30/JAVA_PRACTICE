package chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * [Format]
 * 1. DecimalFormat
 * **2. SimpleDateFormat
 * 3. MessageForamy
 */

// 날짜를 원하는 형식으로 출력
public class SimpleDateFormatExample {
	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		// a: 오전, 오후 / HH: 0~23시, hh: 1~12
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		// E: 요일
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		// D: 월 구분이 없는 일(1~365)
		sdf = new SimpleDateFormat("올 해의 D번째 날");
		System.out.println(sdf.format(now));
		
		// d: 월 구분이 있는 일
		sdf = new SimpleDateFormat("이 달의 d번째 날");
		System.out.println(sdf.format(now));
		
		// W: 월의 몇번째 주
		sdf = new SimpleDateFormat("이 달의 W번째 주");
		System.out.println(sdf.format(now));
		
		// w: 년의 몇번째 주 
		sdf = new SimpleDateFormat("올 해의 w번째 주");
		System.out.println(sdf.format(now));
		
		// K: 0~11, k: 1~24
	}
}
