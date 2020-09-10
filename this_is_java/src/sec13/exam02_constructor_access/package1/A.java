package sec13.exam02_constructor_access.package1;

public class A {

	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자
	public A(boolean b) {}	// public 접근제한
	A(int b){}	// default 접근제한 (생성자를 선언할 때 public 혹은 private 선언을 하지 않으면 default가 된다.)
	private A(String s) {}	// private 접근제한
}
