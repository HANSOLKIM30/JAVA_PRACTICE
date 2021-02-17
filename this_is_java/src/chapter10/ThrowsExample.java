package chapter10;

// 예외처리 떠넘기기: throws
public class ThrowsExample {
	/*
	 * 계속 throws로 넘기다가 최종 호출 시, try-catch로 처리하기. 
	 * 사실, main() 메소드에서도 throws가능하나, 이 경우 JVM에서 최종적으로 예외처리 후 프로그램 강제종료. 
	 * 바람직하지 못함.
	 */
	public static void main(String[] args) {
		
		// 호출 시 try-catch 블록으로 예외처리
		try {
			
			findClass();
		
		} catch (ClassNotFoundException e) {
			
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	// 예외 떠넘기기
	public static void findClass() throws ClassNotFoundException{
		
		Class clazz = Class.forName("java.lang.String2");
		
	}
}
