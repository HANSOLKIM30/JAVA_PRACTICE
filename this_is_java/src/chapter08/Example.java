package chapter08;

public class Example {

	public static void main(String[] args) {
		// 구현객체
		ImplementationC impl = new ImplementationC();
		
		// 하위 인터페이스의 구현객체는 상위 인터페이스로 자동 타입 변환 가능
		InterfaceA ia = impl;
		// 상위 인터페이스로 자동 타입 변환했으므로, InterfaceA의 변수는 methodA()만 호출 가능.
		ia.methodA();	// 자동 타입 변환되었어도 하위 인터페이스의 구현객체에서 구현한 메소드가 호출됨.
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
