package chapter10;

// 자동 리소스 닫기 - AutoClosable 구현클래스
public class FileInputStream implements AutoCloseable{

	/*
	 * try-with-resource문을 사용하면, 1. try 블록이 정상적을 끝났거나, 2. 예외가 발생했을 때, 리소스 객체(여기서는 데이터를 읽고 쓰는 객체라고 한정.)를 안전하게 닫는 close() 메소드를 반드시 실행시킨다.
	 * 단, 조건이 있는데 이는 적용시킬 리소스 객체가 AutoClosable 인터페이스를 구현하고 있어야 한다는 것.
	 * 어떤 리소스 객체가  Autoclosable 인터페이스를 구현하고 있는지는  API 도큐먼트 - Closable Interface - All known Implementing Classes에서 확인 가능함.
	 */
	
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
