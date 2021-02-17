package chapter09;

public class CalculatableAnonymous {

	private int field;
	
	public void method(final int arg1, int arg2) {
		
		/*
		 * final 명시한 매개변수 / 로컬변수는 클래스 내부 메소드의 로컬변수로 저장 
		 * final 명시하지 않은 매개변수 / 로컬변수는 필드로 저장
		 */		
		final int var1 = 0;
		int var2 = 0;
		
		this.field = 10;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				// field → 로컬 클래스에서는 바깥 클래스의 필드 및 메소드 자유롭게 사용 가능.
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
