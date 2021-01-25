package package1;

// protected 접근제한자
// public --> 클래스, 생성자, 필드, 메서드 / 파일명과 클래스 명이 같아야 public 선언 가능.
// protected --> 생성자, 필드, 메서드 / 클래스에는 해당 접근제한자 사용 불가. 
// default --> 클래스, 생성자, 필드, 메서드
// private --> 생성자, 필드, 메서드 / 클래스에는 해당 접근제한자 사용 불가. 
public class A {

	protected String field;
	
	protected A() {}
	
	protected void method() {}
}
