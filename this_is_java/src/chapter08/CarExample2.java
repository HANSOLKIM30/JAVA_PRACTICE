package chapter08;

//인터페이스 배열을 통한 구현 객체 관리(필드) - 테스트
public class CarExample2 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}
