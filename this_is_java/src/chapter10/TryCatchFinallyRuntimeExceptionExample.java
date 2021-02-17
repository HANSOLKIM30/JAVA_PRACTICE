package chapter10;
// 실행 예외 처리: 개발자가 직접 예외 처리
// java.lang.RuntimeException Class를 상속받는 모든 객체.
// RuntimeException Class 또한 Exception Class를 상속받는다.
public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		// 첫번째 예외처리
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {	//예외 처리를 위한 객체 생성 - 실행 예외 처리이므로, RuntimeExcetpion을 상속한 모든 class.
			System.out.println("args Length::::::::::" + args.length);
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsException ");
			System.out.println("값1 값2");			
			return;
		} 
		
		// 두번째 예외처리
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
