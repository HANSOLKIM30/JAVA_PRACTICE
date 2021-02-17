package chapter10;

// catch 블록의 순서: 상속받은 하위 예외가 상위 예외보다 앞서 위치해야 한다.
// 상속의 관계이 있으므로, 하위 예외는 상위 예외로 자동 타입 변환 가능. 
// 또한, catch문은 위에서 아래의 실행흐름을 가지고 있으므로 상위예외가 먼저 나올 경우 하위 예외보다 먼저 실행되어 하위예외는 실행조차 되지 않음.
public class CatchOrderExample {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			
		} catch (ArrayIndexOutOfBoundsException e) {	// 하위 클래스
			
			System.out.println("실행 매개값의 수가 부족합니다.");
			
		} catch(Exception e) {	// 예외 처리에 있어 가장 최상위 클래스: java.lang.Exception 일반예외, 실행예외(RuntimeException) 모두 이 클래스를 상속받는다.
			
			System.out.println("실행에 문제가 있습니다.");
			
		} finally {
			
			System.out.println("다시 실행하세요.");
		}

	}
}
