package chapter11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 문자열 → Date 관련 객체: parse
public class DateTimeParsingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		// String의 패턴을 파악해서 DateTimeFormatter 패턴으로 등록
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);
	}
}
