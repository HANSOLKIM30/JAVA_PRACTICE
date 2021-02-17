package chapter10;

// 자동 리소스 닫기 - AutoClosable 구현 클래스
public class TryWithResourceExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			
			fis.read();
			throw new Exception();	// 강제적으로 예외 발생시킴.
		
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
