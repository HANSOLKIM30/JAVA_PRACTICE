package chapter09;
// 로컬 클래스에서 사용 제한
public class Outter {

	// 자바 7 이전: 로컬 클래스에서 사용된 매개 변수 및 로컬 변수에 final 선언을 해야 컴파일 오류 발생하지 않음.
	// → final 속성을 자동으로 부여하지 않아 수동을 final을 입력해야 클래스의 필드 및 로컬 변수로 복사해도 값 변화가 일어나지 않기 때문.
	public void method1(final int arg) {
		
		// 본래 로컬 변수(localVariable) 및 매개 변수(arg)는 스택 영역에 등록되어 메서드가 끝나고 나면 소멸됨. → 방지를 위해 이너 클래스가 힙 영역에 등록될 때 복사.
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후: 자동으로 final 속성 부여. 
	// 수동으로 final이 붙은 매개 변수 및 로컬 변수 → 중첩 클래스가 등록될 때 로컬 변수로 등록됨.
	// 자동으로 final 처리된 매개 변수 및 로컬 변수 → 중첩 클래스가 등록될 때 필드로 등록됨.
	public void method2(int arg) {
		int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
