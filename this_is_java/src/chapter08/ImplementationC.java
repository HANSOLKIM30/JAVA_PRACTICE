package chapter08;

// 하위 인터페이스 구현
public class ImplementationC implements InterfaceC{
	
	// InterfaceC는 InterfaceA와 InterfaceB를 상속했으므로, 해당 인터페이스들의 실체 메소드도 있어야 한다.
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC 실행");
	}

}
