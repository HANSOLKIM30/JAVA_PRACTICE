package chapter13;
// Box 클래스
// 제네릭 타입에 사용되는 타입 파라미터는 전역 변수처럼 사용 가능하다.
public class Box <T>{

	/*
	 * 비제네릭 타임
	 * private Object object; 
	 * public void set(Object object) {this.object = object;}
	 * public Object get() {return this.object;}
	 */
	
	/* 
	 * 제네릭 타입
	 * <효과>
	 * 1. 컴파일 시 더 강한 타입 체크
	 * 2. 타입 변환 X → 잦은 타입 변환은 어플리케이션의 성능 저하를 초래한다.
	 * 생성자에서 T 타입을 구현함.
	 */
	
	private T t;
	
	public void set(T t) { 
		this.t = t; 
	}
	
	public T get() { 
		return this.t; 
	}
}
