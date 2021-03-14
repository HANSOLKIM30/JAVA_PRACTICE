package chapter14;

// Final 특성을 가지는 로컬 변수
public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		//arg = 31;	// final 특성 떄문에 수정 불가.
	    //WlocalVar = 41;	// final 특성 떄문에 수정 불가.
		
		// 람다식
		MyFunctionalInterface fi = () -> {
			// 로컬 변수 읽기
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		
		fi.method();
	}
}
