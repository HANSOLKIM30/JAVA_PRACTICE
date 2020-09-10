package chapter05;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;	// 스택영역에 생성되는 참조변수. 
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;	// 열거상수 Week.SUNDAY를 통해, 열거객체의 주소값을 참조변수에 복사.
				break;
			
			case 2:
				today = Week.MONDAY;
				break;
				
			case 3:
				today = Week.TUESDAY;
				break;
				
			case 4:
				today = Week.WEDENSDAY;
				break;
				
			case 5:
				today = Week.THURSDAY;
				break;
				
			case 6:
				today = Week.FRIDAY;
				break;
				
			case 7:
				today = Week.SATURDAY;
				break;
				
		}

		System.out.println("오늘 요일: " + today);	// 열거객체의 주소값 자체가 열거상수와 동일?
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
}
