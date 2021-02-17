package chapter10;

// 일반 예외 처리: 컴파일러가 예외 처리 할 것을 알려줌.
// java.lang.RuntimeException을 제외한 Exception Class를 상속받는 모든 Class가 해당.
public class TryCatchFinallyException {

	public static void main(String[] args) {
		
		try {
			
			Class clazz = Class.forName("java.lang.String2");
			
		} catch (ClassNotFoundException e) {	// 예외 처리를 위한 객체 생성 - 일반 예외 처리이므로, RuntimeExcetpion을 제외한, Exception을 상속한 모든 class.	 
			
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
	
}
