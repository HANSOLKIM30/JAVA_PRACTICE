package chapter09;

// 익명 객체의 로컬 변수 사용
public interface Calculatable {

	/*
	 * 메소드의 매개 변수 / 로컬 변수 → stack 메모리 저장 → 사용 후 소멸. 
	 * 클래스 → heap 메모리에 저장 → 계속 사용 가능.
	 * 익명 객체도 일종의 클래스이기 때문에 heap 메모리에 저장됨.→ 익명 객체가 메소드의 매개 변수 / 로컬 변수를 사용 시, 추후에는 사라져서 오류 발생. → 해당 요소를 클래스에 복사하여 사용
	 */ 
	public int sum();
}
