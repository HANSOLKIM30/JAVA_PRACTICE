package chapter07;
// 자동 타입 변환 후의 멤버 접근
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; // 자동 타입 변환
		
		parent.method1();
		parent.method2(); // 자식 객체의 Overide된 메서드가 호출됨.
//		parent.method3();	호출 불가능.
		
		if(child == parent) {
			System.out.println("같은 객체입니다.");
		}
	}
}
