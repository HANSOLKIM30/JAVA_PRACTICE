package chapter11;
// 주민등록번호에서 남자와 여자를 구분하는 방법
public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		
		// charAt → 매개 변수만큼의 인덱스에 있는 char 리턴
		char sex = ssn.charAt(7);
		
		// switch에서 case가 여러 개일 경우, 아래와 같이 처리
		switch(sex) {
			
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}
}
