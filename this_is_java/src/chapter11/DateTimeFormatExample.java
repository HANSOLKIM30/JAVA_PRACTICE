package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Date 객체 → String: format
public class DateTimeFormatExample {
	public static void main(String[] args) {
		// 현재 시각
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
