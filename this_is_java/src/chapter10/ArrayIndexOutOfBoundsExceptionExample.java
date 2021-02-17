package chapter10;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		// ArrayIndexOutOfBoundsException예방: 배열을 읽기 전에 배열의 길이를 먼저 조사.
		if(args.length == 2) {
		
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]:" + data1);
			System.out.println("args[1]:" + data2);
		} else {
			
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsException ");
			System.out.println("값1 값2");
		}
	}
}
