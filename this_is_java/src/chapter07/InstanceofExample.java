package chapter07;
// 강제형변환 전 객체타입 확인.
public class InstanceofExample {
	public static void method1(CastingParent parent) {
		if(parent instanceof CastingChild) {	// parent 매개변수의 객체가 CastingParent 객체로 자동형변환 된 CastingChild 객체라면,
			CastingChild child = (CastingChild) parent;	// CastingChild로 강제형변환 가능.
			System.out.println("method1 - 자식클래스로 변환 성공");
		} else {
			System.out.println("method1 - 자식클래스로 변환되지 않음");
		}
	}
	
	public static void method2(CastingParent parent) {
		CastingChild child = (CastingChild) parent;
		System.out.println("method2 - 자식클래스로 변환 성공");
	}
	
	public static void main(String[] args) {
		// CastingChild 객체를 매개값으로 전달.
		CastingParent parentA = new CastingChild();	// 부모 클래스로 자동형변환.
		method1(parentA);
		method2(parentA);
		
		// CastingParent 객체를 매개값으로 전달.
		CastingParent parentB = new CastingParent();	// 부모 클래스로 자동형변환.
		method1(parentB);
		method2(parentB);	// 예외발생. CastException.
	}
}
