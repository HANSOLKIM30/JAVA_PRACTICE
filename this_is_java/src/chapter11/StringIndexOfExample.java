package chapter11;

// 문자열 포함 여부 조사: indexOf(String string)
// 없으면 -1 리턴
public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);	// 해당 문자열이 시작하는 지점의 인덱스를 반환
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}	
	}
}
