package package2;

import package1.A;

public class D extends A {

	public D() {	// new 연산자를 사용하여 부모 객체를 불러올 수 없고, super 생성자를 통해서만 접근 가능.
		super();
		this.field = "value";
		this.method();
	}
}
