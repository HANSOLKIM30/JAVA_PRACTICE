package chapter08;

// 인터페이스 배열을 통한 구현 객체 관리(필드)
public class Car2 {

	Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
