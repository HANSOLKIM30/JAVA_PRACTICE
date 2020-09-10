package chapter05;

public class EnumMethodExample {
	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;	// 메서드 영역의 열거상수를 힙 영역의 참조변수에 복사.
		String name = today.name();
		System.out.println(name);
		 
		 //ordinal() 메소드(순서 수 구하기)
		 int ordinal = today.ordinal();
		 System.out.println(ordinal);
		 
		 //compareTo() 메소드(day1이 day2 기준으로 몇 번째 앞 / 뒤에 위치해 있는지 리턴)
		 Week day1 = Week.MONDAY;
		 Week day2 = Week.WEDENSDAY;
		 int result1 = day1.compareTo(day2);
		 int result2 = day2.compareTo(day1);
		 System.out.println(result1);
		 System.out.println(result2);
		 
		//valueOf() 메소드(입력한 문자열과 동일한 문자열을 가지고 있는 열거객체 리턴)
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요.");
			} else {
				System.out.println("평일 이군요.");
			}
		}
	
		//values() 메소드(배열로 변환)
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
