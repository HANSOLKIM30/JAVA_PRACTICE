package chapter09;
// 바깥 클래스 참조 얻기 - 실행 클래스
public class Outter2Example {
	public static void main(String[] args) {
		
		Outter2 outter = new Outter2();
		Outter2.Nested nested = outter.new Nested();
		nested.print();
	}
}
