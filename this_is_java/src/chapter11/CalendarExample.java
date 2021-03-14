package chapter11;

import java.util.Calendar;
import java.util.TimeZone;

// 운영체제의 시간대를 기준으로 Calendar 얻기
public class CalendarExample {
	public static void main(String[] args) {
		// Calendar 클래스는 추상클래스로, 직접 구현하거나, getInstance 정적 메소드를 이용하여 현재 시스템의 시간대를 기준으로 한 Calendar 하위 객체를 얻을 수 있다.
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone);
		
		// Calendar now = Calendar.getInstance();	// getInstance는 보통 인스턴스가 있어야 하지만, 이 경우는 오버라이딩되어 사용 가능.
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		// 요일
		int week = now.get(Calendar.WEEK_OF_MONTH);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		
		System.out.print(hour + "시  ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	}
}
